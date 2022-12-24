class A{
    /*`@def_type NatArray = 
        {int[] v | (\forall int i; 0<=i && i<v.length; v[i]>=0)};
    */
    
    int[]/*`@refinement_type NatArray*/ rt_array;

    void m(int x, int[] arg){
        int[] local = new int[4];
        if(x > 0){
            local = arg;
        }

        if(x <= 0){
            rt_array = local;
        }
    }
}