import java.util.Scanner;

public class Guess {

    public static void main(String[] args){

        int randomNumber = (int) ((Math.random() * 100) + 1); // generate a random number between 1 to 100
        boolean hasWon = false; // initially hasWon is initialized to false as no one wins yet!

        System.out.println("I have chossen a number between [1, 100]");
        System.out.println("Try to guess it!");

        // created an Scanner object to get the input from user
        Scanner scanner = new Scanner(System.in);

        // created a for loop which runs 10 times and give 10 chances to guess the number
        for (int i = 10; i > 0; i--){

            System.out.println("You have " + i + " guesses left. Choose again!");
            int guess = scanner.nextInt();

            // print the message if randomNumber is smaller than the guess number
            if (randomNumber < guess){

                System.out.println("It's smaller than " + guess + ".");
            }
            // print the message if randomNumber is greater than the guess number
            else if (randomNumber > guess){

                System.out.println("It's greater than " + guess + ".");
            }
            // assign true to hasWon if randomNumber is equals to guess number and break the loop
            else {

                hasWon = true;
                break;
            }
        }
        // print the message if user has won the match or guess the number correctly
        if (hasWon){

            System.out.println("Correct... You WIN!!");
        }
        // print the message if user has not won the match
        else {

            System.out.println("Game Over... You LOSE!!");
            System.out.println("The number was " + randomNumber);
        }
    }
}
