public class DBAccess {
	
	private static DBAccess sgt = new DBAccess();

	private DBAccess() {}

	static DBAccess getInstance() {
		return sgt;
	}

	public void insert() {
		System.out.println("�Է� �۾�");	
	}


	public void update() {
		System.out.println("���� �۾�");	
	}

	public void delete() {
		System.out.println("���� �۾�");
	}


	public void retreieve() {
		System.out.println("��ȸ �۾�");
	}


}