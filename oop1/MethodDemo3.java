import java.util.Random;

public class MethodDemo3 {

	// ����(1~9)�� �߻���Ű�� �޼ҵ� �����
	public int random() {
		Random rd = new Random();
		return rd.nextInt(9)+1;
		
		
	} // end random();
	

	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		
		double number = md.random(); // int -> double(auto)
		System.out.println("������ ���� : "+number);
		


	} // end main();
 }