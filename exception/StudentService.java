import java.io.*;

public class StudentService {
	
	public static void reading() {
		
		try {

			BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
			String text = reader.readLine();
			String[] arr = text.split(",");
			Student s = new Student();

			String name = arr[0];
			String grade = arr[1];
			int kor = Integer.parseInt(arr[2]);
			int eng = Integer.parseInt(arr[3]);
			int math = Integer.parseInt(arr[4]);
			s.setName(name);
			s.setGrade(grade);
			s.setKor(kor);
			s.setEng(eng);
			s.setMath(math);
				
			System.out.println("이    름 : "+s.getName());
			System.out.println("학    년 : "+s.getGrade());
			System.out.println("국어점수 : "+s.getKor());
			System.out.println("영어점수 : "+s.getEng());
			System.out.println("수학점수 : "+s.getMath());


		} catch (FileNotFoundException e) {
			 // FileNotFoundException 을 가로채고, 대신 L2Exception을 생성해서 던짐.
			 throw new L2Exception();

		} catch (IOException e) {
			// IOException 을 가로채고, 대신 L2Exception을 생성해서 던짐.
			throw new L2Exception();
		}
		
	}


}