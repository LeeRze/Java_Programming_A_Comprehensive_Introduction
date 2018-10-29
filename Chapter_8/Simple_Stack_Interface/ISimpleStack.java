// An interface for a simple stack that stores characters.
public interface ISimpleStack {

  // Push a character onto the stack.
  void push(char ch);

  // Pop a character from the stack.
  char pop();

  // Return true if the stack is empty.
  boolean isEmpty();

  // Return true if the stack is full.
  boolean isFull();

}
