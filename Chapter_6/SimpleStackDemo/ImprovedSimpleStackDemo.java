/*
   Try This 5-2
   
   A simple stack class for characters.
*/

class SimpleStack {

  private char[] data; // this array holds the stack
  
  private int tos; // index of top of stack

  // Construct an empty stack given its size.

  SimpleStack(int size) {

    data = new char[size]; // create the array to hold the stack

    tos = 0;

  }

  // Push a character onto the stack

  void push(char ch) {

    if (isFull()) {

      System.out.println(" -- Stack is full.");

      return;

    }

    data[tos] = ch;

    tos++;

  }

  // Pop a character from the stack

  char pop() {

    if (isEmpty()) {
   
      System.out.println(" -- Stack is empty.");

      return (char) 0; // a placeholder value

    }

    tos--;

    return data[tos];

  }

  // Return true if the stack is empty
  
  boolean isEmpty() {

    return tos == 0;

  }

  // Return true if the stack is full.

  boolean isFull() {

    return tos == data.length;

  }

}

// Demonstrate the SimpleStack class.

class SimpleStackDemo {

  public static void main(String[] args) {

    int i;

    char ch;

    System.out.println("Demonstrate SimpleStack\n");

    // Construct 10-element empty stack.

    SimpleStack stack = new SimpleStack(10);

    System.out.println("Push 10 items onto a 10-element stack.");

    // Push the letters A through J onto the stack

    System.out.print("Pushing: ");

    for (ch = 'A'; ch < 'K'; ch++) {

      System.out.print(ch);

      stack.push(ch);

    }

    System.out.println("\nPop those 10 items from stack.");

    // Now, pop the characters off the stack.
    // Notice that order will be the reverse of those pushed.
    
    System.out.print("Poppint: ");

    for (i = 0; i < 10; i++) {

      ch = stack.pop();

      System.out.print(ch);

    }

    System.out.println("\n\nNext, use isEmpty() and isFull() " +
                       "to fill and empty the stack.");

    // Push the letters until the stack is full.

    System.out.print("Pushing: ");

    for (ch = 'A'; !stack.isFull(); ch++) {

      System.out.print(ch);

      stack.push(ch);

    }

    System.out.println();

    // Now, pop the characters off the stack until it is empty.

    System.out.print("Poppint: ");

    while (!stack.isEmpty()) {

      ch = stack.pop();
 
      System.out.print(ch);

    }

    System.out.println("\n\nNow, use a 4-element stack to generate" +
                       " some errors.");

    // Generate some errors.
    
    SimpleStack smallStack = new SimpleStack(4);

    // Attempt to push 5 characters onto a 4-character stack

    System.out.print("Pushing: ");

    for (ch = '1'; ch < '6'; ch++) {

      System.out.print(ch);

      smallStack.push(ch);

    }

    // Attempt to pop 5 elements from a 4-character stack.

    System.out.print("Poping: ");

    for (i = 0; i < 5; i++) {

      ch = smallStack.pop();

      System.out.print(ch);

    }

  }

}
