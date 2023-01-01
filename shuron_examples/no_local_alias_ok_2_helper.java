//これは修論で使う
//hogeSort(a)の部分は適当に置き換えて使う

class A{
    /*`@def_type SortArray = {int[] v | (\forall int i,j; 
        0 <= i && i < v.length && 0 <= j && j < v.length; i < j ==> v[i] < v[j])};
    */

    /*@requires (\forall int  i,j; 
       0 <= i && i < a.length && 0 <= j && j < a.length; i != j ==> a[i] != a[j]);
    */
    //@no_refinement_type
    int[]/*`@refinement_type SortArray*/sort(int[] a){

        a = hogeSort(a);//aをソートしたとする

        int[]/*`@refinement_type SortArray*/ local = new int[a.length];

        //@maintaining 0 <= index;
        //@maintaining (\forall int  i; 0 <= i && i < index; a[i] == local[i]);
        //@maintaining local.length == a.length;
        for(int index = 0; index < a.length; index = index + 1){
            local[index] = a[index];
        }
        return local;//localは他とエイリアスしていない配列なので、渡せる
    }

    //@requires (\forall int  i,j; 0 <= i && i < a.length && 0 <= j && j < a.length; i != j ==> a[i] != a[j]);
    //@ensures \result.length == \old(a.length);
    //@ensures (\forall int  i,j; 0 <= i && i < \old(a.length) && 0 <= j && j < \old(a.length); i < j ==> \result[i] < \result[j]);
    int[] hogeSort(int[] a){
        int x = 0;
    }
}