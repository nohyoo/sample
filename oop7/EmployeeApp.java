public class EmployeeApp {
	public static void main(String[] args) {

		// 5���� ��������� �����ϱ�
		Employee[] emps = new Employee[3];

		//	��� ����
		Employee emp1 = new Employee();
		emp1.no = 23;
		emp1.name = "����";


		// ������� ����
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "����";
		emp2.result = 80;
		emp2.goal = 100;

		// ���߻�� ����
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "�ٴ�";
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