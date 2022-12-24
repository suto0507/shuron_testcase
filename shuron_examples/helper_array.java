class A{
    /*`@def_type NatArray = {int[] v | (\forall int i; 
        0 <= i && i < v.length; v[i] >= 0)};
    */

    int[]/*`@ refinement_type NatArray*/ nat_array;

    //これは正しい
    //@requires nat_array.length == 5;
    //@requires (\forall int i; 0 <= i && i < nat_array.length; nat_array[i] >= 0);
    //@helper
    void branch_alias_example(int x){
        int[]/*`@ refinement_type NatArray*/ local = new int[3];
        if(x < 0)local = nat_array;
        local[0] = -1;
        if(x > 0){
            local = new int[3];
        }
        local[0] = 1;
    }

    //これも正しい
    //@requires nat_array.length == 5;
    //@helper
    void method_call_example(int x){
        if(x < 0)nat_array[0] = -1;
        assign(x);
        if(x < 0)nat_array[0] = 1;
    }

    //@requires x < 0;
    //@assignable \nothing;
    //@also
    //@requires x >= 0;
    //@ensures nat_array.length == 5;
    //@ensures (\forall int i; 0 <= i && i < nat_array.length; nat_array[i] >= 0);
    //@assignable nat_array;
    //@helper
    void assign(int x){
        if(x >= 0){
            nat_array = new int[5];
        }
    }

    


}