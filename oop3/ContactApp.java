import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {

	// ����ó ������ �Է¹޴� ȭ��
		Scanner sc = new Scanner(System.in);

		Contact[] contact = new Contact[100];
		Contact ct = new Contact();
		int currentPosition = 0;

		for ( ;; ) {
			System.out.println("�޴� ��ȣ�� �Է����ּ���.");
			System.out.println("1.���   2.��ȸ   3.����");
			
			int menuCode = sc.nextInt();

			
			
			if (menuCode == 1) {
				// ���
				// currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				// currentPosition�� ���� 1����
				

			
			} else if (menuCode == 2) {
				// ��ȸ
				// currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ�

			
			} else if (menuCode == 3) {
				// ����
				break;
			
			} else {
				System.out.println("�޴� ��ȣ�� Ȯ�� �� �Է����ּ���.");
			}
			
		} // end for();
	

	} // end main();
}