public class EmployeeApp {
	public static void main(String[] args) {

		// 5명의 사원정보를 관리하기
		Employee[] emps = new Employee[3];

		//	사원 정보
		Employee emp1 = new Employee();
		emp1.no = 23;
		emp1.name = "가가";


		// 영업사원 정보
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "나나";
		emp2.result = 80;
		emp2.goal = 100;

		// 개발사원 정보
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "다다";
		emp3.completed = 7;
		emp3.todo = 10;

		emps[0] = emp1;
		emps[1] = emp2;
		emps[2] = emp3;-


		for (Employee e : emps) {
		//	e.print();

			if (e instanceof Sales) {
				((Sales)e).drawGraph();
			} else if (e instanceof Developer) {
				((Developer)e).develop();
			}


		}

	} // end main();
}