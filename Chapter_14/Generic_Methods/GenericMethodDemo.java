// Demonstrate a simple generic method.
class GenericMethodDemo {

  // Determine if the contents of two arrays are the same.
  static <T, V extends T> boolean arraysEqual(T[] x, V[] y) {

    // If array lengths differ, then the arrays differ.
    if (x.length != y.length) { return false;}

    for (int i = 0; i < x.length; i++)
      if (!x[i].equals(y[i])) { return false;} // arrays differ

    return true; // contents of arrays are equivalent

  }

  public static void main(String[] args) {

    Number[] nums = { 1, 2, 3, 4, 5};
    Integer[] nums2 = { 1, 2, 3, 4, 5};
    Integer[] nums3 = { 1, 2, 7, 4, 5};
    Integer[] nums4 = { 1, 2, 7, 4, 5, 6};

    if (arraysEqual(nums, nums))
      System.out.println("nums equals nums");

    if (arraysEqual(nums, nums2))
      System.out.println("nums equals nums2");

    if (arraysEqual(nums, nums3))
      System.out.println("nums equals nums3");

    if (arraysEqual(nums, nums4))
      System.out.println("nums equals nums4");

   // Create an array of Doubles
   Double[] dvals = { 1.0, 2.0, 3.0, 4.0, 5.0};
 
   if (arraysEqual(nums, dvals))
     System.out.println("nums equals dvals");
  
  // This won't compile because nums and dvals are not of the same type
  }

}
