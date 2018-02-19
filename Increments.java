
public class Increments {

	public static void main(String[] args) {

		int gumballs = 27;
		
		++gumballs;
		System.out.println(gumballs + " Expect 28");
		System.out.println(gumballs++ + " Expect 28");
		System.out.println(gumballs + " Expect 29");
		System.out.println(gumballs-- + " Expect 29");
		System.out.println(--gumballs + " Expect 27");
	
		System.out.println(gumballs + " Expect 27");
		System.out.println(++gumballs + " Expect 28");
		System.out.println(gumballs + " Expect 28");
		System.out.println(--gumballs + " Expect 27");
		System.out.println(--gumballs + " Expect 26");		
		
	}

}
