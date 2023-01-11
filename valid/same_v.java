class A{
    /*`@def_type Nat = {int x | x > 0};*/

    int/*`@ refinement_type Nat*/ x;

	//@ ensures \result > 0 && x > 0;
	int method1(){
		return x;
	}

}

class B extends A{
    int/*`@ refinement_type {int x | x % 2 == 0}*/ x;

	//@ ensures \result % 2 == 0 && x % 2 == 0;
	int method2(){
		return x;
	}
}

class A2{

    int x;

	//@ensures x > 0;
	//@assignable x;
	int method1(){
		x = 10;
		return x;
	}

}

class B2 extends A2{
    int x;

	
	int method2(){
		x = -1;
		method1();
		//@assert x == -1;
		////@assert false;
		return x;
	}
}

class A3{

    int x;

	//@ensures x > 0;
	//@assignable x;
	int method1(){
		x = 10;
		return x;
	}

}

class B3 extends A3{
    int x;

	//@also
	//@ensures super.x == 10;
	int method1(){
		super.x = 10;
		return x;
	}
	
	int method2(){
		x = -1;
		method1();
		//@assert x == -1;
		//@assert super.x == 10;
		////@assert false;
		return x;
	}
}