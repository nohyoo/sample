import java.util.Scanner;
public class Quiz2 {
	public static void main(String[] args) {

	// 3�ڸ� �����޾� 100, 10, 1�ڸ����ں� ����ϼ���.
	// ������ 4��° Java Excute 2�� �����ϼ���.

	Scanner sn = new Scanner(System.in);

	int inputData = 0;
	int dv1 = 0;
	int dv2 = 0;
	int dv3 = 0;

	System.out.println("���ڸ��� ������ �Է����ּ���.");
	inputData = sn.nextInt();
 
	dv1 = inputData/100;
	dv2 = (inputData - (dv1*100))/10;
	dv3 = (inputData - ((dv1*100) + (dv2*10)));

	System.out.println("100�� �ڸ����� " + dv1 +"�Դϴ�.");
	System.out.println("10�� �ڸ����� " + dv2 +"�Դϴ�.");
	System.out.println("1�� �ڸ����� " + dv3 +"�Դϴ�.");

	}
}