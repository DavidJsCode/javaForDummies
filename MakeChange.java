
// breaks amount to smallest number of coins
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		
		System.out.print("How many cents do you have? ");
		total = keys.nextInt();
		
		quarters = total / 25;
		whatsLeft = total % 25;
		
		dimes = whatsLeft / 10;
		whatsLeft = total % 10;
		
		nickels = whatsLeft / 5;
		whatsLeft = total % 5;
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get...");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " pennies");
		
		keys.close();
		
	}

}
