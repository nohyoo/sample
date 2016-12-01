public class ForDemo4 {
	public static void main(String[] args) {

	// ±¸±¸´Ü

	int i = 0;
	int j = 0;
	int result = 0;

	for (j=1; j<10 ; j++) {
		for (i=2; i<10 ; i++) {
			result = i*j;
			System.out.print(i+" * "+j+" = "+result+ "\t");

		}
		System.out.println();
	}

	} // end main()
}