public class PrinterApp {
	public static void main(String[] args) {

		// 흑백
		Printer p = new Printer();
		p.print("Gogo!");

		// 컬러
		ColorPrinter cp = new ColorPrinter();
		cp.print("color Yeah!");
		cp.print("align");

		// 사진
		PhotoPrinter pp = new PhotoPrinter();
		pp.print("photo");
		pp.feed();

	} // end main();
}