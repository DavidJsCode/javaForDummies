// import java.io.PrintStream;
// import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileNotFoundException;

public class ForLoop_ReadFromFile_InputNum {

	public static void main(String[] args) 
			throws FileNotFoundException { 
			
			Scanner keyboard = new Scanner (System.in);
			Scanner diskScanner = new Scanner(new File ("occupancy.txt"));
			int whichRoom;
			
				out.print("Which room? ");
				whichRoom = keyboard.nextInt();
				
				// how does this work? i can enter '0' and get an answer, but roomNum (0) is not less than whichRoom (0)
				// and then the damn book reads like it expects the question to keep repeating. it doesn't and
				// there is no explanation of how the code works at all
				for (int roomNum = 0; roomNum < whichRoom; roomNum++) {
				diskScanner.nextInt(); 
				}
				
				out.print("Room " + whichRoom + " has ");
				out.print(diskScanner.nextInt());
				out.println(" guests(s).");
				
				keyboard.close();
				diskScanner.close();
				
	}
			
		}
	


//floor num, capacity