import java.util.Scanner;

public class ForDemo6 {
	public static void main(String[] args) {

	// 

	Scanner sc = new Scanner(System.in);
	int menuNo = 0;

	for (; ;) {
		System.out.println("[1]��ȸ   [2]���   [3]����   [0]����");
		System.out.println("�޴��� �����ϼ���");

		menuNo= sc.nextInt();


		if (menuNo == 1) {
			System.out.println("������ ��ȸ�մϴ�...");
		} else if (menuNo == 2) {
			System.out.println("������ ����մϴ�...");
		} else if (menuNo == 3) {
			System.out.println("������ �����մϴ�...");
		} else if (menuNo == 0) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		} else {
			System.out.println("�޴��� �ٽ� �������ּ���.");
		}
	}

	} // end main()
}