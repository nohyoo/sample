import java.util.Date;

public class MethodDemo4 {

	// 오늘 날짜를 반환하는 메소드 만들기
	public String getDate() {
		Date now = new Date();
		String str = now.toString();

		return str;
		
	} // end getDate();
	

	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4();
		
		String date = md.getDate();
		System.out.println(date);
		

	} // end main();
 }