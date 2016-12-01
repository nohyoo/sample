import java.util.Scanner;

public class ForDemo10 {
	public static void main(String[] args) {

	// 

	Scanner sc = new Scanner(System.in);
	int balance = 0;
	int menuNo = 0;
	int inputMoney = 0;

	for (; ;) {
		System.out.println("=====================================");
		System.out.println("[1]입금   [2]출금   [3]잔고   [0]종료");
		System.out.println("=====================================");
		System.out.println("선택>");

		menuNo = sc.nextInt();


		if (menuNo == 1) {
			System.out.println("입금할 금액을 입력해주세요.");
			inputMoney = sc.nextInt();	
			balance += inputMoney;
			System.out.println(inputMoney+"원 입금이 정상처리 되었습니다.");

		} else if (menuNo == 2) {
			System.out.println("출금할 금액을 입력해주세요.");
			inputMoney = sc.nextInt();	
			if (inputMoney <= balance) {
				balance -= inputMoney;
				System.out.println(inputMoney+"원 출금이 정상처리 되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}

			
		} else if (menuNo == 3) {
			System.out.println("고객님 잔액은 "+balance+"원입니다.");
		} else if (menuNo == 0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else {
			System.out.println("메뉴를 다시 선택해주세요.");
		}
	}

	} // end main()
}