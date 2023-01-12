class A{
    int x;
}

class B extends A{

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

    //@ensures x == \result;
    //@pure helper
    int hoge(){
        //@assert false;
        return x;
    }

}