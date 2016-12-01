import java.io.*;

public class ExceptionDemo3 {

	public static void writing() throws HtaException {
	
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "oh yeah! Echo Primary Colleage Festival!!!";
			writer.write(text);
			writer.flush();
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");

		} catch (FileNotFoundException e) {
			throw new HtaException();

		} catch (IOException e) {
			throw new HtaException();

		}

	}


	public static void reading() throws HtaException {
	
	//	���� ���ϸ� memo.txt	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("text : " + text);

		} catch (FileNotFoundException e) {
			 // FileNotFoundException �� ����ä��, ��� HtaException�� �����ؼ� ����.
			 throw new HtaException();

		} catch (IOException e) {
			// IOException �� ����ä��, ��� HtaException�� �����ؼ� ����.
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