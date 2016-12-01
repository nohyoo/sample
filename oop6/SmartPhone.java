public class SmartPhone extends Phone {

	String ip;
	String email;

	public void web(String url) {
		System.out.println("["+url+"]로 접속합니다.");
	}


	public void sendEmail(String to, String title, String text) {
		System.out.println("["+email+"]에서 ["+to+"]로 ["+title+"] 제목의 ["+text+"]의 내용을 전송합니다.");
	}
}