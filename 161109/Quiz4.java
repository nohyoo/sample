import java.util.*;
public class Quiz4 {
	public static void main(String[] args) throws Exception {

		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�

		Scanner sc = new Scanner(System.in);
		
		int inputData = 0;
		int dv1 = 0;
		int dv2 = 0;
		String result1 = "";
		String result2 = "";
		String output = "���̻�";

		System.out.println("���ڸ� ���� ������ �Է����ּ���.");
		inputData = sc.nextInt();
	 
		dv1 = (inputData/10);
		dv2 = (inputData - (dv1*10));

		// ���� �ڸ� ����
		if (dv1 == 0) {
			result1 = "";
		} else if (dv1 == 1) {
			result1 = "��";
		} else if (dv1 == 2) {
			result1 = "�̽�";
		} else if (dv1 == 3) {
			result1 = "���";
		} else if (dv1 == 4) {
			result1 = "���";
		} else if (dv1 == 5) {
			result1 = "����";
		} else if (dv1 == 6) {
			result1 = "����";
		} else if (dv1 == 7) {
			result1 = "ĥ��";
		} else if (dv1 == 8) {
			result1 = "�Ƚ�";
		} else if (dv1 == 9) {
			result1 = "����";
		}
		
		// ���� �ڸ� ����
		if (dv2 == 0) {
			result2 = "";
			if (dv1 == 0) {
				result2 = "��";
			}
		} else if (dv2 == 1) {
			result2 = "��";
		} else if (dv2 == 2) {
			result2 = "��";
		} else if (dv2 == 3) {
			result2 = "��";
		} else if (dv2 == 4) {
			result2 = "��";
		} else if (dv2 == 5) {
			result2 = "��";
		} else if (dv2 == 6) {
			result2 = "��";
		} else if (dv2 == 7) {
			result2 = "ĥ";
		} else if (dv2 == 8) {
			result2 = "��";
		} else if (dv2 == 9) {
			result2 = "��";
		}
	
	
		output = result1 + result2;
		System.out.println("�Է��Ͻ� ���� "+inputData+"�� �ѱۺ�ȯ ���� "+output+"�Դϴ�.");

		
	}
}