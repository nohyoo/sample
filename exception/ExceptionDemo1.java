import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo1 {
	public static void main(String[] args) {

	//	정상 파일명 memo.txt
		try {
			BufferedReader reader = new BufferedReader(new FileReader("meme.txt"));

			String text = reader.readLine();
			System.out.println("text : "+text);
			
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();	// printStackTrace() 오류들 추적 할 수 있는 정보
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}


	} // end main();
}