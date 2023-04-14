package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] ch = new char [test.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = test.charAt(i);
		}
		for (char c : ch) {
			System.out.println(c);
		}
		
		
	}

}
