/*
//This version of program prints the @ because it checks the condition, then gets the char and prints it
//Better to get the char, check the condition, then print if true 

import static java.lang.System.out;
import java.util.Scanner;

public class PrimingViaLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char symbol = ' ';
		
		while (symbol != '@') {
				symbol = input.findWithinHorizon(".",0).charAt(0);  
				
				out.print(symbol);
		}
		
		input.close();

	}

}

*/

/*
// This version puts a blank space at start of my input

 import static java.lang.System.out;
 
import java.util.Scanner;

public class PrimingViaLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char symbol = ' ';
		
		while (symbol != '@') {
			out.print(symbol);	
			symbol = input.findWithinHorizon(".",0).charAt(0);  
				
				
		}
		
		input.close();

	}

}
*/

//We have to prime the condition one time to get it started with a real value first
//I do not understand why this works

 import static java.lang.System.out;
 
import java.util.Scanner;

public class PrimingViaLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char symbol = ' ';

		//the prime statement
		symbol = input.findWithinHorizon(".",0).charAt(0);
		
		while (symbol != '@') {
			out.print(symbol);	
			symbol = input.findWithinHorizon(".",0).charAt(0);  
				
				
		}
		
		input.close();

	}

}
