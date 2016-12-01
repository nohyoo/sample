import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {

		String pattern = "#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);

		int number = 12345789;
		String text = df.format(number);
		
		System.out.println(text);


		String pattern2 = "#,###.0000";
		DecimalFormat df2 = new DecimalFormat(pattern2);

		double rate = 11112.345;
		String text2 = df2.format(rate);
		
		System.out.println(text2);


	} // end main();
}