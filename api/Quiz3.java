public class Quiz3 {
	public static void main(String[] args) {

	//	
		String text = "abcdefghijaaklmnopqrstuvwxyzAAABBB";
		String lowerText = text.toLowerCase();
		int[] arr = new int[26];

		
		for (int i=0; i<text.length(); i++) {
			int ch = lowerText.charAt(i) - 97;

			if (ch >= 0) {
				arr[ch]++;
			}
		}

		System.out.println("=============================");

//		for (int x : arr) {
//			System.out.println(x);
//		}

		for (int i=0; i<arr.length; i++) {
			System.out.println((char)(i+97) + " : " +arr[i]);
		}
		





	}	// end main();
}