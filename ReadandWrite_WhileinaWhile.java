//finds all usernames before @ symbol in one file and writes to another

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ReadandWrite_WhileinaWhile {

	public static void main(String[] args) 
					throws FileNotFoundException {
		
		Scanner fromDisk = new Scanner (new File ("EmailAddresses.txt"));
		
		
		PrintStream diskWriter = 
				new PrintStream ("UserNames.txt");
		char singleLetter;
			
		while (fromDisk.hasNext()) {
			
			singleLetter = fromDisk.findWithinHorizon(".", 0).charAt(0);
		
			while (singleLetter != '@') {
				diskWriter.print(singleLetter);
				singleLetter = fromDisk.findWithinHorizon(".", 0).charAt(0);
			}
				
				fromDisk.nextLine();
				diskWriter.println();
		}
		
		diskWriter.close();
		fromDisk.close();

	}
}
