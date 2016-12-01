public class ContactApp {
	public static void main(String[] args) {

		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.seq = 25;
		c1.name = "가가";
		c1.phone = "01012345678";
		c1.email = "gaga@gmail.com";

		c2.seq = 27;
		c2.name = "나나";
		c2.phone = "01098765432";
		c2.email = "nana@gmail.com";


		c1.call();
		c2.call();

		Contact[] contact = new Contact[10];
		contact[0] = c1;
		contact[1] = c2;


	} // end main();
}

