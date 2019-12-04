import java.util.ArrayList;

/**Suppose you have an ArrayList of String's. Write a recursive method that
	returns true if the strings in the array are in lexicographic (effectively alphabetic)
	order, and false otherwise.
 * 
 */

/**
 * @author Tuna Dalbeler
 *
 */
public class PartC {

	public static void main(String[] args) {

		String s1 ,s2 ,s3 ,s4, s5, s6 ,s7 , s8;

		s1 = "ana";
		s2 = "baba";
		s3 = "cengiz";
		s4 = "cengiz";
		s5 = "ceylan";
		s6 = "fakir";
		s7 = "semiramis";
		

		ArrayList<String> list = new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		
		System.out.println( isLexic(list) );

	}

	public static boolean isLexic(ArrayList<String> list) {
		
		int comp = ( list.get(0) ).compareTo( list.get(1) );
		System.out.println(list.get(0) + "  compare with " + list.get(1));

		
		if (comp <= 0 ) { //Lexicographically less (closer to start in dictionary) or equal		TRUE CONDITION

			if (list.size() > 2) {
				
				list.remove(0);
				return isLexic(list);
				
			}
			else {
				return true;
			}

		}
		else if (comp > 0) { //Lexicographically greater (closer to end in dictionary)			FALSE CONDITION
			
			return false;
		}
		
		return false;
	}
	
	//************************************************************** Experimental *********************************************************************//
	/**
	          Sorts an array, using merge sort.
	          @param a the array to sort
	 */
	public static void sort(int[] a)
	{  
		if (a.length <= 1) { return; }
		int[] first = new int[a.length / 2];
		int[] second = new int[a.length - first.length];
		// Copy the first half of a into first, the second half into second
		for (int i = 0; i < first.length; i++) 
		{ 
			first[i] = a[i]; 
		}
		for (int i = 0; i < second.length; i++) 
		{ 
			second[i] = a[first.length + i]; 
		}
		sort(first);
		sort(second);
		merge(first, second, a);
	}

	/**
	         Merges two sorted arrays into an array
	         @param first the first sorted array
	         @param second the second sorted array
	         @param a the array into which to merge first and second
	 */
	private static void merge(int[] first, int[] second, int[] a)
	{  
		int iFirst = 0; // Next element to consider in the first array
		int iSecond = 0; // Next element to consider in the second array
		int j = 0; // Next open position in a

		// As long as neither iFirst nor iSecond is past the end, move
		// the smaller element into a
		while (iFirst < first.length && iSecond < second.length)
		{  
			if (first[iFirst] < second[iSecond])
			{  
				a[j] = first[iFirst];
				iFirst++;
			}
			else
			{  
				a[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}

		// Note that only one of the two loops below copies entries
		// Copy any remaining entries of the first array
		while (iFirst < first.length) 
		{ 
			a[j] = first[iFirst]; 
			iFirst++; j++;
		}
		// Copy any remaining entries of the second half
		while (iSecond < second.length) 
		{ 
			a[j] = second[iSecond]; 
			iSecond++; j++;
		}
	}
}
