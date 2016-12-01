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
		System.out.println("글번호 : " + p.getNo());
		System.out.println("제  목 : " + p.getTitle());
		System.out.println("내  용 : " + p.getText());
		System.out.println("작성일 : " + p.getPrettyRegdate());


	} // end main();
}