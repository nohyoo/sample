public class StudentApp {
	public static void main(String[] args) {

		Student s = new Student();
		StudentService ss = new StudentService();

		// 학생정보 조회
		Student retrieve = ss.retrieveInfo(12);
		System.out.println("======== 학 생 정 보 조 회 ========");
		System.out.println("번    호 : "+retrieve.getNo());
		System.out.println("이    름 : "+retrieve.getName());
		System.out.println("학    년 : "+retrieve.getGrade());
		System.out.println("연 락 처 : "+retrieve.getPhone());
		System.out.println("===================================");


		// 학년정보 조회 getStudentsByGrade
		Student[] getGrade = ss.getStudentsByGrade(3);
		for (Student tmp : getGrade) {
			System.out.println("======== 학 년 정 보 조 회========");
			System.out.println("번    호 : "+tmp.getNo());
			System.out.println("이    름 : "+tmp.getName());
			System.out.println("학    년 : "+tmp.getGrade());
			System.out.println("연 락 처 : "+tmp.getPhone());
			System.out.println("===================================");
		}

		
		// 학생정보 변경
		Student student2 = new Student(27, 4, "체인지", "01012345678");
		ss.modifyInfo(student2);


		// 학생정보 삭제
		ss.deleteInfo(12);
		

	} // end main();
}