public class Student {
	
	int no;
	String name;
	int kor;
	int eng;
	int math;


	// �⺻ ������
	public Student() {
		no = 15;
		name = "Gaga";
		kor = 90;
		eng = 95;
		math = 100;
	}


	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// ������ ��ȯ�ϴ� �޼ҵ�
	public int getTotal() {
		int total = kor + eng + math;

		return total;
	}


	// ����� ��ȯ�ϴ� �޼ҵ�
	public double getAvg() {
		double avg = getTotal()/3.0;
		
		return avg;
	}


	// �л� ���� ��ȸ
	public void getInfo() {
		System.out.println("====== Student Info ======");
		System.out.println("��    �� : "+no);
		System.out.println("��    �� : "+name);
		System.out.println("�������� : "+kor);
		System.out.println("�������� : "+eng);
		System.out.println("�������� : "+math);
		System.out.println("��    �� : "+getTotal());
		System.out.println("��    �� : "+getAvg());
		System.out.println("==========================");


	}

}