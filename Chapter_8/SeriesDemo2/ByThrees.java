// Implement Series a different way

class ByThrees implements Series {

  int start;
  int val;

  ByThrees() {

    start = 0;
    val = 0;

  }

  // Implement the methods specified by Series
  public int getNext() {

    val += 3;
    return val;
  
   }

   public void reset() {

     val = start;
 
   }

   public void setStart(int x) {

     start = x;
     val = x;

   }

}
