public class PrinterApp3 {
	public static void main(String[] args) {

		Printer p = new ColorPrinter();

		p.feed();
		p.print("³»¿ë");

		ColorPrinter p2 = (ColorPrinter) p;
		p2.dpi = 600;
		p2.chargeInk();

		((ColorPrinter) p).chargeInk();

	} // end main();
}