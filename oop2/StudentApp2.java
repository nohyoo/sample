public class StudentApp2 {
	public static void main(String[] args) {

	//	학생들을 여러 명 저장하는 배열 만들기

		Student st1 = new Student(10, "Gaga", 60, 50, 60);
		Student st2 = new Student(15, "Nana", 70, 40, 70);
		Student st3 = new Student(20, "Dada", 80, 30, 90);
		Student st4 = new Student(25, "Lala", 90, 20, 100);
		Student st5 = new Student(30, "Mama", 100, 70, 60);
		
		Student[] student = new Student[5];
		student[0] = st1;
		student[1] = st2;
		student[2] = st3;
		student[3] = st4;
		student[4] = st5;
/*
		// 배열 생성
		for (int i=0; i<student.length; i++) {
			student[i] = st1;	// Java에서 안됨? 문자+숫자
		}
*/

		// 배열 출력
		for (Student x : student ) {
			x.getInfo();
		}



	} // end main();
}