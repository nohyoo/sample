public class PhoneApp {
	public static void main(String[] args) {

		Phone sp1 = new Phone();
		
		String telNumber = "01012345678";
		String company = "KT";
		sp1.setTelNumber(telNumber);
		sp1.setCompany(company);

		Phone sp2 = new Phone(telNumber, company);

		sp1.displayInfo();
		sp2.displayInfo();



	} // end main();
}