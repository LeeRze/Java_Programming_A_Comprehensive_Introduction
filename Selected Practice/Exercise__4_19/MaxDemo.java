
class MaxTest{

  int x, y ,z;

  MaxTest( int a, int b, int c) {

    this.x = a;

    this.y = b;

    this.z = c;

  }

  int getMaxIfElse() {

     if ( (this.x > this.y) & (this.x > this.z) ) 

       return this.x;

     else if ( (this.y > this.x) & (this.y > this.z) ) 

       return this.y;

     else

       return this.z;

  }

  int getMaxNestedIf() {

    if ( (this.x > this.y) & (this.x > this.z) ) 

      return this.x;

    if ( (this.y > this.x) & (this.y > this.z ) )

      return this.y;

    if ( (this.z > this.x) & (this.z > this.y ) )

      return this.z;

    return 0;

  }

} 

class MaxDemo {

  public static void main(String[] args) {

    MaxTest test = new MaxTest(1,2,3);

    System.out.println(test.getMaxIfElse());

    System.out.println(test.getMaxNestedIf());

  }


}
