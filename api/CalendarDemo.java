import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {

		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		long times = cal.getTimeInMillis();

		System.out.println("YEAR : " + year);
		System.out.println("MONTH : " + month);
		System.out.println("DAY : " + day);
		System.out.println("Times : " + times);
		System.out.println();
		
		
		Calendar birth = Calendar.getInstance();
		birth.set(1988,7,17);
		long lifeTime = (times - birth.getTimeInMillis())/1000;
		System.out.println(birth);
		System.out.println("lifeTime sec : "+lifeTime);
		System.out.println("lifeTime min : "+lifeTime/60);
		System.out.println("lifeTime hour : "+lifeTime/(60*60));
		System.out.println("lifeTime day : "+lifeTime/(60*60*24));
		System.out.println("lifeTime year : "+lifeTime/(60*60*24*365));
		System.out.println();


		Date date = birth.getTime();
		System.out.println(date);


	} // end main();
}