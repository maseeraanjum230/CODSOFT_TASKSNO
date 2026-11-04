
import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();

        int roundsWon = 0;
        String playAgain;

        System.out.println("===== NUMBER GUESSING GAME =====");

        do {

            int secretNumber = random.nextInt(100) + 1;
            int attemptsLeft = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have 7 attempts to guess it!");

            while (attemptsLeft > 0) {

                System.out.print("\nEnter your guess: ");

                int guess = input.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attemptsLeft--;

                if (guess == secretNumber) {

                    System.out.println("Congratulations! Correct guess!");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;

                } else if (guess < secretNumber) {

                    System.out.println("Too low! Try again.");

                } else {

                    System.out.println("Too high! Try again.");

                }

                System.out.println("Attempts remaining: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("\nGame over! The number was " + secretNumber);
            }

            System.out.println("\nRounds won: " + roundsWon);

            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing!");
        System.out.println("Final score: " + roundsWon + " rounds won.");

        input.close();
    }
}
}
