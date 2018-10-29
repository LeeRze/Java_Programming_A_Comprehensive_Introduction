

class Swapper {

  int x,y;

  Swapper( int a, int b){

    this.x = a;

    this.y = b;

  }

  int getX() {

    return this.x;

  }

  int getY() {

    return this.y;

  }

  void swap() {

    int temporary;

    temporary = this.x;

    this.x = this.y;

    this.y = temporary;

  }

}

class SwapperDemo{

  public static void main(String[] args) {

    Swapper test = new Swapper(1,5);  

    System.out.println(test.getX()+" "+test.getY());

    test.swap();

    System.out.println(test.getX()+" "+test.getY());


  }


}
