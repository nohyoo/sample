public class ArrayDemo3 {
	public static void main(String[] args) {

	//	
		String[][] names = {{"가가", "나나"},{"다다","라라","마마"},{"바바"}};

		System.out.println("array size : "+names.length);
		System.out.println("first array size : "+names[0].length);
		System.out.println("second array size : "+names[1].length);
		System.out.println("third array size : "+names[2].length);

		for (int i=0; i<names.length; i++) {
			System.out.println(i+" line");
			for (int j=0; j<names[i].length ; j++) {
				System.out.println(names[i][j]);
			}
		
		}


	} // end main();
}