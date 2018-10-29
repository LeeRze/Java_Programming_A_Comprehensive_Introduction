

class USMoney {

  int dollars, cents;

  USMoney(int inputdollars, int inputcents){

    this.dollars = inputdollars;

    this.cents = inputcents;

    while (this.cents > 99) {

      this.cents -= 100;

      this.dollars += 1;

    }

  }

  USMoney plus(USMoney a, USMoney b){

    USMoney outcome = new USMoney(0,0);

    outcome.dollars = a.dollars + b.dollars;

    outcome.cents = a.cents + b.cents;

    while (outcome.cents >99) {

      outcome.cents -= 99;

      outcome.dollars += 1;

    }

    return outcome;

  }

}

class USMoneyDemo {

  public static void main(String[] args) {

    USMoney x = new USMoney(5,80);

    USMoney y = new USMoney(7,70);

    USMoney result = new USMoney(0,0);

    result = result.plus(x,y);

    System.out.println(result.dollars+"."+result.cents);

  }

}
