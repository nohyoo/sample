public class ForDemo5 {
	public static void main(String[] args) {

	// 1~100������ ���� ����ϱ�
	// ��, �հ谡 3000�� �Ѿ ������ ���ڸ� �˾Ƴ���

	int i = 0;
	int result = 0;

	for (i=1; i<=100 ; i++) {
		result += i;

		if (result >= 3000) {
			break;
		}
//		System.out.println(result+ " "+i);
	}
	System.out.println("3000�� �Ѿ ������ �� : "+result);
	System.out.println("3000�� �Ѿ ���� ���� �� : "+i);

	} // end main()
}