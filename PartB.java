/**Write a recursive method that takes a decimal value as an int parameter and
returns the hexadecimal equivalent of it as a string. For example, if your method is
passed the integer value 1249 (base ten) it should return the string "4E1".
 * 
 */

/**
 * @author Tuna Dalbeler
 *
 */
public class PartB {

	public static void main(String[] args) {
		
		int decimal  = 1249;
		
		System.out.println( decimalConvertToHex(decimal) );
		
	}
	
	public static String decimalConvertToHex(int dec) {
        int reminder = 0;
        String hexStr = "";
        

        if(dec != 0) {
        	
             reminder = dec % 16 ;
             dec = dec - reminder;
             dec = dec / 16;
             
        	 hexStr = decimalConvertToHex(dec);
             
             if(reminder < 10) {
                  hexStr = reminder + hexStr;
             }
             else {
                  if(reminder == 10) { hexStr = "A" + hexStr; }
                  else if(reminder == 11) { hexStr = "B" + hexStr; }
                  else if(reminder == 12) { hexStr = "C" + hexStr; }
                  else if(reminder == 13) { hexStr = "D" + hexStr; }
                  else if(reminder == 14) { hexStr = "E" + hexStr; }
                  else if(reminder == 15) { hexStr = "F" + hexStr; }
            }              
        }
        return hexStr;
   }
}
	
