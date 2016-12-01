import java.io.*;

public class ExceptionDemo4 {

	public static void writing() {
	
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "oh yeah! Echo Primary Colleage Festival!!!";
			writer.write(text);
			writer.flush();
			System.out.println("파일 생성이 완료되었습니다.");

		} catch (FileNotFoundException e) {
			throw new L2Exception();

		} catch (IOException e) {
			throw new L2Exception();

		}

	}


	public static void reading() {
	
	//	정상 파일명 memo.txt	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("mem7o.txt"));
			String text = reader.readLine();
			System.out.println("text : " + text);

		} catch (FileNotFoundException e) {
			 // FileNotFoundException 을 가로채고, 대신 L2Exception을 생성해서 던짐.
			 throw new L2Exception();

		} catch (IOException e) {
			// IOException 을 가로채고, 대신 L2Exception을 생성해서 던짐.
			throw new L2Exception();
		}
		
	}

	public static void main(String[] args) {

		reading();
		writing();

	}	// end main();
}