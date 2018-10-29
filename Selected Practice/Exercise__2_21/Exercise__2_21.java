

class Exercise__2_21 {
  
  public static void main(String[] args) {

    double x = 0.0;

    int counter = 0, i = 0;

    for ( i = 0; i < 1000; i++) {

       x = Math.random();

       if ( x > 0.5 ) counter++;

    }

    System.out.print("The number of values which are greater than 0.5 is ");

    System.out.println(counter); 
  
  }

}
