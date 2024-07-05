import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(100) + 1;
		// System.out.println("Random number is " + randomNumber);
		
		// while loop is for after the wrong guess and guess again
		while(true) {
			System.out.println("Enter your guess (1-100):");
			
			int playerGuess = scanner.nextInt();
			
			if (playerGuess == randomNumber) {
				System.out.println("Correct! Smart guess!");
				// If the user guess the right answer, the loop wont happen.
				break;
			} 
			else if (randomNumber > playerGuess) {
				System.out.println("Nope! The number is higher. Guess again");
			}
			else {
				System.out.println("Nope! The number is lower. Guess again.");
			}
		}
	}

}
