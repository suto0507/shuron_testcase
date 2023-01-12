class A{
}

class B extends A{
    int x;

    //@invariant x > 0;

    void test(){
        x = 10;
    }
}


class A2{
    int x;
}

class B2 extends A2{
    int y;
    //@invariant hoge() > 0;

    void test(){
        x = 10;
        y = 10;
    }

    //@ensures y == \result;
    //@pure helper
    int hoge(){
        return y;
    }

}