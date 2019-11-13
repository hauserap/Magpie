import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie2 maggie = new Magpie2();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();
		

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			System.out.println(maggie.candyResponse(statement));
			System.out.println(maggie.partyResponse(statement));
			System.out.println(maggie.gameResponse(statement));
			System.out.println(maggie.pantsResponse(statement));
			statement = in.nextLine();
			
			
		}
	}

}
