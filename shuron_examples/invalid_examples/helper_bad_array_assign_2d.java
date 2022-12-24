class A{
    /*`@def_type NatArray2d = {int[] v | (\forall int i,j; 
        0 <= i && i < v.length && 0 <= j && j < v[i].length; v[i][j] >= 0)};
    */
    int[][]/*`@refinement_type NatArray2d*/ nat2d_array1;
    int[][]/*`@refinement_type NatArray2d*/ nat2d_array2;
    int[][]/*`@refinement_type NatArray2d*/ nat2d_array3;

    //@requires nat2d_array1.length > 0;
    //@requires nat2d_array1[0].length > 0;
    //@helper
    void helper_method(){
        nat2d_array1[0][0] = -1;
        nat2d_array2[0] = new int[5][4];
    }
}