public class Quiz1 {
	public static void main(String[] args) {

	//	�ִ밪 ���ϱ�

		int max = 0;
		int[] array = {1, 5, 3, 8, 2};

		for (int i : array ) {
			if (i > max) {
				max = i;
			}
		}

		System.out.println("max : "+max);


	} // end main();
}