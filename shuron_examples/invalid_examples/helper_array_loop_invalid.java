class A{
    /*`@def_type NatArray = {int[] v | (\forall int i; 
        0 <= i && i < v.length; v[i] >= 0)};
    */

    int[]/*`@ refinement_type NatArray*/ nat_array;

   //@requires nat_array.length == 5;
    //@requires (\forall int i; 0 <= i && i < nat_array.length; nat_array[i] >= 0);
    //@helper
    void loop_alias_example(int x){
        int[]/*`@ refinement_type NatArray*/ local = new int[3];

        //@maintaining (\forall int i; 0 <= i && i < local.length; local[i] >= 0);
        //@maintaining local.length > 0;
        for(int i = 0; i < x; i = i + 1){
            local[0] = -1;
            local = nat_array;
        }
    }
}