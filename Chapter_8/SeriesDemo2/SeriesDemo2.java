// Demonstrate the use of Series

class SeriesDemo2 {

  public static void main(String[] args) {

    ByTwos twoOb = new ByTwos();
    ByThrees threeOb = new ByThrees();

    Series iRef; // an interface reference

    for (int i = 0; i < 5; i++) {
    
      iRef = twoOb; // refers to a ByTwos object
      System.out.println("Next ByTwos value is " +
                         iRef.getNext());

      iRef = threeOb; // refers to a BThrees object
      System.out.println("Next ByThrees value is " +
                         iRef.getNext());
 
    }

  }

}
