class A{
    /*`@def_type Nat = {int x | x > 0};*/
    /*`@def_type NatEven = {Nat x | x % 2 == 0};*/
    /*`@def_type NatOdd = {Nat x | x % 2 == 1};*/

    int/*`@refinement_type Nat*/ simple_m(int/*`@refinement_type NatEven*/ x){
		return 7;
	}
}

class B_valid extends A{
    int/*`@refinement_type NatEven*/ simple_m(int/*`@refinement_type Nat*/ x){
		return 8;
	}
}

class B_invalid extends A{
    int/*`@refinement_type NatEven*/ simple_m(int/*`@refinement_type NatOdd*/ x){
		return 6;
	}
}