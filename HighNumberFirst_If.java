import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;


public class HighNumberFirst_If {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);
		int indians, pirates;
		
		out.println("Type in the score of the Indians: ");
		indians = input.nextInt();
		out.println("Type in the score of the Pirates: ");
		pirates = input.nextInt();
		
		if (indians > pirates){
			out.print("Indians: ");
			out.println(indians);
			out.print("Pirates: ");
			out.println(pirates);
		}
		
		else {
			out.print("Pirates: ");
			out.println(pirates);
			out.print("Indians: ");
			out.println(indians);
			
		}
		
	}

}
