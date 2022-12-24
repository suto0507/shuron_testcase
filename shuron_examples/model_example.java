class model_refinement {
    /*`@def_type Nat = {int x | x >= 0};*/
	//@model int refinement_type Nat x;
	int /*`@refinement_type Nat*/ y; //@ in x;
    int /*`@refinement_type Nat*/ z; //@ in x;
    //@represents x = y - z;
	
	void hoge (int a) {
        z = y - z;
	}
}