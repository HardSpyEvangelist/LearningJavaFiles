import java.io.*;  // import everything from java.io

public class buffered_reader {
    public static void main (String[] args) throws IOException {

        // Create a BufferedReader object to read text input from the keyboard
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Declare variables to store the user's details
        String reg_number;
        String full_name;
        int age;
        double weight;
        double height;

        // Ask for registration number
        System.out.print("Enter your registration number: ");
        reg_number = in.readLine();  // readLine() reads a line of text (as a String)

        // Ask for full name
        System.out.print("Enter your full name: ");
        full_name = in.readLine();  // still a String, no need to convert

        // Ask for age
        System.out.print("Enter your age: ");
        age = Integer.parseInt(in.readLine());  // convert String → int

        // Ask for weight
        System.out.print("Enter your weight (kg): ");
        weight = Double.parseDouble(in.readLine());  // convert String → double

        // Ask for height
        System.out.print("Enter your height (m): ");
        height = Double.parseDouble(in.readLine());  // convert String → double

        // Display all details
        System.out.println("\n--- User Information ---");
        System.out.println("Registration Number: " + reg_number);
        System.out.println("Full Name: " + full_name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
    }
}
