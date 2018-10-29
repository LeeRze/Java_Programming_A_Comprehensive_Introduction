

class BitOut{

  int numBits; // number of bits to display

  BitOut(int n) {

    if (n < 1)  n = 1;

    if (n > 64) n = 64;

    numBits = n;

  }

  //Display the sequence of bits.
  
  void showBits(long val) {

    long mask = 1;

    // left-shift a 1 into the proper position

    mask <<= numBits - 1;

    int spacer = 8 - (numBits % 8);
    for ( ; mask != 0; mask >>>= 1) {
  
      if ((val & mask) != 0) System.out.print("1");
      else System.out.print("0");

      spacer++;

      if ((spacer % 8) == 0) {
   
        System.out.print(" ");
        spacer = 0;
     }
 
    }
 
    System.out.println();

  }

  long CyclicShift(int target, int n, int nums) {

    if (n >= 0) 

      return ((target << nums - n) | target >> n);

    else 
   
      return ((target >> nums - n) | target << n); 

  }

}

class CyclicShiftDemo {

  public static void main(String[] args) {

    int nums = 16;

    BitOut b = new BitOut(nums);

   
    b.showBits(1);
 
    b.showBits(b.CyclicShift(1, 1, nums));


  }


}
