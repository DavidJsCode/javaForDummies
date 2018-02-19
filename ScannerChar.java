import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ScannerChar {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int age;
	double price = 0.00;
	char reply;
	boolean isKid, isSenior, hasCoupon, hasNoCoupon;
	
	out.print("How old are you? ");
	age = input.nextInt();
	
	out.println("Do you have a coupon? ");
	reply = input.findWithinHorizon(".",0).charAt(0);
	
	isKid = age < 12;
	isSenior = age > 64;
	hasCoupon = reply == 'Y' || reply == 'y';
	hasNoCoupon = reply == 'N' || reply =='n';
	
	if (!isKid && !isSenior) {
		price = 9.25;
	} 
	if (isKid || isSenior) {
		price = 5.25;
	}
	
	if ((hasCoupon)	&& (!isKid && !isSenior))
	{
		price -= 2.00;
	}
	
	
	out.print("Please pay $ " + price + ", and enjoy the shoe!");

	input.close();
	
	}

}
