public class PhoneApp {
	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.telNumber = "01012345678";
		sp.call("01088889999");
		sp.message("01088889999","alright");

		sp.ip = "192.168.0.1";
		sp.email = "haha@gmail.com";
		sp.web("www.google.com");
		sp.sendEmail("receive@gmail.com","Hello~","hihihihibyebyebye");

		FeaturePhone fp = new FeaturePhone();
		fp.telNumber = "01059594949";
		fp.message("01023233434","That's OK");
		fp.keypad();

	}	// end main();
}