class A{
	int/*`@ refinement_type {int x | x >= 0}*/ m(){
		return 1;
	}
}

class B extends A{
	int/*`@ refinement_type {Super_type x | x % 2 == 0}*/ m(){
		return 4;
	}
}