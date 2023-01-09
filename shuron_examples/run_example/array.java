//配列　エイリアスできている例とできてない例が並んだ感じ


class A{
    /*`@def_type NatArray = {int[] v | (\forall int i; 
        0 <= i && i < v.length; v[i] >= 0)};
    */
    /*`@def_type PosArray = {int[] v | (\forall int i; 
        0 <= i && i < v.length; v[i] > 0)};
    */

    int[]/*`@ refinement_type NatArray*/ nat_array1;
    int[]/*`@ refinement_type NatArray*/ nat_array2;
    int[]/*`@ refinement_type PosArray*/ pos_array;

    void array_alias(){
        nat_array1 = nat_array2;
        //nat_array1 = pos_array;
    }
}