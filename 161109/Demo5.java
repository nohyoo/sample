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


		System.out.println("��� �Ⱓ�� �Է��ϼ���(�⵵) : ");
		year = sc.nextInt();

		System.out.println("����Ÿ��� �Է��ϼ���(km) : ");
		distance = sc.nextInt();
		
		// ��� �Ⱓ�� 5�� �̻��̰ų� ���� �Ÿ��� 100,000km �̻��̸�
		// �����������̰�, �� ���� ���� �����������Դϴ�.


		if ( todayYear-year >= 5 || distance >= 100000) {
			System.out.println("���� ������ �����������Դϴ�.");
		
		} else {
			System.out.println("���� ������ �����������Դϴ�.");
		}

	}
}