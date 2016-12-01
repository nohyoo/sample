import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 학생정보(번호, 이름, 국어, 영어, 수학) 
		int no = 0;
		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.print("학생 번호를 입력해주세요 : ");
		no = sc.nextInt();

		System.out.print("학생 이름을 입력해주세요 : ");
		name = sc.next();

		System.out.print("국어 점수를 입력해주세요 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수를 입력해주세요 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수를 입력해주세요 : ");
		math = sc.nextInt();
		System.out.println();


		Student[] student = new Student[3];

		Student st1 = new Student();
		st1.setNo(no);
		st1.setName(name);
		st1.setKor(kor);
		st1.setEng(eng);
		st1.setMath(math);

		Student st2 = new Student();
		st2.setNo(16);
		st2.setName("Nana");
		st2.setKor(75);
		st2.setEng(85);
		st2.setMath(80);

		Student st3 = new Student();
		st3.setNo(22);
		st3.setName("Dada");
		st3.setKor(60);
		st3.setEng(100);
		st3.setMath(90);

		student[0] = st1;
		student[1] = st2;
		student[2] = st3;


		for (Student s : student) {
			System.out.println("학    번 "+s.getNo());
			System.out.println("이    름 "+s.getName());
			System.out.println("국어점수 "+s.getKor());
			System.out.println("영어점수 "+s.getEng());
			System.out.println("수학점수 "+s.getMath());
			System.out.println("총    점 "+s.getTotal());
			System.out.println("평    균 "+s.getAvgRound());
			System.out.println();
		
		}

	} // end main();
}