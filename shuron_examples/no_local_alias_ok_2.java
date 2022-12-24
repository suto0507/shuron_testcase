class A{
    /*`@def_type SortArray = {int[] v | (\forall int i,j; 
        0 <= i && i < v.length && 0 <= j && j < v.length; i < j ==> v[i] < v[j])};
    */

    /*@requires (\forall int  i,j; 
       0 <= i && i < a.length && 0 <= j && j < a.length; i != j ==> a[i] != a[j]);
    */
    int[] /*`@refinement_type SortArray*/ sort(int[] a){

        //これならできる
        B b = new B(a);
        int[]/*`@refinement_type SortArray*/ local = b.sortArray;

        return local;
    }
}

//厳密にはB()も書かないといけないのだが、そこまでは実装していない
class B{
    /*`@def_type SortArray = {int[] v | (\forall int i,j; 
        0 <= i && i < v.length && 0 <= j && j < v.length; i < j ==> v[i] < v[j])};
    */
    int[] /*`@refinement_type SortArray*/ sortArray;

    //コンストラクタの中だったらSortArrayを満たせるようなものも作れる
    //事前条件は外す　Bの検証のためには必要
    
    /*requires (\forall int  i,j; 
       0 <= i && i < a.length && 0 <= j && j < a.length; i < j ==> a[i] < a[j]);
    */
    B(int[] a){
        //aをソートしたとする

        sortArray = new int[a.length];
        //@maintaining 0 <= i;
        //@maintaining (\forall int  j; 0 <= j && j < i; sortArray[j] == a[j]);
        //@maintaining sortArray.length == a.length;
        for(int i = 0; i < a.length; i = i + 1){
            sortArray[i] = a[i];
        }
    }

    
}