class A{
    int x;
    int y;
    A2 a2;

    void test1(){
        x = 5;
        y = 8;
        assign1(0);
        //@assert x == 5;
        //@assert y == 8;
    }

    //@ requires arg >= 0;
    //@ assignable x;
    //@also
    //@ requires arg <= 0;
    //@ assignable y;
    void assign1(int arg){
        if(arg > 0){
            x = 1;
        }
        if(arg < 0){
            y = 1;
        }
    }

    
    void test2(){
        //@assert a2 != this;
        x = 5;
        a2.x = 8;
        assign2(0);
        //@assert x == 5;
        //@assert a2.x == 8;
    }

    //@ requires arg >= 0;
    //@ assignable x;
    //@also
    //@ requires arg <= 0;
    //@ assignable a2.x;
    void assign2(int arg){
        if(arg > 0){
            x = 1;
        }
        if(arg < 0){
            a2.x = 1;
        }
    }
}

class A2{
    int x;
    int y;
}

class B{
    int[] x;
    boolean[] y;
    //@invariant x.length == 10;
    //@invariant y.length == 10;
    
    //@requires x != y;
    void test3(){
        x[0] = 5;
        y[0] = true;
        assign3(0);
        //@assert x[0] == 5;
        //@assert y[0] == true;
    }

    //@ requires arg >= 0;
    //@ assignable x[0];
    //@also
    //@ requires arg <= 0;
    //@ assignable y[0];
    void assign3(int arg){
        if(arg > 0){
            x[0] = 1;
        }
        if(arg < 0){
            y[0] = true;
        }
    }
}