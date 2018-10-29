package dogownerdemo;

import owner.*;
import dog.*;

class DogOwnerDemo {

  public static void main(String[] args) {

    Owner owner = new Owner("Fred", new Dog("Sam"));

    System.out.println(owner);

  }

}
