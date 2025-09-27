import java.util.Scanner;

public class shopping_cart_program {

    public static void main (String[] args){
        /*
   MINI PROJECT: Shopping Cart Program
   GOAL:
   -----
   Build a simple program where the user can:
     1. Enter the name of an item
     2. Enter the price of the item
     3. Enter the quantity they want to buy
     4. Program calculates the total cost (price * quantity)
     5. Program prints out a summary like:
        "You bought [quantity] [item](s) at [price] each. Total = [total]."
*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you want to buy?: ");
        String product = scanner.nextLine();

        System.out.print("What is the price of this product?: ");
        double price = scanner.nextDouble();

        System.out.print("How many do you want?: ");
        int quantity = scanner.nextInt();

        double total_price = price * quantity;

        System.out.println("You bought " + quantity + "," + product + "(s)");
        System.out.println("Your total is $" + total_price);

        scanner.close();
    }
}
