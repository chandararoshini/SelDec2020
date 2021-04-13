package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatortolearnargument cal = new Calculatortolearnargument();
		int add= cal.add(1, 3, 5);
		System.out.println(add);
		int sub =cal.sub(2, 10);
		System.out.println(sub);
		double mul=cal.multiple(10.05, 5.5);
		System.out.println(mul);
		float div=cal.div(50.50f, 5.00f);
		System.out.println(div);
	}

}
