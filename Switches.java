import java.util.Scanner;
import static java.lang.System.out;
import java.util.Random;

public class Switches {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randNum = new Random();
		int randomNumber;
		
		out.print("Type in a question ");
		input.nextLine();
		
		randomNumber = randNum.nextInt(4) + 1; 
		
		switch (randomNumber) {
		
		case 1:
			out.println("case 1");
			break;
		case 2:
			out.println("case 2");
			break;
		case 3:
			out.println("case 3");
			break;
		case 4:
			out.println("case 4");
			break;
		default:
			out.println("The case of no case");
		} 
		input.close();
		


	}

}
