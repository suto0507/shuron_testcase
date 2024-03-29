class A{
    //`@ def_type NatArray2 = {int[][] x | x[0][0] >= 0};

    int[][]/*`@ refinement_type NatArray2*/ nat_array2;

    //@requires nat_array2.length == 5;
    //@helper
    private void test2_m(int x){
        int[][]/*`@ refinement_type NatArray2*/ local2 = new int[3][3];
        assign(x, local2);
        if(x < 0)local2[0][0] = -1;
        if(x < 0)local2[0][0] = 1;
    }

    //@requires nat_array2.length == 5;
    //@requires nat_array2[0].length == 5;
    //@requires nat_array2[0][0] >= 0;
    //@helper
    private void test3_m(int x){
        int[][]/*`@ refinement_type NatArray2*/ local2 = new int[3][3];
        //@maintaining local2.length == 3;
        //@maintaining local2[0].length == 3;
        //@maintaining nat_array2[0][0] >= 0;
        //@maintaining local2[0][0] >= 0;
        for(int i = -100; i < x; i = i+1){
            assign(x, local2);
        }
        if(x < 0)local2[0][0] = -1;
        if(x < 0)local2[0][0] = 1;
    }

    //@requires nat_array2.length == 5;
    //@requires nat_array2[0].length == 5;
    //@requires nat_array2[0][0] >= 0;
    //@helper
    private void test4_m(int x){
        int[][]/*`@ refinement_type NatArray2*/ local2 = new int[3][3];
        //@maintaining local2.length == 3;
        //@maintaining local2[0].length == 3;
        //@maintaining nat_array2[0][0] >= 0;
        //@maintaining local2[0][0] >= 0;
        for(int i = -100; i < x; i = i+1){
            if(x <= 0)local2[0][0] = -1;
            if(x >= 0)assign(x, local2);
        }
        if(x <= 0)local2[0][0] = 1;
    }

    //@requires nat_array2.length == 5;
    //@requires nat_array2[0].length == 5;
    //@requires nat_array2[0][0] >= 0;
    //@helper
    private void test5_m(int x){
        int[][]/*`@ refinement_type NatArray2*/ local2 = new int[3][3];
        //@maintaining local2.length == 3;
        //@maintaining local2[0].length == 3;
        //@maintaining nat_array2[0][0] >= 0;
        for(int i = -100; i < x; i = i+1){
            local2[0][0] = -1;
            assign(x, local2);
        }
        if(x <= 0)local2[0][0] = 1;
    }

    //↓はただしい

    //@requires x < 0;
    //@assignable \nothing;
    //@also
    //@requires x >= 0;
    //@ensures nat_array2.length == 5;
    //@ensures nat_array2[0].length == 5;
    //@ensures nat_array2[0][0] >= 0;
    //@assignable nat_array2;
    //@helper
    private void assign(int x, int[][]/*`@ refinement_type NatArray2*/ local2){
        if(x >= 0){
            nat_array2 = new int[5][5];
        }
    }
}