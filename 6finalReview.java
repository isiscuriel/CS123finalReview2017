///Problem 6) Here is a simple Point class and a partially completed Circle class.

   class Point
   {
      private double x, y;

      public Point(double x, double y)
      {  this.x = x;
         this.y = y;
      }

      public double getX() { return x; }
      public double getY() { return y; }
      public void setX(double x) { this.x = x; }
      public void setY(double y) { this.y = y; }
   }

   class Circle
   {
      private Point c;   // center
      private double r;  // radius

      public Circle(double x, double y, double r)
      {



      }


      public Circle(Point c, double r)
      {



      }

      public Circle(Point c)
      {  this.r = 1.0;
         this.c = c;
      } 

      public boolean equals(Circle roundThing)
      {



      }

      // more stuff
   }


//(a) The third constructor in Circle has a "privacy leak". Explain why.
///Hint: Consider the following code.

   Point p = new Point(1,2);
   Circle c = new Circle(p);
   p.setX(100);
////Circle object is created with point (1,2) but point x was changed to 100
////results in change of x in Circle as well

(b) Complete the first two Circle constructors. Be sure to avoid another "privacy leak".
 public Circle(Point c, double r)
      {
    this.c=new Point(c.x,c.y);
    this.r=r;
}
(c) Complete the equals method in the Circle class.
 public boolean equals(Circle roundThing)
      {
 return this.r == roundThing.r && (this.c != null && roundThing.c != null && this.c.getX() == roundThing.c.getX() && this.c.getY() == roundThing.c.getY());


      }
