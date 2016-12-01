public class ContactMgr {
	
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// ����ó ���
	public void addContact(Contact contact) {
		Contact c = new Contact();
		contacts[currentPosition] = c;
		c.setSeq(contact.getSeq());
		c.setName(contact.getName());
		c.setPhone(contact.getPhone());
		c.setEmail(contact.getEmail());
		currentPosition++;
	}

	// ����ó ��ȸ
	public void viewContact() {
		for (int i=0; i<currentPosition; i++) {
			System.out.println("��    ȣ : "+(contacts[i].getSeq()+1));
			System.out.println("��    �� : "+contacts[i].getName());
			System.out.println("��ȭ��ȣ : "+contacts[i].getPhone());
			System.out.println("�� �� �� : "+contacts[i].getEmail());
			System.out.println();
		}
	}

	public int getPosition() {
		return currentPosition;
	}

}
