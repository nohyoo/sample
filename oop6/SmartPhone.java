public class SmartPhone extends Phone {

	String ip;
	String email;

	public void web(String url) {
		System.out.println("["+url+"]�� �����մϴ�.");
	}


	public void sendEmail(String to, String title, String text) {
		System.out.println("["+email+"]���� ["+to+"]�� ["+title+"] ������ ["+text+"]�� ������ �����մϴ�.");
	}
}