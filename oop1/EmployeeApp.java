public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empSeq = 123;
		emp.empName = "����";
		emp.empPhone = "01012345678";
		emp.empDept = "���ߺμ�";
		emp.empPosition = "�븮";
		emp.empSalay = 3000000;

		int anuualSalay = emp.getAnnualSalay();
		System.out.println("��    �� : "+anuualSalay);

		emp.displayInfo();

	} // end main();
}