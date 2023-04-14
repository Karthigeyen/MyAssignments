package week3.day1;

public class Calculator extends iPad {
public void add(int a, int b) {
	System.out.println(a+b);
}
public void add(int a, int b, int c) {
	System.out.println(a+b+c);

}
public void mul(double a, double b) {
	System.out.println(a*b);

}
public void mul(int a, double b) {
System.out.println(a*b);
}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(3, 6);
	cal.add(3, 4, 5);
	cal.mul(5, 6);
	cal.mul(4, 5);
	cal.watchMovie();
}
}
