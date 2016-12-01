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
				
			System.out.println("��    �� : "+s.getName());
			System.out.println("��    �� : "+s.getGrade());
			System.out.println("�������� : "+s.getKor());
			System.out.println("�������� : "+s.getEng());
			System.out.println("�������� : "+s.getMath());


		} catch (FileNotFoundException e) {
			 // FileNotFoundException �� ����ä��, ��� L2Exception�� �����ؼ� ����.
			 throw new L2Exception();

		} catch (IOException e) {
			// IOException �� ����ä��, ��� L2Exception�� �����ؼ� ����.
			throw new L2Exception();
		}
		
	}


}