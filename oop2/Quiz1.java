public class Quiz1 {

	// �迭�� �޾Ƽ� �� �� ���� ū �� ���ϱ�
	public int getMax(int[] n) {
		int max = 0;
		for(int x : n) {
			if (max < x) {
				max = x;
			}
		}

		return max;
	}

	// �迭�� ���ڸ� �޾Ƽ� ���ڰ� �迭�� ���ԵǴ��� Ȯ���ϱ�
	public boolean checkNumber(int[] n, int a) {
		boolean result = false;
		for (int x : n) {
			if (x == a) {
				result = true;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		
		Quiz1 q = new Quiz1();  // static ���

		int[] number1 = {33, 25, 58, 42, 71, 63, 41, 91, 24};
		int[] number2 = {32, 58, 23, 96, 35, 1, 30, 69, 78};
		int result1 = q.getMax(number1);
		int result2 = q.getMax(number2);
		int num = 71;
		boolean check1 = q.checkNumber(number1, num);
		boolean check2 = q.checkNumber(number2, num);

		System.out.println("number1 Max : "+result1);
		System.out.println("number2 Max : "+result2);
		System.out.println("check1 : "+check1);
		System.out.println("check2 : "+check2);

				

	} // end main();
}