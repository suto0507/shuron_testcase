class B_invalid extends A{
    int/*`@refinement_type NatEven*/ simple_m(int/*`@refinement_type NatOdd*/ x){
		return 6;
	}
}