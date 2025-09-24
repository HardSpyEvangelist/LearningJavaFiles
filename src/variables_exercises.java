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

/*
        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);
*/

        System.out.println("The year is " + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(currency);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(forSale);

        String name = "HardSpyEvangelist";
        String food = "pizza";
        String email = "fake432@gmail.com";
        String car = "WhateverBrand";
        String color = "Black";

        System.out.println(name);
        System.out.println("Hello " + name);

        System.out.println("My choice of car is " + car + " as long as the color of the car is " + color + ".My name is "
        + name + ", my email address is " + email + " and l am going to buy it in " + year);

    }
}
