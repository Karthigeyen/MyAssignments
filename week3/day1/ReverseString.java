package week3.day1;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Amazon";
		String lowerCase = str.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
			
		}
}

}
