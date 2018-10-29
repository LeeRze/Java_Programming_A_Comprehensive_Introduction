// Overriding a generic method in a generic class.

class Gen<T> {

  T ob; // declare an object of type T

  // Pass the constructor a reference to
  // an object of type T.
  Gen(T o) {

    ob = o;

  }

  // Return ob.
  T getob() {

    System.out.println("Gen's getob(): ");
    return ob;

  }

}

class Gen2<T> extends Gen<T> {

  Gen2(T o) {

   super(o);

  }

  // Override getob().
  T getob() {

    System.out.println("Gen2's getob(): ");
    return ob;

  }

}

// Demonstrate generic method override.
class OverrideDemo {

  public static void main(String[] args) {

   // A Gen reference that can refer to any type of Gen object.
   Gen<?> gRef;

   // Create a Gen object for Integers.
   Gen<Integer> iOb = new Gen<Integer>(88);

   // Create a Gen2 object for Integers.
   Gen2<Integer> iOb2 = new Gen2<Integer>(99);

   // Create a Gen2 object for Strings.
   Gen2<String> strOb2 = new Gen2<String> ("Generics Test");

   gRef = iOb;
   System.out.println(gRef.getob());

   gRef = iOb2;
   System.out.println(gRef.getob());

   gRef = strOb2;
   System.out.println(gRef.getob());

  }

}
