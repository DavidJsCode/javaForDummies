import java.util.Random;

public class ProcessAccounts {

	public static void main(String args[]) {
		
		Random myRandom = new Random();
		Accounts_MakeMethods anAccount;
		
		for (int i = 0; i < 3; i++) {
			anAccount = new Accounts_MakeMethods();
			
			anAccount.lastName = "" +
					(char) (myRandom.nextInt(26) + 'A') +
					(char) (myRandom.nextInt(26) + 'a') +
					(char) (myRandom.nextInt(26) + 'a');
					
			anAccount.id = myRandom.nextInt(10000);
			anAccount.balance = myRandom.nextInt(10000);
			anAccount.display();
			
		}
	}	
}
