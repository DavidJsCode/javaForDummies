import java.util.Scanner;
import static java.lang.System.out;

public class Enums01 {
	
	enum WhomWon {home, visitor, neither}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pirates, indians;
		WhomWon whom;
		
		out.print("What was the Indians score? ");
		indians = input.nextInt();
		out.print("What was the Pirates score? ");
		pirates  = input.nextInt();
		
		if (indians > pirates) { 
			whom = WhomWon.home;
			out.println("The Pirates won");
		}
		else if (pirates  > indians ) { 
			whom = WhomWon.visitor;
			out.println("The Indians won");
		}
		else {
			whom = WhomWon.neither;
			out.print("It's a tie. ");
		}
		
		if (whom == WhomWon.home) {
			out.println("We beat 'em good today ay?");
		}
		if (whom == WhomWon.visitor) {
			out.println("That ref may some awful calls");
		}
		if (whom == WhomWon.neither) {
			out.println("We're in overtime!");
	
		input.close();
		}
	}
		
}
