public class MethodDemo5 {

	// �̵�ﰢ���� ���̸� ���Ͻÿ�
	public double getArea(double width, double height) {
		double result = (width*height)/2;

		return result;
		
	} // end getArea();
	

	public static void main(String[] args) {
		MethodDemo5 md = new MethodDemo5();
		
		double a = 4.0;
		double b = 3.0;
		double area = md.getArea(a,b);
		System.out.println(area);
		

	} // end main();
 }