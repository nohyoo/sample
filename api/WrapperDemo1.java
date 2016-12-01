public class WrapperDemo1 {
	public static void main(String[] args) {

		Integer i = new Integer(23);
		int x = i.intValue();

		System.out.println(i);
		System.out.println(x);
		
//		Integer a = "2";	// error
		Integer b = new Integer("2");
		Integer c = Integer.valueOf("3");


	} // end main();
}