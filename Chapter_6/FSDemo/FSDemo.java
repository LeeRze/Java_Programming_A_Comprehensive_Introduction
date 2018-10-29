/* This class implements a "fail-soft" array which prevents
   runtime erros.
*/

class FailSoftArray{

  private int[] a;

  private int errval;

  public int length;

  /* Construct array given its size and the value to
     return if get() fails. */

  public FailSoftArray(int size, int errv) {

    a = new int[size];

    errval = errv;

    length = size;

  }

  // Return value at given index

  public int get(int index) {

    if (ok(index)) return a[index];

    return errval;

  }

  // Put a value at an index. Return false on failure.

  public boolean put(int index, int val) {

    if (ok(index)) {

      a[index] = val;
  
      return true;

    }

    return false;

  }

  // Return true if index is within bounds.

  private boolean ok(int index) {

    if (index >= 0 & index < length) return true;

    return false;

  }

}

class FSDemo {

  public static void main (String[] args) {

    FailSoftArray fs = new FailSoftArray(5,-1);

    int x;

    // Show quiet failures

    System.out.println("Fail quietly");

    for (int i = 0; i < (fs.length * 2); i++) 
      
      fs.put(i, i*10);

    for (int i = 0; i < (fs.length * 2); i++) {

      x = fs.get(i);

      if (x != -1) System.out.print(x + " "); 

    }

    System.out.println("");

    // Now handle failures

    System.out.println("\nFail with error reports.");

    for (int i = 0; i < (fs.length * 2); i++)

      if (!fs.put(i, i*10))
 
        System.out.println("Index " + i + " out-of-bounds");

    for (int i = 0; i < (fs.length * 2); i++) {

      x = fs.get(i);

      if (x != -1) System.out.print(x+" ");

      else

        System.out.println("Index " + i + " out-of-bounds");
  
    }

  }

}
