import static java.lang.System.out;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class WriteHardDriveTemplate {

	public static void main(String[] args) 
					throws FileNotFoundException {
		PrintStream diskOutput = 
				new PrintStream ("FileName");
		
		diskOutput.print("");
		diskOutput.println("");
		
		//whatever code you want to do
				
		diskOutput.close();

	}

}
