import java.util.*;
public class Quiz5 {
	public static void main(String[] args) throws Exception {

		// ����, ����, ���������� �Է¹޾Ƽ�
		// ����, ���, ������ ����ϱ�
		// ������ 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, �׿ܴ� F

		Scanner sc = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;

		System.out.println("���� ������ �Է����ּ���.");
		kor = sc.nextInt();

		System.out.println("���� ������ �Է����ּ���.");
		eng = sc.nextInt();

		System.out.println("���� ������ �Է����ּ���.");
		math = sc.nextInt();
	 
		total = kor + eng + math;
		avg = total/3;

		System.out.println("�Է��Ͻ� �������� "+ kor + "��, �������� "+ eng +"��, �������� "+ math +"���Դϴ�.");
		System.out.println("������ " + total +"�� �Դϴ�.");
		System.out.println("����� " + avg +"�� �Դϴ�.");

		if (avg >= 90) {
			System.out.println("������ A �Դϴ�");
		} else if (avg >= 80) {
			System.out.println("������ B �Դϴ�");
		} else if (avg >= 70) {
			System.out.println("������ C �Դϴ�");
		} else if (avg >= 60) {
			System.out.println("������ D�Դϴ�.");
		} else {
			System.out.println("������ F�Դϴ�.");
		}
	
		
	}
}