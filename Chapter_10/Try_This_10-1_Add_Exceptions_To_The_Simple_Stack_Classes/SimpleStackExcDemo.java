// Demonstrate the stack exceptions/
class SimpleStackExcDemo {

  public static void main(String[] args) {

    FixedLengthStack stack = new FixedLengthStack(5);
    char ch;
    int i;

    try {

      // overrun the stack
      for (i = 0; i < 6; i++) {
        System.out.print("Attempting to push: " +
                           (char) ('A' + i));
        stack.push((char) ('A' + i));
        System.out.println(" - OK");

      }
      System.out.println();

    }
    catch (StackFullException exc) {

      System.out.println(exc);

    }
    
    System.out.println();

    try {

      // over-empty the stack
      for (i = 0; i < 6; i++) {
        System.out.print("Popping next char: ");
        ch = stack.pop();
        System.out.println(ch);
      }
    }
    catch (StackEmptyException exc) {

      System.out.println(exc);

    }

  }

}
