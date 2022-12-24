class A{
    //`@def_type SortArray = {int[] v | (\forall int i,j; 0 <= i && i < v.length && 0 <= j && j < v.length; i < j ==> v[i] < v[j])};

    //requires (\forall int i,j; 0 <= i && i < a.length && 0 <= j && j < a.length; i != j ==> a[i] != a[j]);
    int[]/*`@refinement_type SortArray*/sort(int[] a){

        hogehoge;//aをソートしたとする

        //これならできる
        B b = new B(length);
        int[]/*`@refinement_type SortArray*/ local = b.sortArray;
        for(int i = 0; i < a.length; i++){
            local[i] = a[i];
        }
        return local;
    }
}

class B{

    public int[]/*`@refinement_type SortArray*/ sortArray;

    //コンストラクタの中だったらSortArrayを満たせるようなものも作れる
    B(int length){
        sortArray = new int[length];
        for(int i = 0; i < a.length; i++){
            sortArray[i] = Integer.MAX_VALUE - i + 1;
        }
    }

}