public class Sales extends Employee {

	int result;
	int goal;
	
	//	������ �°� print() �޼ҵ� ������
	public void print() {
		System.out.println("�����ȣ : " + no);
		System.out.println("����̸� : " + name);
		System.out.println("�� ǥ �� : " + goal);
		System.out.println("��    �� : " + result);
		System.out.println("�� �� �� : " + (double)(result*100/goal) + "%");
		System.out.println();
	}

	public void drawGraph() {
		
		System.out.print("�� ǥ �� : ");
		for (int i=0; i<goal; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("��    �� : ");

		for (int i=0; i<result; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}