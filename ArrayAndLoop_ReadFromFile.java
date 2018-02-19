// import java.io.PrintStream;
// import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileNotFoundException;

public class ArrayAndLoop_ReadFromFile {

	public static void main(String[] args) 
			throws FileNotFoundException { 
			
			Scanner diskScanner = new Scanner(new File ("occupancy.txt"));
			int guestsIn[] = new int[10]; 
				
			for (int roomNum = 0; roomNum < 10; roomNum++){
				guestsIn[roomNum] = diskScanner.nextInt();
			}
			
			for (int roomNum = 9; roomNum >= 0; roomNum--){
				if (guestsIn[roomNum] == 0){
				out.println("Room " + roomNum + " is vacant.");
				}
			}
			
			diskScanner.close();	
	}
			
		}
	


//floor num, capacity