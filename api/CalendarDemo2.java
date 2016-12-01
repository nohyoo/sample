import java.util.Date;
import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {

	//	Date -> Calendar	
		Date date = new Date();
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time); // 아래와 같은 결과
		cal.setTime(date);		   // 위와 같은 결과


	//	Calendar -> Date
		Date date2 = cal.getTime();
		

	} // end main();
}