import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo1 {
	public static void main(String[] args) {

	//	���� ���ϸ� memo.txt
		try {
			BufferedReader reader = new BufferedReader(new FileReader("meme.txt"));

			String text = reader.readLine();
			System.out.println("text : "+text);
			
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();	// printStackTrace() ������ ���� �� �� �ִ� ����
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}


	} // end main();
}