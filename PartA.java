/**
 * Write a recursive method that computes a new string where all occurrences of
 * the character "r" in an input string have been removed.
 * 
 */

/**
 * @author Tuna Dalbeler
 *
 */
public class PartA {

	static int counter = 0;
	public static void main(String[] args) {

		String input = "romorkör operatörü";

		System.out.println( theRemover(input) + " " + counter);
	}

	public static String theRemover( String input ) {
		String returner = "";
		System.out.println(input);

		if( !input.isEmpty() ) {
			returner = theRemover( input.substring(1) );

			if(input.charAt(0) == 'r') {

				counter++;
				return returner;
			}
			else {

				return input.charAt(0) + returner;
				}
		}
		else {
			return returner;
		}
	}

}
