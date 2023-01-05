class A{
    /*`@def_type Nat = {int x | x >= 0};*/

    int/*`@ refinement_type Nat*/ x;

    void m(){
        //@maintaining i >= 0;
        for(int i = 0; i < 7; i = i + 1){
            //@assert x >= 0;
            x = i;
        }
    }
}