import java.io.*;

public class ExceptionDemo3 {

	public static void writing() throws HtaException {
	
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "oh yeah! Echo Primary Colleage Festival!!!";
			writer.write(text);
			writer.flush();
			System.out.println("파일 생성이 완료되었습니다.");

		} catch (FileNotFoundException e) {
			throw new HtaException();

		} catch (IOException e) {
			throw new HtaException();

		}

	}


	public static void reading() throws HtaException {
	
	//	정상 파일명 memo.txt	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("text : " + text);

		} catch (FileNotFoundException e) {
			 // FileNotFoundException 을 가로채고, 대신 HtaException을 생성해서 던짐.
			 throw new HtaException();

		} catch (IOException e) {
			// IOException 을 가로채고, 대신 HtaException을 생성해서 던짐.
			throw new HtaException();
		}
		
	}

	public static void main(String[] args) {

		try {
			reading();
			writing();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		


	}	// end main();
}