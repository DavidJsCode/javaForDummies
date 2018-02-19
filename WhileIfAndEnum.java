import java.util.Random;
import static java.lang.System.out;
import java.util.Scanner;

public class WhileIfAndEnum {
	
 enum WantToPlay {yes, no};
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int card1 = 0, card2, result = 0;
		char typed = 'n';
		WantToPlay answer;
		Random random = new Random();
				
		out.print("Would you like to play 21? ");
		typed = input.findWithinHorizon(".", 0).charAt(0);
		
		
		if (typed == 'y' || typed =='Y') {
			answer = WantToPlay.yes;			
		}
		else answer = WantToPlay.no;
		
		switch (answer) {
		
		case yes: 
			out.println("Great! Let's play!");
			out.println("Card\tTotal");
			
			 	//uses plus equal (+=) instead of var = var + var2 
			while (result < 21) {
				card2 = random.nextInt(11) + 1;
				result += card2;
				out.println (card2 +"\t" + result);		 	
			}
						
			if (result == 21) { out.println ("You win!");} else {out.println ("You lost!"); }
				
		break;
		case no: 
			out.print("Ok, if you change your mind, run the program again");
			
			
		}
		
		input.close();
	}
}
		
	
