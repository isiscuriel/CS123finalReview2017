/*
roblem 1) What does the following program print out? Explain why.

   public class Mystery
   {
      public static void doSomething(int i)
      {
         System.out.println("my int is " + i);
      }

      public static void doSomething(double x)
      {
         System.out.println("my double is " + x);
      }

      public static void main(String[] args)
      {
         double z = 3.21;
         int k = -2;
         doSomething( z );
         doSomething( (int)z );
         doSomething( k );
         doSomething( (double)k );
      }
   }
my double is 3.21 
my int is 3 
my int is -2 
my double is -2.0 
*/
