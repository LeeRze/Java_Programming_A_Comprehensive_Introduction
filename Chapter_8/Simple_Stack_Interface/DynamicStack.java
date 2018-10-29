// A grouwable stack for characters.
class DynamicStack implements ISimpleStack {

  private char[] data; // this array holds the stack
  private int tos; // index of top of stack

  // Construct an empty stack given its size
  DynamicStack(int size) {

    data = new char[size];  // create the array to hold the stack
    tos = 0;

  }

  // Construct a stack from a stack
  DynamicStack(DynamicStack otherStack) {

    // size of new stack equals that of otherStack
    data = new char[otherStack.data.length];

    // set tos to the same position
    tos = otherStack.tos;

    // copy the contents
    for (int i = 0; i < tos; i++)
      data[i] = otherStack.data[i];

  }

  // Construct a stack with initial values.
  DynamicStack(char[] chrs) {

    // create the array to hold the initial values
    data = new char[chrs.length];
    tos = 0;

    // initialize the stack by pushing the contents
    // of chrs onto it
    for (char ch: chrs)
      push(ch);
  
  }

  // Push a character onto the stack.
  public void push(char ch) {

    // if there is no more room in the array,
    // expand the size of the stack
    if (tos == data.length) {

      // double the size of the existing array
      char[] t = new char[data.length * 2];

      // copy the contents of the stack into the larger array
      for (int i = 0; i < tos; i++)
        t[i] = data[i];

      // set data to refer to the new array
      data = t;

    }

    data[tos] = ch;
    tos ++;

  }

  // Pop a character from the stack.
  public char pop() {

    if (isEmpty()) {

      System.out.println(" -- Stack is empty.");
      return (char) 0; // a placeholder value

    }
  
    tos--;
    return data[tos];

  }

  // Return true if the stack is empty.
  public boolean isEmpty() {
  
    return tos == 0;

  }

  // Return true if the stack is full. For Dynamicstack,
  // this method always returns false.
  public boolean isFull() {

    return false;

  }
 
}  
