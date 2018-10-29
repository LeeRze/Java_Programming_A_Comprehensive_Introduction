import java.awt.Color;
import java.util.Calendar;

public class GeometricShapeDemo {

   public static void main(String[] args) {
      GeometricShape g = new GeometricShape(Color.YELLOW);
      System.out.println(g);

      Calendar dateCreated = g.getDateCreated();
      dateCreated.set(Calendar.YEAR, 1000);
      System.out.println(g);

   }
}



