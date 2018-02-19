import static java.lang.System.out;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ReadandWriteHardDrive {

	public static void main(String[] args) 
					throws FileNotFoundException {
		
		Scanner fromDisk = new Scanner (new File ("DataInputFile.txt"));
		
		
		PrintStream diskWriter = 
				new PrintStream ("FileName.txt");
	
		double unitPrice, quantity, total;
		 unitPrice = 19.95;
				 quantity = 5;
		
		unitPrice = fromDisk.nextDouble();
		quantity = fromDisk.nextInt();
		
		total = unitPrice * quantity;
		
		diskWriter.println(total);
		
		//whatever code you want to do
				
		diskWriter.close();
		fromDisk.close();

	}

}
