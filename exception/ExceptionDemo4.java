import java.io.*;

public class ExceptionDemo4 {

	public static void writing() {
	
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "oh yeah! Echo Primary Colleage Festival!!!";
			writer.write(text);
			writer.flush();
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");

		} catch (FileNotFoundException e) {
			throw new L2Exception();

		} catch (IOException e) {
			throw new L2Exception();

		}

	}


	public static void reading() {
	
	//	���� ���ϸ� memo.txt	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("mem7o.txt"));
			String text = reader.readLine();
			System.out.println("text : " + text);

		} catch (FileNotFoundException e) {
			 // FileNotFoundException �� ����ä��, ��� L2Exception�� �����ؼ� ����.
			 throw new L2Exception();

		} catch (IOException e) {
			// IOException �� ����ä��, ��� L2Exception�� �����ؼ� ����.
			throw new L2Exception();
		}
		
	}

	public static void main(String[] args) {

		reading();
		writing();

	}	// end main();
}