//2.6の例　invalidっぽい例にしてしまってもいいかも

class A {
    /*`@def_type Nat = {int x | x >= 0};*/
	//@model int refinement_type Nat x_5;
	int x; //@ in x_5;
    //@represents x_5 = x + 5;
	
	void invalid_m (int a) {
        x = -5;
        x = -6;
	}
}