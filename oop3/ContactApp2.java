import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {

	// ����ó ������ �Է¹޴� ȭ��
		Scanner sc = new Scanner(System.in);

		ContactMgr mgr = new ContactMgr();
		Contact contact = new Contact();

		for ( ;; ) {
			System.out.println("�޴� ��ȣ�� �Է����ּ���.");
			System.out.println("1.���   2.��ȸ   3.����");
			
			int menuCode = sc.nextInt();	
			
			if (menuCode == 1) {
				// ���
				// mgr�� addContact() �̿�  ��ü ����
				System.out.print("�̸��� �Է����ּ��� : ");
				String inputName = sc.next();
				System.out.print("��ȭ��ȣ�� �Է����ּ��� : ");
				String inputPhone = sc.next();
				System.out.print("�̸����� �Է����ּ��� : ");
				String inputEmail = sc.next();
				
				contact.setSeq(mgr.getPosition());
				contact.setName(inputName);
				contact.setPhone(inputPhone);
				contact.setEmail(inputEmail);
				mgr.addContact(contact);
			
			} else if (menuCode == 2) {
				// ��ȸ
				mgr.viewContact();
			
			} else if (menuCode == 3) {
				// ����
				break;
		
			} else {
				System.out.println("�޴� ��ȣ�� Ȯ�� �� �Է����ּ���.");
			}
			
		} // end for();

	} // end main();
}