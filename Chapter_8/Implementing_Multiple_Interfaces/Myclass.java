interface IfA {

  void doSomething();

}

interface IfB {

  void doSomethingElse();

}

// Implement both IfA and IfB.
class MyClass implements IfA, IfB {

  public void doSomething() {
  
    System.out.println("Doing something.");

  }

  public void doSomethingElse() {

    System.out.println("Doing something else.");

  }

}
