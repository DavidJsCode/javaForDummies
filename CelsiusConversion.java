import java.util.Scanner;

public class CelsiusConversion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.print("Enter the temperature in Celsius: ");
		celsius = input.nextDouble();
		
		fahrenheit = 9.0 / 5.0 * celsius + 32.0;
		
		System.out.println("Room temperature? ");
		System.out.print(fahrenheit >= 69.8 - .01 && fahrenheit < 69.8 + .01  );
		System.out.println(", the room's temperature is " + (int)fahrenheit);
		
		input.close();
		
		
	}

}
