public class ForDemo3 {
	public static void main(String[] args) {

	// �μ��� �� �� 3�ǹ���� ���

	int i = 0;
	int j = 0;
	int result = 0;

	for (i=1; i<10 ; i++) {
		for (j=1; j<10 ; j++) {
			if ((i+j)%3 == 0) {
				result = i+j;
				System.out.println(i+" + "+j+" = "+result);
			}
		}
	}

	} // end main()
}