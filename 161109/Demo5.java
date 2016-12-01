import java.util.*;
//import java.text.SimpleDateFormat;
public class Demo5 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Calendar cr = Calendar.getInstance();
		
		int year;
		int distance;
		int todayYear = cr.get(Calendar.YEAR);
		int todayMonty = cr.get(Calendar.MONTH)+1;
		int todayDate = cr.get(Calendar.DATE);
		int hour = cr.get(Calendar.HOUR);
		int minute = cr.get(Calendar.MINUTE);
		int sec = cr.get(Calendar.SECOND);
		System.out.println("Calendar Data : " +cr);
		System.out.println("todayYear Data : " +todayYear);
		System.out.println("todayMonty Data : " +todayMonty);
		System.out.println("todayDate Data : " +todayDate);
		System.out.println("hour Data : " +hour);
		System.out.println("minute Data : " +minute);
		System.out.println("sec Data : " +sec);


		System.out.println("사용 기간을 입력하세요(년도) : ");
		year = sc.nextInt();

		System.out.println("운행거리를 입력하세요(km) : ");
		distance = sc.nextInt();
		
		// 사용 기간이 5년 이상이거나 운행 거리가 100,000km 이상이면
		// 유상수리대상이고, 그 외의 경우는 무상수리대상입니다.


		if ( todayYear-year >= 5 || distance >= 100000) {
			System.out.println("고객님 차량은 유상수리대상입니다.");
		
		} else {
			System.out.println("고객님 차량은 무상수리대상입니다.");
		}

	}
}