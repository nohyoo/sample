import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		
		for (;;) {

		System.out.println("���� �޴��� �������ּ���.");
		System.out.println("1.���µ��  2.������ȸ  3.��й�ȣ ����");
		System.out.println("4.�Ա�      5.���      6.����");
		int code = sc.nextInt();

		
			
			if (code == 1) {
				// ���µ��
				System.out.print("�̸��� �Է����ּ��� : ");
				ac.setName(sc.next());
				System.out.print("��й�ȣ�� �Է����ּ��� : ");
				ac.setPasswd(sc.next());
				System.out.print("���� �Աݾ��� �Է����ּ��� : ");
				ac.setBalance(sc.nextInt());
				ac.setAccount("1111-23456-11");

				System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");

			} else if (code == 2) {
				// ������ȸ
				System.out.println("======== ���� ���� ��ȸ ========");
				System.out.println("�� �� �� : "+ac.getName());
				System.out.println("���¹�ȣ : "+ac.getAccount());
				System.out.println("��    �� : "+ac.getBalance());

			} else if (code == 3) {
				// ��й�ȣ ����
				System.out.print("���� ��й�ȣ�� �Է����ּ��� : ");
				String inputPasswd = sc.next();

				if (inputPasswd.equals(ac.getPasswd())) {
					System.out.print("�� ��й�ȣ�� �Է����ּ��� : ");
					ac.setPasswd(sc.next());
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}


			} else if (code == 4) {
				// �Ա�
				System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
				int inputAmount = sc.nextInt();
				int balance = ac.getBalance();
				balance += inputAmount;
				ac.setBalance(balance);

				System.out.println(inputAmount+"�� �Ա��� �Ϸ�Ǿ����ϴ�.");

			} else if (code == 5) {
				// ���
				System.out.print("���� ��й�ȣ�� �Է����ּ��� : ");
				String inputPasswd = sc.next();

				if (inputPasswd.equals(ac.getPasswd())) {
					System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
					
					int inputAmount = sc.nextInt();
					int balance = ac.getBalance();
					balance -= inputAmount;
					ac.setBalance(balance);
					System.out.println(inputAmount+"�� ����� �Ϸ�Ǿ����ϴ�.");

				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}


			} else if (code == 6) {
				// ���α׷� ����
				System.out.println("���� ���α׷��� �����մϴ�.");
				break;

			}


		} // end for();
		
	} // end main();
}
