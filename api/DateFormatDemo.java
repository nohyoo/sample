import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateFormatDemo {
	public static void main(String[] args) {

		Date now = new Date();

	//	String pattern = "yyyy.MM.dd hh:mm:ss";
	//	String pattern = "yy�� MM�� dd�� E����";
		String pattern = "a hh�� mm�� ss��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		String text = sdf.format(now);
		System.out.println(text);



	} // end main();
}