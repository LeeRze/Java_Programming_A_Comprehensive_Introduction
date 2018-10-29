
class StarDrawer {

  void drawStars(int n) {

    if (n == 1) 
   
      System.out.print("*");

    else {

      System.out.print("*");
 
      drawStars(n-1); // a recursive call
  
    }

  }

}

class StarDrawingDemo {

  public static void main(String[] args) {

    StarDrawer drawer = new StarDrawer();

    
    drawer.drawStars(1); // just base case
    System.out.println();

    drawer.drawStars(2); // one recursive call
    System.out.println();

    drawer.drawStars(3); // two recursive calls
    System.out.println();

    drawer.drawStars(10); // nine recursive calls
    System.out.println();

  }

}
