public class SmartPhoneApp {
	public static void main(String[] args) {
/*
		SmartPhone sp = new SmartPhone();
*/
		String telNumber = "01012345678";
		String company = "KT";
		String ip = "192.168.0.1";
/*		
		sp.setTelNumber(telNumber);
		sp.setCompany(company);
		sp.setIp(ip);
		sp.displayInfo();
*/		
		SmartPhone sp = new SmartPhone(telNumber, company, ip);
		sp.displayInfo();

		
		

	} // end main();
}