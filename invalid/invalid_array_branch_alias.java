class A{
    //`@ def_type NatArray = {int[] x | (\forall int i; 0 <= i && i < x.length; x[i] >= 0)};
    
    int[]/*`@refinement_type NatArray*/ a;

    void test1(int x, int[] arg){
        int[] local = new int[4];
        if(x >= 0){
            local = arg;//localはエイリアスしている
        }

        if(x <= 0){
            //この条件ではlocalはエイリアスしていない
            //なので、localは篩型を持ったaとエイリアスできる
            a = local;
        }
    }

    void test2y(int x, int y, int[] arg){
        int[] local = new int[4];

        
        //@maintaining x <= 0 || y <= 0 ==> (\forall int i; 0 <= i && i < local.length; local[i] >= 0);
        for(int i = 0; x > i; i = i+1){
            //@maintaining x <= 0 || y <= 0 ==> (\forall int i; 0 <= i && i < local.length; local[i] >= 0);
            for(int j = 0; y > j; j = j+1){
                local = arg;
            }
        }
        //x > iの時にlocalはエイリアスしたという扱い
        if(x <= 0 || y <= 1){
            a = local;//これは許されるはず
        }
    }

    void test2x(int x, int y, int[] arg){
        int[] local = new int[4];

        
        //@maintaining x <= 0 || y <= 0 ==> (\forall int i; 0 <= i && i < local.length; local[i] >= 0);
        for(int i = 0; x > i; i = i+1){
            //@maintaining x <= 0 || y <= 0 ==> (\forall int i; 0 <= i && i < local.length; local[i] >= 0);
            for(int j = 0; y > j; j = j+1){
                local = arg;
            }
        }
        //x > iの時にlocalはエイリアスしたという扱い
        if(x <= 1 || y <= 0){
            a = local;//これは許されるはず
        }
    }

}