public class CalculatorApp {
	public static void main(String[] args) {

		Calculator ca = new Calculator();
		double result1 = ca.add(5.0,6.0,12.5);
		int result2 = ca.add(4,2);

		System.out.println(result1);
		System.out.println(result2);
		

	} // end main();
}