import java.util.*;

public class Quiz6 {
	public static void main(String[] args) {
	/*
		�̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
		(�ʵ� ����, �⺻������, getter/setter)

		^�� �������� ���ڿ� �߶� �迭�� ���

		�迭�� ��������� �ϳ��� �����ؼ� ,�� �߶� �迭�� ���

		Employee ��ü�� ���� ��������� �� �����͸� Employee ��ü�� �����ϱ�

		Employee ��ü�� employees �迭�� �����ϱ�

		Employee �迭�� ����� ���� ����ϱ�
	*/
		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";
		StringTokenizer stz = new StringTokenizer(text, "^");

		Employee[] employees = new Employee[4];

		String[] arr = new String[4];
		String[] data = new String[4];

		
		int i=0;
		while (stz.hasMoreTokens()) {
			arr[i] = stz.nextToken();
			i++;
		}

		
		for (int j=0; j<data.length; j++) {
		//	data = arr[j].split(",");
			System.out.println(arr[j]);
		}
		

	} // end main();
}