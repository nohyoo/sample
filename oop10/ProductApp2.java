public class ProductApp2 {
	public static void main(String[] args) {

		Product p1 = new Product("연필", 500);
		Product p2 = new Product("연필", 500);
		
		// hashCode
		int val1 = p1.hashCode();
		int val2 = p2.hashCode();
		System.out.println(val1);
		System.out.println(val2);

		// toString
		String str1 = p1.toString();
		String str2 = p2.toString();
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(p1); // -> System.out.println(p1.toString);




		
	} // end main();
}