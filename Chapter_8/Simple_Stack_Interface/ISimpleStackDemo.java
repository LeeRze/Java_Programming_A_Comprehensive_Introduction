// Demonstrate ISimpleStack.
class ISimpleStackDemo {

  public static void main(String[] args) {

    int i;
    char ch;
  
    // create an ISimpleStack interface variable
    ISimpleStack iStack;

    // Now, construct a FixedLengthStack and a DynamicStack
    FixedLengthStack fixedStack = new FixedLengthStack(10);
    DynamicStack dynStack = new DynamicStack(5);

    // first, use fixedStack through iStack
    iStack = fixedStack;

    // push characters onto fixedStack
    for (i = 0; !iStack.isFull(); i++)
      iStack.push((char) ('A'+i));

    // pop characters off fixedStack
    System.out.print("Contents of fixedStack: ");

    while (!iStack.isEmpty()) {
 
      ch = iStack.pop();
      System.out.print(ch);
 
    }

    System.out.println();

    // next, use dynStack through iStack
    iStack = dynStack;

    // push A through Z onto dynStack
    // this will result in three increases in its size
    for (i = 0; i < 26; i++)
      iStack.push((char) ('A'+i));

    // pop characters off dynStack
    System.out.print("Contents of dynStack: ");
    
    while (!iStack.isEmpty()) {

      ch = iStack.pop();
      System.out.print(ch);

    }

    System.out.println();

  }

}
