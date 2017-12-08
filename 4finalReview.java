/*
Problem 4) Suppose I have defined a class called Thing. The following line performs three distinct steps.
What are they? How would you rewrite this single line as two lines? 
What distinct steps do each of those two lines perform?
   Thing rose = new Thing();
The three steps are
Declaration ? (Thing rose ) object type followed by variable name.
Instantiation ? The 'new' keyword creates the object.
Initialization ? a call to constructor to initilize the object.
This can be split into two parts.
Thing rose; //i. Decleration
rose = new Thing(); //ii. Instantiation and Initilization.
*/
