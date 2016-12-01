public class ContactMgr {
	
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// 연락처 등록
	public void addContact(Contact contact) {
		Contact c = new Contact();
		contacts[currentPosition] = c;
		c.setSeq(contact.getSeq());
		c.setName(contact.getName());
		c.setPhone(contact.getPhone());
		c.setEmail(contact.getEmail());
		currentPosition++;
	}

	// 연락처 조회
	public void viewContact() {
		for (int i=0; i<currentPosition; i++) {
			System.out.println("번    호 : "+(contacts[i].getSeq()+1));
			System.out.println("이    름 : "+contacts[i].getName());
			System.out.println("전화번호 : "+contacts[i].getPhone());
			System.out.println("이 메 일 : "+contacts[i].getEmail());
			System.out.println();
		}
	}

	public int getPosition() {
		return currentPosition;
	}

}
