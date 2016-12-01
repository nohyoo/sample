import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		
		for (;;) {

		System.out.println("서비스 메뉴를 선택해주세요.");
		System.out.println("1.계좌등록  2.계좌조회  3.비밀번호 변경");
		System.out.println("4.입금      5.출금      6.종료");
		int code = sc.nextInt();

		
			
			if (code == 1) {
				// 계좌등록
				System.out.print("이름을 입력해주세요 : ");
				ac.setName(sc.next());
				System.out.print("비밀번호를 입력해주세요 : ");
				ac.setPasswd(sc.next());
				System.out.print("최초 입금액을 입력해주세요 : ");
				ac.setBalance(sc.nextInt());
				ac.setAccount("1111-23456-11");

				System.out.println("계좌 생성이 완료되었습니다.");

			} else if (code == 2) {
				// 계좌조회
				System.out.println("======== 계좌 정보 조회 ========");
				System.out.println("사 용 자 : "+ac.getName());
				System.out.println("계좌번호 : "+ac.getAccount());
				System.out.println("잔    액 : "+ac.getBalance());

			} else if (code == 3) {
				// 비밀번호 변경
				System.out.print("현재 비밀번호를 입력해주세요 : ");
				String inputPasswd = sc.next();

				if (inputPasswd.equals(ac.getPasswd())) {
					System.out.print("새 비밀번호를 입력해주세요 : ");
					ac.setPasswd(sc.next());
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}


			} else if (code == 4) {
				// 입금
				System.out.print("입금하실 금액을 입력하세요 : ");
				int inputAmount = sc.nextInt();
				int balance = ac.getBalance();
				balance += inputAmount;
				ac.setBalance(balance);

				System.out.println(inputAmount+"원 입금이 완료되었습니다.");

			} else if (code == 5) {
				// 출금
				System.out.print("현재 비밀번호를 입력해주세요 : ");
				String inputPasswd = sc.next();

				if (inputPasswd.equals(ac.getPasswd())) {
					System.out.print("출금하실 금액을 입력하세요 : ");
					
					int inputAmount = sc.nextInt();
					int balance = ac.getBalance();
					balance -= inputAmount;
					ac.setBalance(balance);
					System.out.println(inputAmount+"원 출금이 완료되었습니다.");

				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}


			} else if (code == 6) {
				// 프로그램 종료
				System.out.println("은행 프로그램을 종료합니다.");
				break;

			}


		} // end for();
		
	} // end main();
}
