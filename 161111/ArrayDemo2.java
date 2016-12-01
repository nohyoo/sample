public class ArrayDemo2 {
	public static void main(String[] args) {

	//	다중배열
	//	String[][] groups = new String[2][3];
		int i = 0;
		int j = 0;
	/*
		groups[0][0] = "가가";
		groups[0][1] = "나나";
		groups[0][2] = "다다";

		groups[1][0] = "라라";
		groups[1][1] = "마마";
		groups[1][2] = "바바";
	*/
		String[][] groups = {{"가가", "나나", "다다"},{"라라", "마마", "바바"}};

		for (i=0; i<2; i++ ) {
			for (j=0; j<3 ; j++) {
				System.out.printf("(%d, %d) -> %s", i, j, groups[i][j] + "\t");
			//	System.out.print(groups[i][j] + "\t");
			}
			System.out.println();
		}

		for (String[] group : groups ) {
			for (String name : group ) {
				System.out.println(name + "\t");
			}
			System.out.println();
		}


	} // end main();
}