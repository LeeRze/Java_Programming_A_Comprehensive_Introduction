// Use a return value.

class Vehicle {

  int passengers; // number of passengers
  int fuelCap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  // Return the range.
  int range() {

    return mpg * fuelCap;

  }

}

class RetMeth {

  public static void main(String[] args) {

    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();
 
    int range1, range2;

    // assign values to fields in minivan
    minivan.passengers = 7;
    minivan.fuelCap = 16;
    minivan.mpg = 21;
 
    // assign values to fields in sportscar
    sportscar.passengers = 2;
    sportscar.fuelCap = 14;
    sportscar.mpg = 12;

    // get the ranges
    range1 = minivan.range();
    range2 = sportscar.range();

    System.out.println("Minivan can carry " + minivan.passengers + 
                     " with a range of " + range1 + " miles");

    
    System.out.println("Sportscar can carry " + sportscar.passengers +
                     " with a range of " + range2 + " miles");

  }

}
