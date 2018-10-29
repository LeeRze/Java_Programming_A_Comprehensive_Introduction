// Demonstrate import.
package mypack;
import bookpack.*;

// Use the Book Class from bookpack.
class UseBook {
  
  public static void main(String[] args) {

    bookpack.Book[] books = new bookpack.Book[5];
 
    books[0] = new bookpack.Book("The Art of Computer Programming, Vol 3",
                        "Knuth", 1973);

    books[1] = new bookpack.Book("Moby Dick",
                        "Melville", 1851);

    books[2] = new bookpack.Book("Thirteen at Dinner",
                        "Christie", 1933);

    books[3] = new bookpack.Book("Red Storm Rising",
                        "Clancy", 1986);

    books[4] = new bookpack.Book("On the road",
                        "Kerouac", 1955);

    for (int i = 0; i < books.length; i++) {

      books[i].show();
      System.out.println();

    }

  }

}
