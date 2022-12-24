class A{
    /*`@def_type NatArray = 
        {int[] v | (\forall int i; 0<=i && i<v.length; v[i]>=0)};
    */
    int[]/*`@refinement_type NatArray*/ nat_array1;
    int[]/*`@refinement_type NatArray*/ nat_array2;

    //@requires nat_array1.length > 0;
    //@helper
    void helper_method(){
        nat_array1[0] = -1;
        nat_array1 = new int[5];
    }
}