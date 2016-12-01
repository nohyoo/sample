public class CarApp {
	public static void main(String[] args) {
	
		Car car = new Car();
		
		car.speedUp();
		car.speedDown();
		car.speed = 50;

		System.out.println(car);
		System.out.println("현재 속도 : "+car.speed+"km");

	} // end main();
}