import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class NestedLoops {

	public static void main(String[] args) 
			throws FileNotFoundException {
		
		Scanner diskRead = new Scanner (new File ("people.txt"));
		PrintStream diskWrite = new PrintStream ("peopleInFloors"); 
		
	//	int floorNum;
	//	String floorName = "Floor";
	//	int num;
		
		for (int floorNum = 1; floorNum < 10; floorNum++) {
			diskWrite.println("");
			diskWrite.print( "Floor " + floorNum + ": ");
		
			for (int roomNum = 0; roomNum < 10; roomNum++) {
				diskWrite.print(diskRead.nextInt() + " ");
			
				}				
			}
		
		diskRead.close();
		diskWrite.close();
		
		}
	}


//floor num, capacity