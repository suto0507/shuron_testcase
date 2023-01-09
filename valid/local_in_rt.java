class A{
    final int x = 40;
    int /*@refinement_type {int v | v > x}*/ y;

    test(){
        int /*@refinement_type {int v | v > x}*/ z = 41;
        y = 41;
        final int x = 56;
        y = 42;
        z = 42;
    }
}