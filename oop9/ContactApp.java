public class ContactApp {
	public static void main(String[] args) {

	//	�ּҷ�����(�̸�, ��ȭ��ȣ[], �ּ�())�� �����ϴ� ��ü ����	
		Contact contact = new Contact();

		String name = "����";
		contact.setName(name);


	//	��ȭ��ȣ ���� ����
		Tel[] phones = new Tel[10];

		Tel tel1 = new Tel();
		tel1.setType("����Ʈ��");
		tel1.setNumber("01011111111");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel2.setType("����");
		tel2.setNumber("0259595959");
		phones[1] = tel2;
		contact.setTels(phones);


	//	�ּ� ���� ����
		Address addr = new Address();
		addr.setSido("����");
		addr.setGugun("����");
		addr.setDetail("���� ��Ƹ� 4��");
		contact.setAddress(addr);
		

	}	// end main();
}