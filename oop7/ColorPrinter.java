public class ColorPrinter extends Printer {

	int dpi;

	public void print(String text) {
		System.out.println("["+text+"]를 컬러로 인쇄합니다.");
	}

	public void chargeInk() {
		System.out.println("잉크를 충전합니다.");
	}

}