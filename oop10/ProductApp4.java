public class ProductApp4 {
	public static void main(String[] args) throws CloneNotSupportedException {

		Product original = new Product("¿¬ÇÊ", 500);
		System.out.println(original);

		Product copyProduct = original.copy();
		System.out.println(copyProduct);
		
		



	} // end main();
}