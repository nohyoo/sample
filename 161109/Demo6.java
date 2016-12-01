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
		
		
		System.out.println("사용하실 금액을 입력하세요.");
		inputMoney = sc.nextInt();

		System.out.println("1.커피(1,500원) 2.과일주스(2,000원) 3.이온음료(1,000원)");
		System.out.println("음료를 선택해 주세요.");
		code = sc.next();


		if (code.equals("1")) {
			returnCoin = inputMoney-coffeePrice;
			System.out.println("선택하신 커피를 받아가세요. \n 잔돈은 " +returnCoin+" 입니다.");
		
		} else if (code.equals("2")) {
			returnCoin = inputMoney-juicePrice;
			System.out.println("선택하신 과일주스를 받아가세요. \n 잔돈은 " +returnCoin+" 입니다.");
		
		} else if (code.equals("3")) {
			returnCoin = inputMoney-ionPrice;
			System.out.println("선택하신 이온음료를 받아가세요. \n 잔돈은 " +returnCoin+" 입니다.");
		
		} else {
			System.out.println("메뉴를 다시 확인해 주세요.");
		}
	
		
	}
}