import java.util.*;
public class Demo7 {
	public static void main(String[] args) throws Exception {

		// ������ ���ڸ� �Է¹޾Ƽ� �� ���� ¦������ Ȧ������
		// ���׿����ڸ� �̿��ؼ� ����� ǥ���ϱ�

		Scanner sc = new Scanner(System.in);
		
		int inputData = 0;
		int code = 0;

		System.out.println("������ ���ڸ� �Է��� �ּ���.");
		inputData = sc.nextInt();

		code = (inputData%2 == 0) ? 0 : 1;


		if ( code == 0 ) {
			System.out.println("�Է��Ͻ� ���� "+inputData+"�� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���� "+inputData+"�� Ȧ���Դϴ�.");
		}
		
	}
}