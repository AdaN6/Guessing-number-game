import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// Scanner needs to be outside the loop, java gets weird if scanner is inside the loop
		
		Scanner scanner = new Scanner(System.in);
		// loop for keep on playing
		while(true ) {

			String[] rps = {"r", "p", "s"};
			
			// move from computer
			String computerMove = rps[new Random().nextInt(rps.length)];
			
			// move from user
			String playerMove;
			  // loop
			while(true) {
				System.out.println("Please enter your move(r, p, or s)");
				playerMove = scanner.nextLine();
				// if player doesnt give r, p or s
				if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + " This is not a valid move");
			}
			
			// computer chose
			System.out.println("Computer played: " + computerMove);
			
			if(playerMove.equals(computerMove)) {
				System.out.println("The game was a tie");
			}
			// Computer chose paper
			else if (playerMove.equals("r")) {
				if (computerMove.equals("p")) {
					System.out.println("You lose!");
				}
				else if (playerMove.equals("s")) {
					System.out.println("Yay! You win!");
				}
			}
			// Computer chose rock
			else if (playerMove.equals("p")) {
				if (computerMove.equals("r")) {
					System.out.println("Yay! You Win!");
				}
				else if (playerMove.equals("s")) {
					System.out.println("Sorry! You lose");
				}
			}
			// Computer chose scissor
			else if (playerMove.equals("r")) {
				if (computerMove.equals("s")) {
					System.out.println("Yay! You win!");
				}
				else if (playerMove.equals("p")) {
					System.out.println("Sorry! You lose");
				}
			}
			
			System.out.println("Play again? (y/n)");
			String playAgain =scanner.nextLine();
			
			if (!playAgain.equals("y")) {
				break;
			}
		}
		
		scanner.close();
		
	}

}
