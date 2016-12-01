import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address addr = new Address();
	

		for ( ;; ) {
			System.out.println("=============================");
			System.out.println("�̿��Ͻ� �޴��� �������ּ���.");
			System.out.println("1.�̸����     2.��ȭ��ȣ���");
			System.out.println("3.�ּҵ��     4.�ּҷ�  ��ȸ");
			System.out.println("5.��    ��                   ");
			System.out.println("=============================");
	
			int selected = sc.nextInt();
			
			if (selected == 1) {
			//	�̸��� �Է¹޾Ƽ� Contact�� ����
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.next();
				contact.setName(name);
				System.out.println(name+"�� ��ϵǾ����ϴ�.");

			
			} else if (selected == 2) {
			//	��ȭ��ȣ ���� �Է¹޾Ƽ� Contact�� ����
			//	Tel��ü ���� -> �� �Է¹޾Ƽ� ä��� 
			//	->  Contact�� addTel(Tel tel)���� Tel ��ü �����ؼ� �迭�� ���
				Tel tel = new Tel();
				
				System.out.print("����ó ������ �Է��ϼ��� : ");
				String type = sc.next();
				tel.setType(type);
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				String number = sc.next();
				tel.setNumber(number);
				contact.addTel(tel);
				
				
			} else if (selected == 3) {
			//	�ּ� ������ �Է¹޾Ƽ� Contact�� ����
			//	Address ��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact setter �̿� ����
				System.out.print("�õ��� �Է��ϼ��� : ");
				String sido = sc.next();
				addr.setSido(sido);
				System.out.print("������ �Է��ϼ��� : ");
				String gugun = sc.next();
				addr.setGugun(gugun);
				System.out.print("���ּҸ� �Է��ϼ��� : ");
				String detail = sc.next();
				addr.setDetail(detail);
				contact.setAddress(addr);
				System.out.println("�ּ� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
			

			} else if (selected == 4) {
				System.out.println("======= �� �� �� ȸ ==========");
				System.out.println("�̿��� �̸� : "+ contact.getName());
				System.out.println("========= �� �� ó ===========");
				for (int i=0; i<contact.getTelsLength(); i++) {
					System.out.println("��    ��  : "+ contact.getTels()[i].getType());
					System.out.println("��ȭ��ȣ  : "+ contact.getTels()[i].getNumber());
				}
				
				String adr = addr.getSido() + " " + addr.getGugun() + " " + addr.getDetail();
				System.out.println("�̿��� �ּ� : " + adr );
				System.out.println("==============================");
			
			} else if (selected == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			
			} else {
				System.out.println("�޴��� �ٽ� �������ּ���.");
			}

		} // end for();

	} // end main();
}