import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz4 {
	public static void main(String[] args) {

	//	���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
	//	���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���  97~122 lower

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID�� �Է����ּ��� : ");
		String inputData = sc.next();
		boolean isLower = false;

		

		// ���̵� 6���� �̻����� üũ
		if (inputData.length() < 6) {
			System.out.println("���� ���̰� ª���ϴ�.");
		
		// ���̵� ���� �ҹ��ڷ� �����Ǿ����� üũ
		}
		
		for (int i=0; i<inputData.length(); i++) {
			int ch = inputData.charAt(i);
			if (ch < 97 || ch > 122) {
				isLower = true;
				break;
			}
		}
			
		if (isLower) {
			System.out.println("�ҹ��ڸ� �Է����ּ���.");
		}

		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, inputData);

		if (!valid) {
			System.out.println("��ȿ���� ����");
		}
	
		


	}	// end main();  
}