public class ArrayDemo1 {
	public static void main(String[] args) {

		// Use Array & Collection case
		// for (int x : numbers)  
		// for (String y : names)

		int[] numbers = {5, 2, 34, 21, 25};

		int total = 0;

		for (int x : numbers) {
			total += x;
			
		}
		System.out.println(total);


	} // end main();
}