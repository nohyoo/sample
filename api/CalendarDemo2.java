import java.util.Date;
import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {

	//	Date -> Calendar	
		Date date = new Date();
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time); // �Ʒ��� ���� ���
		cal.setTime(date);		   // ���� ���� ���


	//	Calendar -> Date
		Date date2 = cal.getTime();
		

	} // end main();
}