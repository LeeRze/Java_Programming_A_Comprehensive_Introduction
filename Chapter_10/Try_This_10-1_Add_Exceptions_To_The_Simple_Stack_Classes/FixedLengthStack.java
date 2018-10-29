// A fixed-length stack for characters that uses exceptions.
class FixedLengthStack implements ISimpleStack {

  private char[] data; // this array holds the stack
  private int tos; // index of top of stack
 
  // Construct an empty stack given its size.
  FixedLengthStack(int size) {
    
    data = new char[size]; // create the array to hold the stack
    tos = 0;

  }

  // Construct a stack from a stack
  FixedLengthStack(FixedLengthStack otherStack) {

    // size of new stack equals that of otherStack
    data = new char[otherStack.data.length];

    // set tos to the same position
    tos = otherStack.tos;

    // copy the contents
    for (int i = 0; i < tos; i++)
      data[i] = otherStack.data[i];

  }

  // Construct a stack with initial values.
  FixedLengthStack(char[] chrs) throws StackFullException {
  
    // create the array to hold the initial values
    data = new char[chrs.length];
    tos = 0;
  
    // initialize the stack by pushing the contents
    // of chrs onto it
    for (char ch: chrs)
      push(ch);

  }

  // Push a character onto the stack
  public void push(char ch) throws StackFullException {
  
    if (isFull()) 
      throw new StackFullException(data.length); 

    data[tos] = ch;
    tos++;

  }

  // Pop a character from the stack
  public char pop() throws StackEmptyException {

    if (isEmpty()) 
       throw new StackEmptyException();   

    tos--;
    return data[tos];

  }

  // Return true if the stack is empty
  public boolean isEmpty() {
   
    return tos == 0;

  }

  // Return true if the stack is full.
  public boolean isFull() {

    return tos == data.length;

  }

}

