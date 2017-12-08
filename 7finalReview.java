/*
Problem 7) Consider the following class definition. The public interface of this
class is that it ``stores'' three numbers, area, length, and width, but the 
actual implementation of the class contains a single private field, area, and
a public constant, WIDTH.  Write implementations for the constructor and the two
set and the two get methods in such a way that value for length is derived from 
the variable area.
*/

   class RestrictedRectangle
   {
      public final double WIDTH = 3.0;
      private double area;

      public RestrictedRectangle(double length)
      {
        this.area = length * WIDTH;
      }

      public double getArea()
      {
        return area;    
      }

      public double getLength()
      {
       return (area/WIDTH);
      }

      public void setArea(double area)
      {
      this.area = area;

      }

      public void setLength(double length)
      {
       this.area = length * WIDTH;
      }
   }//RestrictedRectangle
