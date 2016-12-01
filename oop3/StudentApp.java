import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �л�����(��ȣ, �̸�, ����, ����, ����) 
		int no = 0;
		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.print("�л� ��ȣ�� �Է����ּ��� : ");
		no = sc.nextInt();

		System.out.print("�л� �̸��� �Է����ּ��� : ");
		name = sc.next();

		System.out.print("���� ������ �Է����ּ��� : ");
		kor = sc.nextInt();

		System.out.print("���� ������ �Է����ּ��� : ");
		eng = sc.nextInt();

		System.out.print("���� ������ �Է����ּ��� : ");
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
			System.out.println("��    �� "+s.getNo());
			System.out.println("��    �� "+s.getName());
			System.out.println("�������� "+s.getKor());
			System.out.println("�������� "+s.getEng());
			System.out.println("�������� "+s.getMath());
			System.out.println("��    �� "+s.getTotal());
			System.out.println("��    �� "+s.getAvgRound());
			System.out.println();
		
		}

	} // end main();
}