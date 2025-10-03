import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class user_input_with_buffer_reader {
    public static void main(String[] args) throws IOException {
        // -----------------------------
        // We are using BufferedReader to accept user input
        // BufferedReader only reads text (String), so we must convert it
        // to other data types manually (int, double, char, boolean)
        // ------------------------------

        // Step 1: Create a BufferedReader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // -----------------------------
        // Example 1: Reading an integer (int)
        // -----------------------------
        System.out.print("Enter an integer: ");
        // br.readLine() always returns a String
        // We convert String -> int using Integer.parseInt()
        int number = Integer.parseInt(br.readLine());
        System.out.println("You entered integer: " + number);

        // -----------------------------
        // Example 2: Reading a double
        // -----------------------------
        System.out.print("Enter a decimal number: ");
        // Convert String -> double using Double.parseDouble()
        double value = Double.parseDouble(br.readLine());
        System.out.println("You entered double: " + value);

        // -----------------------------
        // Example 3: Reading a single character (char)
        // -----------------------------
        System.out.print("Enter a single character: ");
        // br.readLine() gives a whole String, we only take the first character
        char ch = br.readLine().charAt(0);
        System.out.println("You entered char: " + ch);

        // -----------------------------
        // Example 4: Reading a boolean
        // -----------------------------
        System.out.print("Enter true or false: ");
        // Convert String -> boolean using Boolean.parseBoolean()
        // Note: anything other than "true" (ignoring case) will be false
        boolean flag = Boolean.parseBoolean(br.readLine());
        System.out.println("You entered boolean: " + flag);

        // -----------------------------
        // Done! BufferedReader was able to read all types, but notice:
        // - It always reads as a String first
        // - We must use wrapper classes (Integer, Double, Boolean) to convert
        // -----------------------------
    }
}
