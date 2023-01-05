class A{
    A a;
    final int[] array;

    /*`@def_type BadType1 = {int v | v > array[0]};*/
    /*`@def_type  OKType1 = {int v | v > array.length};*/
    /*`@def_type BadType2 = {A a | a.array[0] > 0};*/
    /*`@def_type  OKType2 = {A a | a.array.length > 0};*/
        
    //@requires array[0] == 7;
    //@requires array.length == 7;
    //@requires a.array[0] == 1;
    //@requires a.array.length == 1;
    void hoge(){
        //int/*`@refinement_type BadType1*/ x1 = 8;
        int/*`@refinement_type OKType1*/ x2 = 8;
        //A/*`@refinement_type BadType2*/ a1 = a;
        A/*`@refinement_type OKType2*/ a2 = a;
    }
}