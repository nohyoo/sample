/*
	Banking Program 
	1. ���� ���
		- �̸�, ��й�ȣ, ���� �Աݾ��� �Է¹޾Ƽ� ���¸� ����
		- ���¹�ȣ�� �ڵ�����
	2. ���� ��ȸ
		- �̸�, ���¹�ȣ, �ܾ��� ǥ��
	3. ��й�ȣ ����
		- ���� ��й�ȣ�� �� ��й�ȣ�� �޾Ƽ� ���� ��ȣ ��ġ�ϸ� ����
	4. �Ա�
		- �Աݾ��� �޾Ƽ� �ܾ��� ����
	5. ���
		- ��ݾװ� ��й�ȣ�� �Է¹޾Ƽ� ���
	6. ����
		- ���α׷� ����
*/

public class Account {

	private String name;
	private String passwd;
	private String account;
	private int balance;

	public Account() { }


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


}