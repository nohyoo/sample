import java.util.*;
public class Demo6 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int inputMoney = 0;
		int coffeePrice = 1500;
		int juicePrice = 2000;
		int ionPrice = 1000;
		int returnCoin = 0;
		String code;
		
		
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
		inputMoney = sc.nextInt();

		System.out.println("1.Ŀ��(1,500��) 2.�����ֽ�(2,000��) 3.�̿�����(1,000��)");
		System.out.println("���Ḧ ������ �ּ���.");
		code = sc.next();


		if (code.equals("1")) {
			returnCoin = inputMoney-coffeePrice;
			System.out.println("�����Ͻ� Ŀ�Ǹ� �޾ư�����. \n �ܵ��� " +returnCoin+" �Դϴ�.");
		
		} else if (code.equals("2")) {
			returnCoin = inputMoney-juicePrice;
			System.out.println("�����Ͻ� �����ֽ��� �޾ư�����. \n �ܵ��� " +returnCoin+" �Դϴ�.");
		
		} else if (code.equals("3")) {
			returnCoin = inputMoney-ionPrice;
			System.out.println("�����Ͻ� �̿����Ḧ �޾ư�����. \n �ܵ��� " +returnCoin+" �Դϴ�.");
		
		} else {
			System.out.println("�޴��� �ٽ� Ȯ���� �ּ���.");
		}
	
		
	}
}