class A{
    /*`@def_type Nat = {int x | x >= 0};*/
	/*`@def_type NatEven = {Nat x | x % 2 == 0};*/
        
	int/*`@ refinement_type Nat*/ m(){
		return 1;
	}
}

class B extends A{
	int/*`@ refinement_type {NatEven x | x < 100}*/ m(){
		return 4;
	}
}