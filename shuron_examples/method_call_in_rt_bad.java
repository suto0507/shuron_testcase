class A{
    int/*`@refinement_type{int v | v >= get_x2()}*/ x1; 
    int x2;

    //@ensures \result == x2;
    int get_x2(){
        return x2;
    }
}