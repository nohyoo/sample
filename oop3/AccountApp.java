public class AccountApp {
	public static void main(String[] args) {
		
		Account ac = new Account("Gaga", "123-456-2553-12", 2985, 52930020);

		ac.info();
//		System.out.println(ac.owner); // deny access error
		System.out.println("�� �� �� : "+ac.getOwner());
		System.out.println("���¹�ȣ : "+ac.getAccountNumber());
d

	} // end main();
}
