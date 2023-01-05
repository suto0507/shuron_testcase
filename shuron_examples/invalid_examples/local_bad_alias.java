class A{
    /*`@def_type NatArray = 
        {int[] v | (\forall int i; 0<=i && i<v.length; v[i]>=0)};
    */
    int[]/*`@refinement_type NatArray*/ nat_array1;
    int[]/*`@refinement_type NatArray*/ nat_array2;

    void invalid_alias(){
        int[] local = nat_array1;
        nat_array2 = local;
    }

    void valid_alias(){
        nat_array2 = nat_array1;
    }
}