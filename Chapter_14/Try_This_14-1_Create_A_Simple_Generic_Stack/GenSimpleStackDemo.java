/*
    Try This 14-1

    Demonstrate a simple generic stack class.

*/

class GenSimpleStackDemo {

  public static void main(String[] args) {

    int i;
    Integer[] nums = new Integer[5];
    String[] strs = new String[3];

    // first create a stack for integers
    GenSimpleStack<Integer> intStack = new GenSimpleStack<Integer>(nums);

    System.out.println("Demonstrating Integer stack.");

    // use intStack
    try {

      System.out.print("Pushing: ");
      // Push integers onto intStack
      for (i = 0; !intStack.isFull(); i++) {
 
        System.out.print(i);
        intStack.push(i);

      }

      System.out.println();

      // pop integers off intStack
      System.out.print("Popping: ");
      while (!intStack.isEmpty())
        System.out.print(intStack.pop());

      System.out.println();
    
    } catch (StackFullException exc) {

      System.out.println(exc);

    } catch (StackEmptyException exc) {
 
      System.out.println(exc);

    }

    // next, create a stack for strings
    GenSimpleStack<String> strStack = new GenSimpleStack<String>(strs);

    System.out.println("\nDemonstrating String stack.");

    // noew, use strStack
    try {

      System.out.println("Pushing: alpha beta gamma");

      // push strings onto strStack
      strStack.push("alpha");
      strStack.push("beta");
      strStack.push("gamma");

      // pop Strings off strStack
      System.out.print("Popping: ");
      while (!strStack.isEmpty())
        System.out.print(strStack.pop() + " ");

      System.out.println();

    } catch (StackFullException exc) {

      System.out.println(exc);

    } catch (StackEmptyException exc) {

      System.out.println(exc);

    }    System.out.println();

  }

}
