// import java.io.PrintStream;
// import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileNotFoundException;

public class Arrays_EnteringData {

	public static void main(String[] args) {
			// throws FileNotFoundException { 
			
			Scanner keyboard = new Scanner(System.in);
			int guestsIn[] = new int[10]; 
			int whichRoom, numGuests;
	
			for (int roomNum = 0; roomNum < 10; roomNum++){
				guestsIn[roomNum] = 0;
			}
			
			do {
			out.println("Which room? ");
			whichRoom = keyboard.nextInt();
			out.print("How many guests? ");
			numGuests = keyboard.nextInt();
			
			guestsIn[whichRoom] = numGuests;
			
			out.println("Do you have any more to enter? ");}
			while (keyboard.findWithinHorizon(".", 0).charAt(0) == 'y');
				
			out.println("Room\tGuests");
			for (int roomNum = 0; roomNum < 10; roomNum++) {
				out.print(roomNum + "\t" + guestsIn[roomNum]);
			}
			
			keyboard.close();	
	}
			
		}
	


//floor num, capacity