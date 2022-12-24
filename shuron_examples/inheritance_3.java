class A{
    int m(
            final int/*`@ refinement_type {int x | x >= 2}*/ x,
            int/*`@ refinement_type {int y | y < 2}*/ y){
		return 11;
	}
}

class B extends A{
    int m(
            final int/*`@ refinement_type {int x | x >= 0}*/ x,
            int/*`@ refinement_type {int y | y < x}*/ y){
		return 11;
	}
}