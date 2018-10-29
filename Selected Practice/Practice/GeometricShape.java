import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GeometricShape {

   /**
    * once the dateCreated is set, it should not change. It is set to the
    * current time in the default time zone with the default locale.
    */
   private final  Calendar dateCreated = new GregorianCalendar();
   private Color color;

   public GeometricShape() {
      this.setColor(Color.BLACK);
   }

   public GeometricShape(Color color) {
      this.setColor(color);
   }

   public Calendar getDateCreated() {
       //return dateCreated;
       return (Calendar) dateCreated.clone();
   }

   public Color getColor() {
      return this.color;
   }

   public final void setColor(Color color) {
      this.color = color;
   }

   public String toString() {
      int year = dateCreated.get(Calendar.YEAR);
      String monthStr =
              dateCreated.getDisplayName(Calendar.MONTH,
              Calendar.LONG,
              Locale.ENGLISH);
      int day = dateCreated.get(Calendar.DATE);


      String result = "created on " + day;
      result += " " + monthStr;
      result += " " + year + "\n";

      result += "color = " + this.getColor();
      return result;
   }
}


