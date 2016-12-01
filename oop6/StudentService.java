/*
	StudentService��
		�л������� ����/��ȸ/����/�����ϴ� ����� �����ϴ� Ŭ����

*/
public class StudentService {
	
	Student s = new Student();
	private Student[] db = new Student[5];

	// �л����� ����(�׳� ����)
	public StudentService() {
		db[0] = new Student(5, 3, "����", "01011111111");
		db[1] = new Student(12, 1, "����", "01033333333");
		db[2] = new Student(22, 2, "�ٴ�", "01044444444");
		db[3] = new Student(27, 3, "���", "01055555555");
		db[4] = new Student(30, 4, "����", "01022222222");

	}


	// �л����� ��ȸ
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

//	�г��� ���޹޾Ƽ� �� �г⿡ �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
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

	// �л����� ����
	public void deleteInfo(int no) {
		
		for (Student tmp : db) {
			if (no == tmp.getNo()) {
				tmp.setNo(0);
				tmp.setName(null);
				tmp.setGrade(0);
				tmp.setPhone(null);
				System.out.println("======= ���� �� ���� =======");
				System.out.println("��    �� : "+tmp.getNo());
				System.out.println("��    �� : "+tmp.getName());
				System.out.println("��    �� : "+tmp.getGrade());
				System.out.println("�� �� ó : "+tmp.getPhone());
				System.out.println("============================");
				break;
			}
		}
		
	}


	// �л������� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� �����ϴ� �޼ҵ�
	public void modifyInfo(Student student) {
		for (Student tmp : db) {
			if (tmp.getNo() == student.getNo()) {
				s.setNo(student.getNo());
				s.setName(student.getName());
				s.setGrade(student.getGrade());
				s.setPhone(student.getPhone());
				System.out.println("====== ����� ���� ======");
				System.out.println("��    �� : "+s.getNo());
				System.out.println("��    �� : "+s.getName());
				System.out.println("��    �� : "+s.getGrade());
				System.out.println("�� �� ó : "+s.getPhone());
				System.out.println("==========================");
				break;
			}
		}

	}

}