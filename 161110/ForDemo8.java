public class ForDemo8 {
	public static void main(String[] args) {

	// 

	int i = 0;
	int j = 0;

	for (i=1; i<=5 ; i++) {
		for (j=1; j<=(6-i) ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	} // end main()
}