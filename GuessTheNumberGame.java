import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRounds = 5;
        int maxAttempts = 10;
        int score = 0;
        
        System.out.println("Welcome to the Guess the Number Game!");
        
        for (int round = 1; round <= maxRounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = maxAttempts;
            boolean guessedCorrectly = false;
            
            System.out.println("\nRound " + round);
            System.out.println("I have randomly chosen a number between 1 and 100.");
            System.out.println("Can you guess what it is?");
            
            while (attemptsLeft > 0 && !guessedCorrectly) {
                System.out.println("\nYou have " + attemptsLeft + " attempts left. Enter your guess:");
                int userGuess = scanner.nextInt();
                attemptsLeft--;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    score += attemptsLeft * 10;
                } else if (userGuess < numberToGuess) {
                    System.out.println("The number is higher than your guess.");
                } else {
                    System.out.println("The number is lower than your guess.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
            }
        }
        
        System.out.println("\nGame Over! Your final score is: " + score);
        scanner.close();
    }
}
