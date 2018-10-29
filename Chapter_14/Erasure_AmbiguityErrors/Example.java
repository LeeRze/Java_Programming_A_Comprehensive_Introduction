// Ambiguity caused by erasure on
// overloaded methods.
class MyGenClass<T, V> {

  T ob1;
  V ob2;

  // ...

  // These two overloaded methods are ambiguous
  // and will not compile
  void set(T o) {
    ob1 = o;
  }

  void set(V o) {
    ob2 = o;
  }

}


First, T and V could be the same;

Second, erasure could cause the overloading of set() a faule. (inherently ambiguous)
