public class MemberService {

	// ������
	private Member member;

	// �α��� ����
	private boolean auth = false;

	public MemberService(Member member) {
		this.member = member;
	}
	
	public boolean isAuth() {
		return auth;
	}


	// ���̵�� ����� ���޹ٴ缭 �α��� ���θ� üũ�Ͻÿ�.
	// �α��ο��θ� auth�� ���
	public void login(String id, String password) {
		if (id.equals(member.getId()) && password.equals(member.getPassword())) {
			auth = true;
		}
	}


	// ���̵� ���޹޾Ƽ� �α׾ƿ� ó���ϱ� (auth�� ���� false�� �ٲٱ�)
	public void logout(String id) {
		if (id.equals(member.getId())) {
			auth = false;
		}
	}


/*
	// ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean login(String id, String password) {
		boolean result = false;
					
		if (id == member.getId() && password == member.getPassword()) {
			result = true;
		}

		return result;
	}


	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�
	public boolean logout(String id) {
		boolean result = false;
		
		if (id == member.getId()) {
			result = true;
		}

		return result;
	}
*/


}