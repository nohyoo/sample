public class Contact {
	
	int seq;
	String name;
	String phone;
	String email;


	public void call() {
		System.out.println(phone+"���� ��ȭ�� �õ��մϴ�.");
	} // end call();

	public void sendMessage() {
		System.out.println(phone+"���� ���ڸ� �߼��մϴ�.");
	} // end sendMessage();

	public void sendEmail() {
		System.out.println(email+"�� �̸����� �߼��մϴ�.");
	} // end sendEmail();
}