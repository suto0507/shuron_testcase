class A{
	/*`@def_type Nat = {int x | x >= 0};*/
	/*`@def_type NatEven = {Nat x | x % 2 == 0};*/
	
	int/*`@ refinement_type Nat*/ m(int/*`@ refinement_type NatEven*/ a){
		return a * 2;
	}
}

class B extends A{
	/*`@override_refinement_type NatEven m(Nat a);*/
}