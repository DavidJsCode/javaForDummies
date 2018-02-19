import java.text.NumberFormat;
import static java.lang.System.out;

public class Accounts_MakeMethods {

	String lastName;
	int id;
	double balance;

	void display() {
		NumberFormat currency = NumberFormat.getCurrencyInstance(); 
		
	out.print("The account with last name " + lastName + " and ID number " + id + " has a balance of ");
	out.println(currency.format(balance));
		
	}
	
}
