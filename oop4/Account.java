/*
	Banking Program 
	1. 계좌 등록
		- 이름, 비밀번호, 최초 입금액을 입력받아서 계좌를 생성
		- 계좌번호는 자동생성
	2. 계좌 조회
		- 이름, 계좌번호, 잔액을 표시
	3. 비밀번호 변경
		- 현재 비밀번호와 새 비밀번호를 받아서 현재 번호 일치하면 변경
	4. 입금
		- 입금액을 받아서 잔액을 증가
	5. 출금
		- 출금액과 비밀번호를 입력받아서 출금
	6. 종료
		- 프로그램 종료
*/

public class Account {

	private String name;
	private String passwd;
	private String account;
	private int balance;

	public Account() { }


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


}