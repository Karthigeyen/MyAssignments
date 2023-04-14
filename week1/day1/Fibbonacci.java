package week1.day1;

public class Fibbonacci {
	
public static void main(String[] args) {
	int firstNum = 0, secNum = 1, sum = 0;
	System.out.println(firstNum);
	for (int i = 0; i < 9; i++) {
		sum= firstNum + secNum;
		firstNum = secNum;
		secNum = sum;	
		System.out.println(sum);
	}	
	}
}

