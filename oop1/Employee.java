/*

	public class Employee

	사원번호 이름 전화번호 소석부서 직위 급여


	연봉을 계산해서 반환하는 메소드
	사원의 모든 정보를 출력하는 메소드



	배열 받아서 가장 큰 값

	배열과 숫자 받아서 그 배열에 숫자가 포함되었는지 체크 메소드

*/

public class Employee {
	int empSeq;
	String empName;
	String empPhone;
	String empDept;
	String empPosition;
	int empSalay;


	public int getAnnualSalay() {
		return empSalay * 12;
	} // end getAnnualSalay();


	public void displayInfo() {
		System.out.println("===== 직원 정보 조회 =====");
		System.out.println("직원번호 : "+ empSeq);
		System.out.println("이    름 : "+ empName);
		System.out.println("연 락 처 : "+ empPhone);
		System.out.println("소속부서 : "+ empDept);
		System.out.println("직    급 : "+ empPosition);
		System.out.println("월    급 : "+ empSalay);
		System.out.println("연    봉 : "+ getAnnualSalay());
		System.out.println("=========================");
	}


}