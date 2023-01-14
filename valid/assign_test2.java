class A{
    int x;
    A a;

    //@requires this == a;
    //@ assignable a.x;
    void test1(){
        x = 5;
        a.x = 8;
        assign1(1);
        assign1(-1);
    }

    //@ requires arg >= 0;
    //@ assignable x;
    //@also
    //@ requires arg <= 0;
    //@ assignable a.x;
    void assign1(int arg){
        if(arg > 0){
            x = 1;
        }
        if(arg < 0){
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
    //@assignable x[0];
    void test2(){
        x[0] = 5;
        y[0] = 8;
        assign2(1);
        assign2(-1);
    }

    //@ requires arg >= 0;
    //@ assignable x[0];
    //@also
    //@ requires arg <= 0;
    //@ assignable y[0];
    void assign2(int arg){
        if(arg > 0){
            x[0] = 1;
        }
        if(arg < 0){
            y[0] = 1;
        }
    }
}

class C{
    int[] x;
    int[] y;
    //@invariant x.length == 10;
    //@invariant y.length == 10;

    //@assignable x[0];
    void test3(){
        x[0] = 5;
        int[] local = x;
        local[0] = 8;
    }
}