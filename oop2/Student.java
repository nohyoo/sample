public class Student {
	
	int no;
	String name;
	int kor;
	int eng;
	int math;


	// 기본 생성자
	public Student() {
		no = 15;
		name = "Gaga";
		kor = 90;
		eng = 95;
		math = 100;
	}


	// 모든 필드를 초기화하는 생성자
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 총점을 반환하는 메소드
	public int getTotal() {
		int total = kor + eng + math;

		return total;
	}


	// 평균을 반환하는 메소드
	public double getAvg() {
		double avg = getTotal()/3.0;
		
		return avg;
	}


	// 학생 정보 조회
	public void getInfo() {
		System.out.println("====== Student Info ======");
		System.out.println("학    번 : "+no);
		System.out.println("이    름 : "+name);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총    점 : "+getTotal());
		System.out.println("평    균 : "+getAvg());
		System.out.println("==========================");


	}

}