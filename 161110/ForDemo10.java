import java.util.Scanner;

public class ForDemo10 {
	public static void main(String[] args) {

	// 

	Scanner sc = new Scanner(System.in);
	int balance = 0;
	int menuNo = 0;
	int inputMoney = 0;

	for (; ;) {
		System.out.println("=====================================");
		System.out.println("[1]�Ա�   [2]���   [3]�ܰ�   [0]����");
		System.out.println("=====================================");
		System.out.println("����>");

		menuNo = sc.nextInt();


		if (menuNo == 1) {
			System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
			inputMoney = sc.nextInt();	
			balance += inputMoney;
			System.out.println(inputMoney+"�� �Ա��� ����ó�� �Ǿ����ϴ�.");

		} else if (menuNo == 2) {
			System.out.println("����� �ݾ��� �Է����ּ���.");
			inputMoney = sc.nextInt();	
			if (inputMoney <= balance) {
				balance -= inputMoney;
				System.out.println(inputMoney+"�� ����� ����ó�� �Ǿ����ϴ�.");
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}

			
		} else if (menuNo == 3) {
			System.out.println("���� �ܾ��� "+balance+"���Դϴ�.");
		} else if (menuNo == 0) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		} else {
			System.out.println("�޴��� �ٽ� �������ּ���.");
		}
	}

	} // end main()
}