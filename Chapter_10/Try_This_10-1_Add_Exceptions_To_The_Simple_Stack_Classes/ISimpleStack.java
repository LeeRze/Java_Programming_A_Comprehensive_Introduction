// An interface for a simple stack that stores characters.
public interface ISimpleStack {

  // Push a character onto the stack.
  void push(char ch) throws StackFullException;

  // Pop a character from the stack.
  char pop() throws StackEmptyException;

  // Return true if the stack is empty.
  boolean isEmpty();

  // Return true if the stack is full.
  boolean isFull();

}
