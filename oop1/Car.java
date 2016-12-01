public class Car {

	// 속성(필드) 정의
	int speed;

	// 기능(메소드) 정의
	public void speedUp() {
		speed += 10;
		System.out.println("가속된 현재 속도 : "+speed+"km");

	} // end speedUp();
	

	public void speedDown() {
		speed -= 10;
		System.out.println("감속된 현재 속도 : "+speed+"km");

	} // end speedDown();

 }