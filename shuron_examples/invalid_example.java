class A{
    /*`@def_type Nat = {int x | x >= 0};*/

    int/*`@ refinement_type Nat*/ x;

    void m(){
        x = x - 1;
    }
}