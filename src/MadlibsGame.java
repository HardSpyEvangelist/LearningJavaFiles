import java.util.Scanner;
// we are importing the Scanner class so that we can accept user input

public class MadlibsGame {
// this is our class, and the name of the file should also be MadlibsGame.java

    public static void main(String[] args){
        // this is the main method, the starting point of our program

        Scanner scanner = new Scanner(System.in);
        // we create a Scanner object so we can read input typed by the user

        // ask the player if they want to play
        System.out.print("Do you want to play Madlibs? (yes/no): ");
        String startGame = scanner.nextLine();

        // check their answer
        if(!startGame.equalsIgnoreCase("yes")) {
            System.out.println("Okay, maybe next time!");
            scanner.close();
            return; // stop the program
        }

        // explain the rules
        System.out.println("\nRULES:");
        System.out.println("👉 I will ask you for words (adjectives, nouns, verbs).");
        System.out.println("👉 Your words will be used to create a silly story.");
        System.out.println("👉 Just type in what I ask for and have fun!\n");

        // ask if they want to continue
        System.out.print("Do you want to continue? (yes/no): ");
        String continueGame = scanner.nextLine();

        if(!continueGame.equalsIgnoreCase("yes")) {
            System.out.println("Alright, game stopped.");
            scanner.close();
            return; // stop program if they don’t want to continue
        }

        // here we declare variables to store the user’s words
        String adjective1;   // describes something
        String noun1;        // a person, animal, place, or thing
        String adjective2;   // another describing word
        String verb1;        // an action word (ending with -ing)
        String adjective3;   // another describing word

        // we now ask the user to enter words
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();   // store the word in adjective1

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();        // store the word in noun1

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();   // store the word in adjective2

        System.out.print("Enter a verb ending with ing (action): ");
        verb1 = scanner.nextLine();        // store the word in verb1

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();   // store the word in adjective3

        // now we put the words together into a funny story
        System.out.println("\nToday l went to an " + adjective1 + " exhibit.");
        System.out.println("In the exhibit l saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("l was " + adjective3 + "!");

        scanner.close();  // we close the scanner (good practice to avoid memory leaks)

    }
}
