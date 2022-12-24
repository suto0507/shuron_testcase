classA{
    int/*`@refinement_type{int v | v >= plus(1, 2)}*/ x1; 

    //@ensures \result == a + b;
    //@pure helper
    int plus(int a, int b){
        return a + b;
    }
}