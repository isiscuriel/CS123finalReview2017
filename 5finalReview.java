*
Problem 5) Below is the outline of a simple class called BusyWork.
In the blank space provided in the class, add two methods to the 
class. The two methods that you add can make use of the two given
methods setNumber() and getNumber().
(a) Add a method increment() that adds 1 to the value of m.
(b) Add a method decrement() that returns a BusyWork object
whose value of m is one less than the value stored in the 
calling object. This method should not modify the m in the
object the method is called on.
*/

   class BusyWork
   {
      private int m = 0;

      public void setNumber(int newM)
      {
         this.m = newM;
      }

      public int getNumber()
      {
         return this.m;
      }

      // write the methods increment() and decrement()

public void increment(){
        m ++;
      }

      // write the methods increment() and decrement()
      public BusyWork decrement()
      {
        BusyWork result = new BusyWork();
        result.setNumber( this.m - 1 );
        return result;
      }

   }//BusyWork
   }//BusyWork
