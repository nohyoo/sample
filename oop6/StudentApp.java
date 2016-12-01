public class StudentApp {
	public static void main(String[] args) {

		Student s = new Student();
		StudentService ss = new StudentService();

		// �л����� ��ȸ
		Student retrieve = ss.retrieveInfo(12);
		System.out.println("======== �� �� �� �� �� ȸ ========");
		System.out.println("��    ȣ : "+retrieve.getNo());
		System.out.println("��    �� : "+retrieve.getName());
		System.out.println("��    �� : "+retrieve.getGrade());
		System.out.println("�� �� ó : "+retrieve.getPhone());
		System.out.println("===================================");


		// �г����� ��ȸ getStudentsByGrade
		Student[] getGrade = ss.getStudentsByGrade(3);
		for (Student tmp : getGrade) {
			System.out.println("======== �� �� �� �� �� ȸ========");
			System.out.println("��    ȣ : "+tmp.getNo());
			System.out.println("��    �� : "+tmp.getName());
			System.out.println("��    �� : "+tmp.getGrade());
			System.out.println("�� �� ó : "+tmp.getPhone());
			System.out.println("===================================");
		}

		
		// �л����� ����
		Student student2 = new Student(27, 4, "ü����", "01012345678");
		ss.modifyInfo(student2);


		// �л����� ����
		ss.deleteInfo(12);
		

	} // end main();
}