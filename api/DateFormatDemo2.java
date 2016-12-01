import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormatDemo2 {
	public static void main(String[] args) throws ParseException {

	
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf = new  SimpleDateFormat(pattern);

		String text = "2016/16/54";
	
		Date date = sdf.parse(text);
		System.out.println(date);



	} // end main();
}