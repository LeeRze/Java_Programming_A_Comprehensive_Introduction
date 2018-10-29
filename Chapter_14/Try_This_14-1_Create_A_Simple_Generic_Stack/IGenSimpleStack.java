// A generic interface for a simple stack.
public interface IGenSimpleStack<T> {

  // Push an item onto the stack.
  void push(T item) throws StackFullException;

  // Pop an item from the stack.
  T pop() throws StackEmptyException;

  // Return true if the stack is empty.
  boolean isEmpty();

  // Return true if the stack is full.
  boolean isFull();

}
