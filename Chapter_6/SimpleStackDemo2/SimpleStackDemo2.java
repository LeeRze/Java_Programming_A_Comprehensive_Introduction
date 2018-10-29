/*
   Try This 6-2
   
   Add overloaded constructors to SimpleStack.
*/

class SimpleStack {

  // The following members are now private

  private char[] data; // this array holds the stack
  
  private int tos; // index of top of stack

  // Construct an empty stack given its size.

  SimpleStack(SimpleStack otherStack) {

    // size of new stack equals that of otherStack

    data = new char[otherStack.data.length];

    // set tos to the same position

    tos = otherStack.tos;

    // copy the contents

    for (int i = 0; i < tos; i++)
 
      data[i] = otherStack.data[i];

  }

  SimpleStack(char[] chrs) {

    //create the array to hold the initial values

    data = new char[chrs.length];
  
    tos = 0;

    // initialize the stack by pushing the contents
    // of chrs onto it
    
    for (char ch : chrs)
   
       push(ch);

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

// Demonstrate the overloaded SimpleStack class constructors.

class SimpleStackDemo2 {

  public static void main(String[] args) {

    int i;

    char ch;

    char[] chrs = { 'A', 'B', 'C', 'D' };
  
    // Initialize stack1 with chrs.

    SimpleStack stack1 = new SimpleStack(chrs);

    // Initialize stack2 with the contents of stack1.

    SimpleStack stack2 = new SimpleStack(stack1);

    System.out.print("Popping contents of stack1: ");

    while (!stack1.isEmpty()) {
  
      ch = stack1.pop();

      System.out.print(ch);

    }

    System.out.print("\nPopping contetns of stack2: ");

    while (!stack2.isEmpty()) {
  
      ch = stack2.pop();

      System.out.print(ch);
 
    }

    System.out.println();

  }

}
