import java.util.Date;

public class PostingApp {
	public static void main(String[] args) {

		Posting p = new Posting(1, "Event", "Christmas Season", new Date());
/*
		Date d = p.getRegdate();
		String pd = p.getPrettyRegdate();

		System.out.println("Date : "+d);
		System.out.println("format : "+pd);
*/
		System.out.println("�۹�ȣ : " + p.getNo());
		System.out.println("��  �� : " + p.getTitle());
		System.out.println("��  �� : " + p.getText());
		System.out.println("�ۼ��� : " + p.getPrettyRegdate());


	} // end main();
}