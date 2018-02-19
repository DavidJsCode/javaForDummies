import java.util.Scanner;
import java.util.Random;

public class OracleYesNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random myRandomNum = new Random();
		int sysRandomNum;
		
		System.out.println("You can ask any Yes/No question and I will have an answer for you");
		System.out.print("You may enter your question here: ");
		input.nextLine();
		
		sysRandomNum = myRandomNum.nextInt(10) + 1;
		
		if (sysRandomNum > 5) {
			System.out.println("Yes, of course it is so.");			
		}
		else {
			System.out.println("No, that goes against the path of the universe.");
		}
		input.close();
	}
}
