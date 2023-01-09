//C:\Users\suto0\Documents\ラボ\shuron\testcases\shuron_examples\run_example\inheritance\A.java C:\Users\suto0\Documents\ラボ\shuron\testcases\shuron_examples\run_example\inheritance\B_valid.java C:\Users\suto0\Documents\ラボ\shuron\testcases\shuron_examples\run_example\inheritance\B_invalid.java -refinement_type_limmit 10
class A{
    /*`@def_type Nat = {int x | x > 0};*/
    /*`@def_type NatEven = {Nat x | x % 2 == 0};*/
    /*`@def_type NatOdd = {Nat x | x % 2 == 1};*/

    int/*`@refinement_type Nat*/ simple_m(int/*`@refinement_type NatEven*/ x){
		return 7;
	}
}