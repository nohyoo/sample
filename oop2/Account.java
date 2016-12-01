/*
	은행계좌를 표현하는 클래스
	- 속성
		예금주
		계좌번호
		비밀번호
		잔액
	- 기능
		출금 - 금액과 비밀번호를 받아서 비밀번호가 일치하면 진행
		입금 - 금액을 전달 받아서 진행
*/

public class Account {
	
	String name;
	String accountNo;
	String pwd;
	int balance;


	public Account() {
		name = "가가";
		accountNo = "123-456-789";
		pwd = "5555";
		balance = 100000;
	}

	public void deposit(int m) {
		balance += m;
		System.out.println(m+"원 입금이 완료되었습니다.");
		System.out.println("잔액은 "+balance+"원 입니다.");
		
	} // end deposit();


	public int withdraw(String p, int m) {
		if (!pwd.equals(p)) {
			System.out.println("출금실패 : 비밀번호가 일치하지 않습니다.");
			return 0;
		}

		if (balance < m) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		
		balance -= m;
		System.out.println(m+"원 출금이 완료되었습니다.");
		System.out.println("잔액은 "+balance+"원 입니다.");
		return balance;
	} // end withdraw();


	public void checking(String p) {
		if (pwd.equals(p)) {
			System.out.println("===== 계좌  정보 ======");
			System.out.println("사 용 자 "+name);
			System.out.println("계좌 번호 "+accountNo);
			System.out.println("현재 잔액 "+balance+"원");
			System.out.println("=======================");

		} else {
			System.out.println("조회실패 : 비밀번호가 일치하지 않습니다.");

		}
	} // end checking;


}