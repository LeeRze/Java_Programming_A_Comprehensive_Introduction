// Implement Series and add getPriorVal()

class ByTwos implements Series {

  int start;
  int val;
  int priorVal;

  ByTwos() {

    start = 0;
    val = 0;
    priorVal = -2;

  }

  // Implement the methods specified by Series
  public int getNext() {

    priorVal = val;
    val += 2;
    return val;
  
   }

   public void reset() {

     val = start;
     priorVal = val - 2;
 
   }

   public void setStart(int x) {

     start = x;
     val = x;
     priorVal = x - 2;

   }

   // Return the previous value. This method is not
   // defined by Series.
   int getPriorVal() {
 
     return priorVal;

   }

}
