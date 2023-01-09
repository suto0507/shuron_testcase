class B extends A{
	

	int test(int/*`@ refinement_type Nat*/ x){
		return 2;
	}
	
	int test2(int/*`@ refinement_type Nat*/ x){
		return 4;
	}
	
	int test3(int/*`@ refinement_type Nat*/ x){
		return 10;
	}

	int test4(int/*`@ refinement_type Nat*/ x){
		return 12;
	}

    int test5(final int/*`@ refinement_type {int x | x > 0}*/ x, int/*`@ refinement_type {int y | y < x}*/ y){
		return 11;
	}
}