public class Car {

	// �Ӽ�(�ʵ�) ����
	int speed;

	// ���(�޼ҵ�) ����
	public void speedUp() {
		speed += 10;
		System.out.println("���ӵ� ���� �ӵ� : "+speed+"km");

	} // end speedUp();
	

	public void speedDown() {
		speed -= 10;
		System.out.println("���ӵ� ���� �ӵ� : "+speed+"km");

	} // end speedDown();

 }