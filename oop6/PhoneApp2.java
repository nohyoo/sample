public class PhoneApp2 {
	public static void main(String[] args) {

		SmartPhone   p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();
		p1.ip = "192.168.0.1";
		p1.web("www.google.com");
		p1.telNumber = "01012123434";
		p1.call("010111111111");

		Phone        p3 = new SmartPhone();
		Phone        p4 = new FeaturePhone();
	//	p3.ip = "192.168.0.1";
	//	p3.web("www.google.com");
		p3.telNumber = "01012123434";
		p3.call("010111111111");


	}	// end main();
}
