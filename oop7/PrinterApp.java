public class PrinterApp {
	public static void main(String[] args) {

		// ���
		Printer p = new Printer();
		p.print("Gogo!");

		// �÷�
		ColorPrinter cp = new ColorPrinter();
		cp.print("color Yeah!");
		cp.print("align");

		// ����
		PhotoPrinter pp = new PhotoPrinter();
		pp.print("photo");
		pp.feed();

	} // end main();
}