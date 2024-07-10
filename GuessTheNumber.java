

	import java.util.Random;
	import java.util.Scanner;

	public class GuessTheNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerBound = 1;
	        int upperBound = 100;
	        int numberOfRounds = 4;
	        int maxAttempts = 5;
	        int totalScore = 0;

	        System.out.println("Welcome to the Guess the Number game!");
	        System.out.println("You have " + numberOfRounds + " rounds to play.");

	        for (int round = 1; round <= numberOfRounds; round++) {
	            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	            int attempts = 0;
	            int score = 0;
	            System.out.println("\nRound " + round + ":");
	            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ".");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed it right.");
	                    score = maxAttempts - attempts + 1;
	                    totalScore += score;
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Try a higher number.");
	                } else {
	                    System.out.println("Try a lower number.");
	                }

	                if (attempts < maxAttempts) {
	                    System.out.println("Attempts left: " + (maxAttempts - attempts));
	                }
	            }

	            if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
	            }

	            System.out.println("Round " + round + " Score: " + score);
	        }

	        System.out.println("\nGame Over!");
	        System.out.println("Total Score: " + totalScore);

	        scanner.close();
	    }
	

}