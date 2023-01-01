class A{
    /*`@def_type DiffArray = {int[] v | (\forall int i,j; 
        0 <= i && i < v.length && 0 <= j && j < v.length; i != j ==> v[i] != v[j])};
    */

    //@requires 0 < i1 && 0 < i2;
    //@requires array.length > i1 && array.length > i2;
    //@no_refinement_type
    void swap(int i1, int i2, int[]/*`@refinement_type DiffArray*/ array){
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}