public class Developer extends Employee {

	int todo;
	int completed;

	public void print() {
		System.out.println("�����ȣ : " + no);
		System.out.println("����̸� : " + name);
		System.out.println("�ؾߵɰ� : " + todo);
		System.out.println("��    �� : " + completed);
		System.out.println("�� ô �� : " + (double)(completed*100/todo) + "%");
		System.out.println();
	}


	public void develop() {
		System.out.println("���� ����");
		System.out.println();
		completed++;
	}


}