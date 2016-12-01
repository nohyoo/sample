public class DBAccess {
	
	private static DBAccess sgt = new DBAccess();

	private DBAccess() {}

	static DBAccess getInstance() {
		return sgt;
	}

	public void insert() {
		System.out.println("입력 작업");	
	}


	public void update() {
		System.out.println("수정 작업");	
	}

	public void delete() {
		System.out.println("삭제 작업");
	}


	public void retreieve() {
		System.out.println("조회 작업");
	}


}