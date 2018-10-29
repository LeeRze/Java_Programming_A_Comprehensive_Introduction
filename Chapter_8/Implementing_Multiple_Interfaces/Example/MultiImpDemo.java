class MultiImpDemo {

  public static void main(String[] args) {

    IfA aRef;
    IfB bRef;
    MyClass obj = new MyClass();

    // Both interfaces use the same doSomething().
    aRef = obj;
    aRef.doSomething();

    bRef = obj;
    bRef.doSomething();

  }

}
