import java.util.Scanner;

public class area_of_a_rectangle {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length: ");
        double length = scanner.nextDouble();

        System.out.print("What is the width: ");
        double width = scanner.nextDouble();

        System.out.println("The area of this rectangle is: " + length * width + " cm²");



        scanner.close();

    }
}
