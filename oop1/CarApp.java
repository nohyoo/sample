public class CarApp {
	public static void main(String[] args) {
	
		Car car = new Car();
		
		car.speedUp();
		car.speedDown();
		car.speed = 50;

		System.out.println(car);
		System.out.println("���� �ӵ� : "+car.speed+"km");

	} // end main();
}