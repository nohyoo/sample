public class CApp {
	public static void main(String[] args) throws Exception {

		Class.forName("C");
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();


//		c1.test();
		System.out.println(c1.x);
		System.out.println(c1.y);



	} // end main();
}