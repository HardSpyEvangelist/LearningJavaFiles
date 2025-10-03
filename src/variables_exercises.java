public class variables_exercises {
    public static void main(String[] args){

 /*
 When working with variables in Java:
 1. We first **declare** the variable → by writing the data type, then the variable name.
    Example: int age;

 2. We can then **assign** a value to it → using the assignment operator (=).
    Example: age = 20;

 3. Or we can **declare and assign in one step**.
    Example: int age = 20;
*/

        int age = 21;
        int year = 2026;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);


        System.out.println("The year is " + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);
        System.out.println(temperature + "%");
        System.out.println(gpa);

        char grade = 'A';
        char symbol = '?';
        char currency = '$';

        System.out.println(currency);
        System.out.println("l got an " + grade + " in math today");
        System.out.println("Always end your questions with this " + symbol + "when you are asking a question");

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(forSale);
        System.out.println("Are you a student?" + isStudent);
        System.out.println("Can you check if Terence is online" + isOnline);

        String name = "HardSpyEvangelist";
        String food = "pizza";
        String email = "fake432@gmail.com";
        String car = "WhateverBrand";
        String color = "Black";

        System.out.println(name);
        System.out.println("Hello " + name);
        System.out.println("my favourite fast food is" + food);

        System.out.println("My choice of car is " + car + " as long as the color of the car is " + color + ".My name is "
        + name + ", my email address is " + email + " and l am going to buy it in " + year);

    }
}

/*
   Reminder for myself when writing Java programs:

   Structure of every Java file:
   ---------------------------------
   public class ClassName {
       public static void main(String[] args) {
           // Code goes here
       }
   }

   Notes:
   - "public class ClassName" → File name must match the class name.
   - "public static void main(String[] args)" → This is the entry point of the program.
       • public  → anyone can access it
       • static  → no need to create an object to run it
       • void    → it doesn’t return anything
       • main    → the method that Java looks for first
       • (String[] args) → command-line arguments

   Basically: every time I create a new Java file,
   I need this boilerplate to make the program actually run.

   Yes, it's annoying. Yes, I always forget.
*/
