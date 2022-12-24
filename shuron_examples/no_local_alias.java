class A{
    //`@def_type SortArray = {int[] v | (\forall int i,j; 0 <= i && i < v.length && 0 <= j && j < v.length; i < j ==> v[i] < v[j])};

    //@requires (\forall int i,j; 0 <= i && i < a.length && 0 <= j && j < a.length; i != j ==> a[i] != a[j]);
    int[]/*`@refinement_type SortArray*/sort(int[] a){
        //ローカル変数と篩型を持った配列がエイリアスできないとする

        hogehoge;//aをソートしたとする
        //でもaに篩型は付いていないので、return a;とは書けない

        //では篩型を持ったローカル変数を用意して、↓のようにする？
        int[]/*`@refinement_type SortArray*/ local = {Integer.MAX_VALUE-(a.length-1), ...., Integer.MAX_VALUE};
        //↑これどうやる？？？？　コンストラクタ使えばできなくもない
        for(int i = 0; i < a.length; i++){
            local[i] = a[i];
        }
        return local;
    }

    //@requires (\forall int i,j; 0 <= i && i < a.length && 0 <= j && j < a.length; i != j ==> a[i] != a[j]);
    //@ensures (\forall int i,j; 0 <= i && i < a.length && 0 <= j && j < a.length; i < j ==> a[i] < v[j]);
    void hogeSort(int[] a){
        int x = 0;
    }
}