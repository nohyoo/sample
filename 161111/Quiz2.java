import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

	//	���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
	//	1. �л� ���� �Է¹ޱ�
	//	2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
	//  3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
	//	4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		Scanner sc = new Scanner(System.in);
		int stuCnt = 0;
		int score = 0;
		int total = 0;
		double avg = 0;


		System.out.print("���� ������ �� �л����� ���� �Է��ϼ��� :");
		stuCnt = sc.nextInt();

		int[] scores = new int[stuCnt];
		
		
		for (int i=0; i<stuCnt ; i++) {
			System.out.print("�л����� ������ �Է����ּ��� :");
			score = sc.nextInt();
			scores[i] = score;
		}

		
		for (int a : scores) {
			total += a;
		}		
		avg = total/stuCnt;

	
		System.out.println("�л� �� : "+stuCnt);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);


	} // end main();
}