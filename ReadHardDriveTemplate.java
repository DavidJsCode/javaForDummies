import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadHardDriveTemplate {

	public static void main(String[] args) 
					throws FileNotFoundException {
		Scanner diskInput = 
				new Scanner (new File ("FileName"));
		
		char charVar;
		int intVar;  
		double doubleVar; 
		String stringVar;
		
		charVar = diskInput.findWithinHorizon(".",0).charAt(0);
		intVar = diskInput.nextInt();
		doubleVar = diskInput.nextDouble();
		stringVar = diskInput.nextLine();
		
		//whatever code yo want to do
				
		diskInput.close();

	}

}
