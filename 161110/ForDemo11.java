import java.util.*;

public class ForDemo11 {
	public static void main(String[] args) {

	// ���ε� Ż�� 
	// �հ谡 7�� ��� ���ε���
	// ������ ��츸 ���ε� Ż��

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	for (; ; ) {

		int firstDice = 0;  // ù��° �ֻ��� ��
		int secondDice = 0; // �ι�° �ֻ��� ��
		int sumDice = 0;    // �� �ֻ��� ��
		int locked = 0;     // ���ε��� ���� 0:���� 1~3:���ε�
		int locate = 0;     // ���� �̵� ��
		int inputCode = 0;  // ����� �޴� ���� ��

		System.out.println("=============================");
		System.out.println("[1]�ֻ��� ������     [0] ����");
		System.out.println("=============================");

		inputCode = sc.nextInt();

		if (inputCode == 1) {
			for (int i=1; i<=10 ; i++) {
				System.out.println("===== �ֻ����� �����ϴ�! =====");
				firstDice = rd.nextInt(6) + 1;
				secondDice = rd.nextInt(6) + 1;
				sumDice = firstDice + secondDice;

				if (locked != 0) {
					if (firstDice == secondDice) {
						locked = 0;
						locate += sumDice;
						System.out.println("���ε� Ż�⿡ ����!");
						System.out.println(sumDice+"ĭ �̵�!");
					} else {
						locked -= 1;
						System.out.println("���ε� Ż�� ����!");
					}
				} else {
					if (sumDice == 7) {
						locked = 3;
						System.out.println("���ε���!");
					} else {
						locate += sumDice;
						System.out.println(sumDice+"ĭ �̵�!");
					}
				}
				
				
				System.out.println("ù��° �ֻ��� : "+firstDice);
				System.out.println("�ι�° �ֻ��� : "+secondDice);
				System.out.println("���� �̵��� ��ġ : "+locate);
			}
		
		} else if (inputCode == 0) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		} else {
			System.out.println("�޴��� �ٽ� �������ּ���.");
		}
	}


	} // end main()
}