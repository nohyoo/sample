public class FinalDemo2App {
	public static void main(String[] args) {

		FinalDemo2 fd1 = new FinalDemo2(5,8);
		FinalDemo2 fd2 = new FinalDemo2(10,30);

	//	fd2.setX(5);  final¿∫ setter æ»µ 
		fd1.setY(10);

		int x1 = fd1.getX();
		int y1 = fd1.getY();
		int x2 = fd2.getX();
		int y2 = fd2.getY();

		System.out.println("x1 : " + x1);
		System.out.println("y1 : " + y1);
		System.out.println("x2 : " + x2);
		System.out.println("y2 : " + y2);


	} // end main();
}