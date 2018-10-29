
class Die {
  
  int SideUp;

  Die() {

    this.SideUp = 1;

  }

  int getSideUp() {

    return this.SideUp;

  }

  int roll() {

    this.SideUp = (int) ((Math.random()) * 5) + 1;

    return this.SideUp;

  }

}

class DieDemo {

  public static void main(String[] args) {

    Die x = new Die();
    Die y = new Die();

    System.out.println(x.getSideUp()+" "+y.getSideUp());

    System.out.println(x.roll()+y.roll());

  }

}
