// A simple generic fixed-length stack.
class GenSimpleStack<T> implements IGenSimpleStack<T> {

  private T[] data; // this array holds the stack
  private int tos; // index of top of stack

  // Construct an empty stack with the given array as storage.
  GenSimpleStack(T[] arrayRef) {

    data = arrayRef;
    tos = 0;

  }

  // Push an item onto the stack.
  public void push(T obj) throws StackFullException {

    if (isFull())
      { throw new StackFullException(data.length);}

    data[tos] = obj;
    tos++;

  }

  // Pop an item from the stack.
  public T pop() throws StackEmptyException {

    if (isEmpty())
      { throw new StackEmptyException();}

    tos--;
    return data[tos];

  }

  // Return true if the stack is empty.
  public boolean isEmpty() {

    return tos == 0;

  }

  // Return true if the stack is full.
  public boolean isFull() {

    return tos == data.length;

  }

}
