/*
	StudentService는
		학생정보를 저장/조회/삭제/변경하는 기능을 제공하는 클래스

*/
public class StudentService {
	
	Student s = new Student();
	private Student[] db = new Student[5];

	// 학생정보 저장(그냥 생성)
	public StudentService() {
		db[0] = new Student(5, 3, "가가", "01011111111");
		db[1] = new Student(12, 1, "나나", "01033333333");
		db[2] = new Student(22, 2, "다다", "01044444444");
		db[3] = new Student(27, 3, "라라", "01055555555");
		db[4] = new Student(30, 4, "마마", "01022222222");

	}


	// 학생정보 조회
	public Student retrieveInfo(int no) {
		Student result = null;
		for (Student tmp : db) {
			if (no == tmp.getNo()) {
				result = tmp;
				break;
			}
		}
		return result;
	}

//	학년을 전달받아서 그 학년에 해당하는 학생정보를 반환하는 메소드
	public Student[] getStudentsByGrade(int grade) {
		Student[] check = new Student[db.length];
		int x = 0;
		
		for (int i=0; i<db.length; i++) {
			if (grade == db[i].getGrade()) {
				check[x] = db[i];
				x++;
			}
		}

		Student[] result = new Student[x];
		for (int i=0; i<x; i++) {
			result[i] = check[i];
		}

		return result;
	}

	// 학생정보 삭제
	public void deleteInfo(int no) {
		
		for (Student tmp : db) {
			if (no == tmp.getNo()) {
				tmp.setNo(0);
				tmp.setName(null);
				tmp.setGrade(0);
				tmp.setPhone(null);
				System.out.println("======= 삭제 후 정보 =======");
				System.out.println("학    번 : "+tmp.getNo());
				System.out.println("이    름 : "+tmp.getName());
				System.out.println("학    년 : "+tmp.getGrade());
				System.out.println("연 락 처 : "+tmp.getPhone());
				System.out.println("============================");
				break;
			}
		}
		
	}


	// 학생정보를 전달받아서 그 학번에 해당하는 학생정보를 변경하는 메소드
	public void modifyInfo(Student student) {
		for (Student tmp : db) {
			if (tmp.getNo() == student.getNo()) {
				s.setNo(student.getNo());
				s.setName(student.getName());
				s.setGrade(student.getGrade());
				s.setPhone(student.getPhone());
				System.out.println("====== 변경된 정보 ======");
				System.out.println("학    번 : "+s.getNo());
				System.out.println("이    름 : "+s.getName());
				System.out.println("학    년 : "+s.getGrade());
				System.out.println("연 락 처 : "+s.getPhone());
				System.out.println("==========================");
				break;
			}
		}

	}

}