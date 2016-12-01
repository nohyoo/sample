public class AccountApp {
	public static void main(String[] args) {
		
		Account ac = new Account("Gaga", "123-456-2553-12", 2985, 52930020);

		ac.info();
//		System.out.println(ac.owner); // deny access error
		System.out.println("예 금 주 : "+ac.getOwner());
		System.out.println("계좌번호 : "+ac.getAccountNumber());
d

	} // end main();
}
