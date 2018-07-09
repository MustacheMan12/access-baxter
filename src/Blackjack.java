import java.util.Scanner;

/*
 * We will be creating a digital version of the popular card game blackjack!
 * 
 * Specifications:
 * 
 * 1.) Player starts with 1000 chips.
 * 
 * 2.) Program asks player if they would like to play a game.
 * 
 * 3.) If player says yes, deal 2 cards to player and 2 cards to computer.
 * 
 * 4.) Show player their card, and ask if they would like to hit or fold.
 * 
 * 5.) If player's cards' total exceeds 21, they lose.
 * 
 * 6.) After player hits, if they didn't lose, the computer hits too.
 * 
 * 7.) If the computer's cards' total exceeds 21, it loses.
 * 
 * 8.) If the player wins, add their bet value to their bank.
 * 
 * 9.) Ask the player if they would like to go again
 * 
 * Feel free to refer to the day one activities for ideas on how to go about doing this.
 * 
 * I will be here to help you and answer any questions!
 * 
 */

public class Blackjack {

	
	public static void main(String[] args) {
		//START HERE
		Scanner in = new Scanner(System.in);
		
		int chips = 1000, playerTotal = 0, compTotal = 0;
		boolean play;
		
		while(askToPlay(in)) {		
			
			int pDraw1 = randomCard(), pDraw2 = randomCard(),
					cDraw1 = randomCard(), cDraw2 = randomCard();
			
			playerTotal += pDraw1 + pDraw2;
			compTotal += cDraw1 + cDraw2;
			
			System.out.println("You drew a " + pDraw1 + " and a " + pDraw2);
			System.out.println("The computer drew a " + cDraw1 + " and a " + cDraw2 + "\n");
			
			
		}
		
		System.out.println("Goodbye");

	}
	
	public static boolean askToPlay(Scanner in) {
		
		System.out.println("Would you like to play a game of Blackjack? (y/n)");
		
		String answer = in.nextLine();
		boolean play;
		
		if(answer.contains("y")) {
			play = true;
		}else {
			play = false;
		}
		
		return play;
	}
	
	public static int randomCard() {
		return (int) Math.floor(Math.random() * Math.floor(12)) + 1;
	}

}
