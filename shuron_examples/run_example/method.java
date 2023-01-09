///述語で呼び出すメソッドは単純に足すだけ　大丈夫な例とそうではアに例


class A{
    int/*`@refinement_type{int v | plus(v, 1) >= 7}*/ x1; 

    void invalid_m(){
        x1 = 7;
        x1 = 1;
    }


    //@ensures \result == a + b;
    //@pure helper
    int plus(int a, int b){
        return a + b;
    }
}