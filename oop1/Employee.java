/*

	public class Employee

	�����ȣ �̸� ��ȭ��ȣ �Ҽ��μ� ���� �޿�


	������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	����� ��� ������ ����ϴ� �޼ҵ�



	�迭 �޾Ƽ� ���� ū ��

	�迭�� ���� �޾Ƽ� �� �迭�� ���ڰ� ���ԵǾ����� üũ �޼ҵ�

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
		System.out.println("===== ���� ���� ��ȸ =====");
		System.out.println("������ȣ : "+ empSeq);
		System.out.println("��    �� : "+ empName);
		System.out.println("�� �� ó : "+ empPhone);
		System.out.println("�ҼӺμ� : "+ empDept);
		System.out.println("��    �� : "+ empPosition);
		System.out.println("��    �� : "+ empSalay);
		System.out.println("��    �� : "+ getAnnualSalay());
		System.out.println("=========================");
	}


}