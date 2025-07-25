import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
