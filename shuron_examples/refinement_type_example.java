class Refinement_type_example{
    /*`@def_type Nat = {int x | x  >= 0 };*/
    /*`@def_type NatEven = {Nat x | x % 2 == 0};*/

    int /*`@refinement_type Nat */ nat1;
    int /*`@refinement_type {int x | x >= 0 } */ nat2;

    int /*`@refinement_type {int x | x >= y }*/ x;
    final int y;

    int /*`@refinement_type Nat */ method_example(int /*`@refinement_type Nat */ arg_nat){
        nat1 = arg_nat;
        return nat2;
    }
}