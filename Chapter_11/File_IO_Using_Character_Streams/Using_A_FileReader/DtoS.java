// A simple disk-to-screen utility that demonstrates a FileReader.
// This code requires JDK 7 or later.

import java.io.*;

class DtoS {

  public static void main(String[] args) {

    String s;

    // Create and use a FileReader wrapped in a BufferedReader.
    try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
    {

      while ((s = br.readLine()) != null) {
          
        System.out.println(s);

      }

    } catch (IOException exc) {

      System.out.println("I/O error: " + exc);

    }

  }

}
