 public class MethodDemo1 {

	public int add(int x, int y) {
		System.out.println("사용자 정의된 add(int) 메소드입니다.");
		return x+y;

	} // end add(int);

	public double add(double x, double y) {
		System.out.println("사용자 정의된 add(double) 메소드입니다.");
		return x+y;

	} // end add(double);
	
	public static void main(String[] args) {
		MethodDemo1 md = new MethodDemo1();

		int a = 5;
		int b = 8;
		double c = 3.5;
		double d = 6.5;
		int result1 = md.add(a,b);
		double result2 = md.add(c,d);

		System.out.println("add int -> "+result1);
		System.out.println("add double -> "+result2);


	} // end main();
 }