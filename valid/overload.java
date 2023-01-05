class A{

    void overload_test(){
        int x = hoge(771);
        //@assert x == 771;
        x = hoge();
        //@assert x == 0;
    }


    //@ensures \result == x;
    int hoge(int x){
        return x;
    }

    //@ensures \result == 0;
    int hoge(){
        return 0;
    }
}