public class C {
	
	int x;
	static int y;

	// ���� �ʱ�ȭ ���
	// ���� ������ �ʱ�ȭ �۾��� �ʿ��� ���๮ ����
	// �ַ� ���α׷� ���࿡ ���Ǵ� �ܺ� ���ҽ� �����۾��� ����
	static {
		System.out.println("�ʱ�ȭ ��� ����");
		// ��������, ���� �޼ҵ带 ����� �� ����
		
	}


	public C() {
		System.out.println("������ ����");
	}

	public void test() {
			x = 6;
			y = 5;
			System.out.println("x : "+x);
			System.out.println("y : "+y);
		}

}