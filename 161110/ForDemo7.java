public class ForDemo7 {
	public static void main(String[] args) {

	// 
	int i = 0;

	System.out.println("break");
	for (i=1; i<=10 ;i++) {
		if(i%3 == 0) {
			break;
		}
		System.out.println(i);
	}

	System.out.println("continue");
	for (i=1; i<=10 ;i++) {
		if(i%3 == 0) {
			continue;
		}
		System.out.println(i);
	}

	} // end main()
}