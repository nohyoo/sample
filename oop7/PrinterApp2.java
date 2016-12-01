public class PrinterApp2 {
	public static void main(String[] args) {

		Printer p = new Printer();
		Printer cp = new ColorPrinter();
		Printer pp = new PhotoPrinter();

		ColorPrinter p1 = (ColorPrinter) cp;
		p1.chargeInk();

		PhotoPrinter p2 = (PhotoPrinter) pp;
		p2.edit();

		Printer p3 = (Printer) p2;
		p3.print("2016-11-22");

		p.print("��������...");
		cp.print("������Ȳ...");
		pp.print("�������...");

	} // end main();
}