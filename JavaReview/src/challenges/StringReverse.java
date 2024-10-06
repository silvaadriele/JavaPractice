package challenges;
import java.util.Scanner;
//the class objective is to simulate a reversion of a string.
//for example, receive from user ADRIELE and return ELEIRDA
//this has been done in three ways: using Java API, Loop and Swap
public class StringReverse {
	
	public static void main (String[] args) {
		System.out.println("Please enter a word");
		Scanner s = new Scanner(System.in);
		String string = s.next();
		
		System.out.println(reverseStringAPI(string));
		System.out.println(reverseStringLoop(string));
		System.out.println(reverseStringSwap(string));
		}
	
	private static String reverseStringAPI(String string) {
		var stringBuffer = new StringBuffer(string);
		return stringBuffer.reverse().toString();
		
	}
	
	private static String reverseStringLoop(String string) {
		StringBuilder reversed = new StringBuilder();
		for (int i = string.length()-1; i>=0; i--) {
			reversed.append(string.charAt(i));
		}
		return reversed.toString();
	}
	private static String reverseStringSwap(String string) {
		var arrayReversed = string.toCharArray();
		var lastIndex = string.length()-1;
		for (int i=0; i<string.length()/2; i++) {
			arrayReversed[i] = string.charAt(lastIndex - i);
			arrayReversed[lastIndex - i] = string.charAt(i);
		}
		
		return String.valueOf(arrayReversed);
	}
	
}
