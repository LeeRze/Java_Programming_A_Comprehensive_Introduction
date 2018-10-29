// An exception for stack-full errors.
class StackFullException extends Exception {

  int size;

  StackFullException(int s) {

    super("Stack Full");
    size = s;

  }

  public String toString() {

    return "\nStack is full. Maximum size is " + size;

  }

}

// An exception for stack-empty errors.
class StackEmptyException extends Exception {

  StackEmptyException() {

    super("Stack Empty");

  }

  public String toString() {

    return "\nStack is empty.";

  }

}
