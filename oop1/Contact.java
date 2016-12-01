public class Contact {
	
	int seq;
	String name;
	String phone;
	String email;


	public void call() {
		System.out.println(phone+"으로 통화를 시도합니다.");
	} // end call();

	public void sendMessage() {
		System.out.println(phone+"으로 문자를 발송합니다.");
	} // end sendMessage();

	public void sendEmail() {
		System.out.println(email+"로 이메일을 발송합니다.");
	} // end sendEmail();
}