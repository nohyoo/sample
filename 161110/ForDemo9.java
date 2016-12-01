public class ForDemo9 {
	public static void main(String[] args) {

	// 

	int x = 0;
	int y = 0;
	int code = 0;

	for (x=1; x<=10 ; x++) {
		for (y=1; y<=10; y++) {
			code = 4*x + 5*y;
			
			if (code == 60) {
				System.out.printf("(%2d, %2d) \n",x,y);
			//	System.out.println(x+","+y);
			}

		}
		
	}

	} // end main()
}