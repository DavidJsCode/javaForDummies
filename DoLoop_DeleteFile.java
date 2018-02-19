// import java.io.PrintStream;
// import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class DoLoop_DeleteFile {

	public static void main(String[] args) { 
			
			Scanner input = new Scanner(System.in);
			char reply;
		
			do {
				out.println("Reply with a Y or N");
				out.print("Delete the file? ");
				reply = input.findWithinHorizon(".",0).charAt(0);
				} 
			while (reply != 'Y' && reply != 'N');
			
			if (reply == 'Y') {
				new File("../peopleInFloors.txt").delete();
				out.println("File is deleted");
				}
			else {
				out.println("File not deleted");
			}
			input.close();
		}
	}


//floor num, capacity