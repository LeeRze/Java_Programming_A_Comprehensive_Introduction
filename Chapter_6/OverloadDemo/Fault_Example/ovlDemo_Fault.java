

// One ovlDemo(int) is OK

void ovlDemo(int a) {

  System.out.println("One parameter: " + a);

}

/* Error! Two ovlDemo(int)s are not OK even though
   return types differ.
*/

int ovlDemo(int a) {

  System.out.println("One parameter: " + a);

  return a * a;

}
