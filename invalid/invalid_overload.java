class A{

    void overload_test(){
        int x = hoge(771, true);
        //@assert x == 0;
    }

    //@ensures \result == 0;
    int hoge(){
        //@assert false;
        return 0;
    }
}