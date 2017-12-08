/*
Problem 2) Suppose that we have defined a class
Square with a constructor Square(double side).
Write a code segment that creates an array object
of 100 Square references and then initializes
the array with 100 Square objects with sides 
from 1 to 100.
*/
Square[] squares = new Square[100];
       //loop through 100
       for(int i=0;i<100;i++){
       //create a squre object
           squares[i] = new Square((double)i);
       }
