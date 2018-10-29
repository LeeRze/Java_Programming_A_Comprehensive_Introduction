// Try This 7-1
//
// Build a sub class of Vehicle for trucks.

class Vehicle {

  private int passengers; // number of passengers
  private int fuelCap;    // fuel capacity in gallons
  private int mpg;        // fuel consumption in miles per gallon
  
  // This is a constructor for Vehicle.
  Vehicle (int p, int f, int m) {

    passengers = p;
    fuelCap = f;
    mpg = m;

  }

  // Return the range.
  int range() {

    return mpg * fuelCap;

  }

  // Compute fuel needed for a given distance.
  double fuelNeeded(int miles) {

    return (double) miles / mpg;

  }

  // Accessor methods for instance variables.
  int getPassengers() { return passengers; }
  void setPassengers(int p) { passengers = p; }

  int getFuelCap() { return fuelCap; }
  void setFuelCap(int f) { fuelCap = f; }

  int getMpg() { return mpg; }
  void setMpg(int m) { mpg = m; }

}

// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {

  private int cargoCap; // cargo capacity in pounds.

  // This is a constructor for Truck.
  Truck(int p, int f, int m, int c) {
    /* Initialize Vehicle members using
       Vehicle's constructor. */
    super(p, f, m);

    cargoCap = c;

  }

  // Accessor methods for cargoCap.
  int getCargo() { return cargoCap; }
  void putCargo(int c) { cargoCap = c; }

}

class TruckDemo {

  public static void main(String[] args) {

    // construct some trucks
    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 20, 15, 2000);
    double gallons;
    int dist = 252;

    gallons = semi.fuelNeeded(dist);

    System.out.println("Semi can carry " + semi.getCargo() +
                       " pounds.");
    System.out.println("To go " + dist + " miles semi needs " +
                       gallons + " gallons of fuel.\n");

    gallons = pickup.fuelNeeded(dist);

    System.out.println("Pickup can carry " + pickup.getCargo() +
                       " pounds.");
    System.out.println("To go " + dist + " miles pickup needs " +
                       gallons + " gallons of fuel.");

  }

}
