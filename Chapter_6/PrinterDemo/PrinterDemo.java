
class Printer {
  
  void printArray(int[] array) {

    printArrayAux(array, 0); // start at the 0th element
 
    System.out.println();

  }

  void printArrayAux(int[] array, int index) {

    if (index == array.length)

      return; // we are done

    else { // there are more elements to print

      System.out.print(array[index] + " ");

      printArrayAux(array, index+1);

    }

  }

}

class PrinterDemo {

  public static void main(String[] args) {

    Printer printer = new Printer();

    int[] array = { 3, 1, 4, 2, 5, 7, 6, 8 };

    printer.printArray(array);

  }

}
