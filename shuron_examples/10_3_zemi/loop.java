public class twoLoopTest {
	//@requires a.length<100;
	void twoLoop(int[] a) {
	    //@ loop_invariant 0 <= i <= a.length;
	    for (int i=0; i < a.length; i++) {
	      //@ loop_invariant 0 <= j <= i;
	      for (int j = 0; j < i; j++) {
	    	  int x = a[j];
	      }
	    }
	  }
}

public class twoLoopTest {
	//@requires a.length<100;
	void twoLoop(int[] a) {
	    //@ loop_invariant 0 <= i <= a.length;
	    for (int i=0; i < a.length; i++) {
	      //@ loop_invariant 0 <= j <= i;
	      for (int j = 0; j < i; j++) {
	    	  int ii = i;
	    	  i = ii;
	    	  int x = a[j];
	      }
	    }
	  }
}

public class twoLoopTest {
	//@requires a.length<100;
	void twoLoop(int[] a) {
	    //@ loop_invariant 0 <= i <= a.length;
	    for (int i=0; i < a.length; i++) {
          //@ loop_invariant 0 <= i <= a.length;
	      //@ loop_invariant 0 <= j <= i;
	      for (int j = 0; j < i; j++) {
	    	  int ii = i;
	    	  i = ii;
	    	  int x = a[j];
	      }
	    }
	  }
}