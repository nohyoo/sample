import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {

	// ����, ����, ���������� �Է¹޾Ƽ� 
	// ���հ� ��� ���
	// ������ 4��° Java Excute 2�� �����ϼ���.

	Scanner sn = new Scanner(System.in);

	int kor = 0;
	int eng = 0;
	int math = 0;
	int total = 0;
	double avg = 0;

	System.out.println("���� ������ �Է����ּ���.");
	kor = sn.nextInt();

	System.out.println("���� ������ �Է����ּ���.");
	eng = sn.nextInt();

	System.out.println("���� ������ �Է����ּ���.");
	math = sn.nextInt();
 
	total = kor + eng + math;
	avg = total/3;

	System.out.println("�Է��Ͻ� �������� "+ kor + "��, �������� "+ eng +"��, �������� "+ math +"���Դϴ�.");
	System.out.println("������ " + total +"�� �Դϴ�.");
	System.out.println("����� " + avg +"�� �Դϴ�.");

	}
}