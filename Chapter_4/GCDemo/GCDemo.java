/*

  Try This 4-2

  Demonstrate garbage collection and the finalize() method.

*/

class MyClass {

  int x;

  MyClass(int i) {

    x = i;

  }

  // Called when object is recycled.
  protected void finalize() {

    System.out.println("Finalizing " + x);

  }

  // Generates an object that is immediately abandoned.
  
  void generate(int i) {

    MyClass o = new MyClass(i);

  }

}

class GCDemo {

  public static void main(String[] args) {
 
    MyClass ob = new MyClass(0);

    /* Now, generate a large number of objects. At
       some point, garbage collection will occur.
       Note: you might need to increase the number 
       of objects generated in order to force
       garbage collection. */

    for (int count = 1; count < 1000000000; count++)
      ob.generate(count);
 
  }

}
