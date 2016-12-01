public class AccountApp {
	public static void main(String[] args) {

		Account ac = new Account();

		int amout = 50000;
		String pwd ="5555";

		// 입금
		ac.deposit(amout);


		// 출금
		int withdrawResult = ac.withdraw(pwd, amout);
				

		// 조회
		ac.checking(pwd);

	} // end main();
}