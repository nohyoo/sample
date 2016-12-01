import java.io.*;
public class ExceptionDemo2 {
	
	public static void reading() throws Exception {

	//	정상 파일명 memo.txt	
		BufferedReader reader = new BufferedReader(new FileReader("meme.txt"));
		String text = reader.readLine();
		System.out.println("text : " + text);

	}



	public static void main(String[] args) {
		
		try {
			reading();

		} catch (Exception e) {
			e.printStackTrace();
		} 

	} // end main();
}