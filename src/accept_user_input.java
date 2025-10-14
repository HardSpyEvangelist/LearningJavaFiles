import java.util.Scanner;

public class accept_user_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Student: " + isStudent);



        scanner.close();



    }

}

/*
   Notes on using Scanner for user input in Java:

   - First, we MUST import the Scanner class:
         import java.util.Scanner;
     (because Java is extra like that and won’t just let us read input without a whole package)

   - Then, inside main(), we create a Scanner object:
         Scanner scanner = new Scanner(System.in);
     This connects Scanner to the keyboard (System.in).

   - IMPORTANT: Always close your Scanner at the end with scanner.close();
     or Java will complain about "resource leaks".

   - Scanner has different methods depending on the type of input you want:
         nextLine()   → for a String (a full line of text)
         nextInt()    → for an integer
         nextDouble() → for a decimal number (double)
         nextBoolean()→ for true/false
     Basically, every data type has its own "next____()" method.
     So if you change the variable type, you must also change the Scanner method.
     Example:
         int age = scanner.nextInt();        // int expects whole numbers like 25
         double gpa = scanner.nextDouble();  // double expects decimals like 3.8
         String name = scanner.nextLine();   // string reads whatever text you type

   - Think of it like: Scanner is a vending machine, and you press
     different buttons (nextInt, nextDouble, etc.) depending on
     what type of input snack you want.

     l want see something
*/