interface IfA {

  void doSomething();

}

interface IfB {

  void doSomething();

}

// Implement both IfA and IfB.
class MyClass implements IfA, IfB {

  public void doSomething() {
  
    System.out.println("Doing something.");

  }

}
