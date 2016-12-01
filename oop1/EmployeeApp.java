public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empSeq = 123;
		emp.empName = "가가";
		emp.empPhone = "01012345678";
		emp.empDept = "개발부서";
		emp.empPosition = "대리";
		emp.empSalay = 3000000;

		int anuualSalay = emp.getAnnualSalay();
		System.out.println("연    봉 : "+anuualSalay);

		emp.displayInfo();

	} // end main();
}