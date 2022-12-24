class A{
    /*`@def_type Nat = {int x | x >= 0};*/
        
	int/*`@ refinement_type Nat*/ m(){
		return 1;
	}
}

class B extends A{
	int/*`@ refinement_type {Nat x | x % 2 == 0}*/ m(){
		return 4;
	}
}