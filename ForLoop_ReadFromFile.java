// import java.io.PrintStream;
// import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileNotFoundException;

public class ForLoop_ReadFromFile {

	public static void main(String[] args) 
			throws FileNotFoundException { 
			
			Scanner diskScanner = new Scanner(new File ("occupancy.txt"));
			
				out.println("Room\tGuests");
				
				for (int roomNum = 0; roomNum < 10; roomNum++) {
					out.print(roomNum);
					out.print("\t");
					out.println(diskScanner.nextInt());
				}
				
				diskScanner.close();
				
	}
			
		}
	


//floor num, capacity