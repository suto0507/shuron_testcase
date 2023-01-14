class A{
    int x;
    int y;
    A a;

    //@requires this == a;
    void test2(){
        x = 5;
        a.x = 8;
        assign2(0);
        //@assert x == 5;
        //@assert a.x == 8;
    }

    //@ requires arg >= 0;
    //@ assignable x;
    //@also
    //@ requires arg <= 0;
    //@ assignable a.x;
    void assign2(int arg){
        if(arg >= 0){
            x = 1;
        }
        if(arg <= 0){
            a.x = 1;
        }
    }
}

class B{
    int[] x;
    int[] y;
    //@invariant x.length == 10;
    //@invariant y.length == 10;
    
    //@requires x == y;
    void test3(){
        x[0] = 5;
        y[0] = 8;
        assign3(0);
        //@assert x[0] == 5;
        //@assert y[0] == 8;
    }

    //@ requires arg >= 0;
    //@ assignable x[0];
    //@also
    //@ requires arg <= 0;
    //@ assignable y[0];
    void assign3(int arg){
        if(arg >= 0){
            x[0] = 1;
        }
        if(arg <= 0){
            y[0] = 1;
        }
    }
}