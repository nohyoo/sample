public class PhoneApp {
	public static void main(String[] args) {

//		SmartPhone p = new SmartPhone();
		
		String telNumber = "01012345678";
		String company = "KT";
		String ip = "192.168.0.1";
//		p.setTelNumber(telNumber);
//		p.setCompany(company);

		SmartPhone p = new SmartPhone(telNumber, company, ip);


	} // end main();
}