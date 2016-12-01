public class Account {
	
	private String owner;
	private String accountNumber;
	private int password;
	private int balance;

	public Account(String owner, String accountNumber, int password, int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}

	
	public String getOwner() {
		return owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void info() {
		System.out.println("owner : "+owner);
		System.out.println("accountNumber : "+accountNumber);
		System.out.println("password : "+password);
		System.out.println("balance : "+balance);
	}

}