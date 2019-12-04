/**
		Write a recursive method that enumerates and prints all n-digit even numbers in
	which each digit of the number, from its most-significant to least-significant digits,
	is greater than the previous one (that is, for instance, the number 124 is ok, but the
	number 142 is not, since 2 is less than 4). Make sure your program prints each
	number just once. For example, if n=3 it should print
	124 126 128 134 136 138 146 148 156 and so on up to 999. Hint: If you had a
	method that checked whether a number meets the stated criteria or not, you could
	use it to filter the candidate values you generated recursively, printing only those
	that meet the criteria ~ideally the criteria checking method would also be recursive.
 * 
 */

/**
 * @author Tuna Dalbeler
 *
 */
public class PartD {

	public static void main(String[] args) {

		int n = 3;

		printAll(n);
	}

	public static void printAll(int n) { // Take n and pass numbers to check according to n 

		int tempNum = (int) Math.pow(10, n - 1);
		System.out.println("temp: " + tempNum);
		if ( check(tempNum) ) {

			if ( ( tempNum % 2 ) == 0) {

				System.out.println(tempNum);
				printAllNum(n , tempNum);
			}
		}
		else {
			printAllNum(n , tempNum);
		}
	}

	public static void printAllNum(int n , int tempNum) { // Take n and pass numbers to check according to n 

		if(tempNum < Math.pow(10, n)) {
			tempNum++;
			//System.out.println("temp: " + tempNum);
			if ( check(tempNum) ) {

				if ( true ) { //(tempNum % 2) == 0 )

					System.out.println(tempNum);
					printAllNum(n , tempNum);
				}
			}
			else {
				printAllNum(n , tempNum);
			}
		}
	}



	public static boolean check(int num) { //n kaç basamaklý olduðu

		String tempStr = Integer.toString(num);
		int first = 0;
		int second = 0;

		if (num > 9 ) {	//Check if it is not a single digit number
			first = Integer.parseInt( ( tempStr.substring( 0 , 1 ) ) );
			second = Integer.parseInt( ( tempStr.substring( 1 , 2 ) ) );


			if (first < second) {
				if (num > 100) {
					return check( Integer.parseInt( ( tempStr.substring( 1 ) ) ) );
				}
				else {
					return true;
				}
			}
			else {
				return false;
			}

		}
		return false;
	}
}
