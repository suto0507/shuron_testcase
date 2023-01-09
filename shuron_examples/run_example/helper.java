//swapの例でいいか　正しい例
//出力が横に長すぎたので簡素バージョン

class A{
    //`@def_type DiffTwo = {int[] v | v.length==2 && v[0] != v[1]};

    //@no_refinement_type
    void swap(int[]/*`@refinement_type DiffTwo*/ array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
}