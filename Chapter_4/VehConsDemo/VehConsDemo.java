// Add a constructor

class Vehicle {

  int passengers; // number of passengers
  int fuelCap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  // This is a constructor for Vehicle.
  Vehicle(int p, int f, int m) {

    passengers = p;
    fuelCap = f;
    mpg = m;

  }

  // Retrun the range
  int range() {

    return mpg * fuelCap;

  }

  //Compute fuel needed for a given distance
  double fuelNeeded(int miles) {

    return (double) miles / mpg;

  }

}

class VehConsDemo {

  public static void main(String[] args) {

    // construct complete vehicles
    Vehicle minivan = new Vehicle(7, 16, 21);
    Vehicle sportscar = new Vehicle(2, 14, 12);

    double gallons;
    int dist = 252;

    gallons = minivan.fuelNeeded(dist);

    System.out.println("To go " + dist + " miles minivan needs " +
                       gallons + " gallons of fuel.");

    gallons = sportscar.fuelNeeded(dist);

    System.out.println("To go " + dist + " miles sportscar needs " +
                       gallons + " gallons of fuel.");

  }

}
