class A2{
    int x;
    A2(int x){
        this.x = x;
    }
}


class B2 extends A2{
    B2(){
        super();
    }
}

class A3{
    /*`@ def_type Nat = {int x | x >= 0};*/
	
	int/*`@ refinement_type Nat*/ x;

    A3(){
        x = 771;
    }
}


class B3 extends A3{
    B3(){
        super();
        x = -771;
        x = 771;
    }
}