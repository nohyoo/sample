public class ArrayDemo2 {
	public static void main(String[] args) {

	//	���߹迭
	//	String[][] groups = new String[2][3];
		int i = 0;
		int j = 0;
	/*
		groups[0][0] = "����";
		groups[0][1] = "����";
		groups[0][2] = "�ٴ�";

		groups[1][0] = "���";
		groups[1][1] = "����";
		groups[1][2] = "�ٹ�";
	*/
		String[][] groups = {{"����", "����", "�ٴ�"},{"���", "����", "�ٹ�"}};

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