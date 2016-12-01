public class DesktopApp {
	public static void main(String[] args) {

		BallMouse om = new BallMouse();
		Desktop pc = new Desktop();

		pc.setMouse(om);

		pc.running();	// click
		pc.painting();	// moving


		pc.clean();


	}	// end main();
}