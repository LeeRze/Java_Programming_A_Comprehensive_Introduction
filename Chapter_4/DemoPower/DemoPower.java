class Power {

  double b;
  int e;
  double val;
  
  Power(double b, int e) {

    this.b = b;
    this.e = e;

    val = 1;
    if (e==0) return;
    for ( ; e>0; e--) val = val * b;

  }

  double getPwr() {

    return val;

  }

}

class DemoPower {

  public static void main(String[] args) {

    Power x = new Power(4.0, 2);
    Power y = new Power(2.5, 1);
    Power z = new Power(5.7, 0);

    System.out.println(x.b + " raised to the " + x.e +
                       " power is " + x.getPwr());

    System.out.println(y.b + " raised to the " + y.e +
                       " power is " + y.getPwr());

    System.out.println(z.b + " raised to the " + z.e +
                       " power is " + z.getPwr());

  }

}
