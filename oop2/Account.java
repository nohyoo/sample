/*
	������¸� ǥ���ϴ� Ŭ����
	- �Ӽ�
		������
		���¹�ȣ
		��й�ȣ
		�ܾ�
	- ���
		��� - �ݾװ� ��й�ȣ�� �޾Ƽ� ��й�ȣ�� ��ġ�ϸ� ����
		�Ա� - �ݾ��� ���� �޾Ƽ� ����
*/

public class Account {
	
	String name;
	String accountNo;
	String pwd;
	int balance;


	public Account() {
		name = "����";
		accountNo = "123-456-789";
		pwd = "5555";
		balance = 100000;
	}

	public void deposit(int m) {
		balance += m;
		System.out.println(m+"�� �Ա��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("�ܾ��� "+balance+"�� �Դϴ�.");
		
	} // end deposit();


	public int withdraw(String p, int m) {
		if (!pwd.equals(p)) {
			System.out.println("��ݽ��� : ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}

		if (balance < m) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		
		balance -= m;
		System.out.println(m+"�� ����� �Ϸ�Ǿ����ϴ�.");
		System.out.println("�ܾ��� "+balance+"�� �Դϴ�.");
		return balance;
	} // end withdraw();


	public void checking(String p) {
		if (pwd.equals(p)) {
			System.out.println("===== ����  ���� ======");
			System.out.println("�� �� �� "+name);
			System.out.println("���� ��ȣ "+accountNo);
			System.out.println("���� �ܾ� "+balance+"��");
			System.out.println("=======================");

		} else {
			System.out.println("��ȸ���� : ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");

		}
	} // end checking;


}