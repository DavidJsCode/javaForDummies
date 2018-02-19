import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class ProcessPurchase {

	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		Purchase onePurchase = new Purchase();
		// NumberFormat is a class,getCurrencyClass is a static method of the class
		// creating an instance of that class's method to make an object I can call
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String niceTotal;
		
		out.print("Amount: ");
		onePurchase.amount = keyboard.nextDouble();
		out.println("Taxable? (true or false): ");
		onePurchase.taxable = keyboard.nextBoolean();
		
		if (onePurchase.taxable){
			onePurchase.total = onePurchase.amount * .02 + onePurchase.amount;  
		}
		else {onePurchase.total = onePurchase.amount;}
		
		niceTotal = currency.format(onePurchase.total);
			out.println("The total is " + niceTotal );
	}	
}
