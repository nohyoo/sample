public class AccountApp {
	public static void main(String[] args) {

		Account ac = new Account();

		int amout = 50000;
		String pwd ="5555";

		// �Ա�
		ac.deposit(amout);


		// ���
		int withdrawResult = ac.withdraw(pwd, amout);
				

		// ��ȸ
		ac.checking(pwd);

	} // end main();
}