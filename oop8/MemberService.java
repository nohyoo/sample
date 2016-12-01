public class MemberService {

	// 고객정보
	private Member member;

	// 로그인 여부
	private boolean auth = false;

	public MemberService(Member member) {
		this.member = member;
	}
	
	public boolean isAuth() {
		return auth;
	}


	// 아이디와 비번을 전달바당서 로그인 여부를 체크하시오.
	// 로그인여부를 auth에 담기
	public void login(String id, String password) {
		if (id.equals(member.getId()) && password.equals(member.getPassword())) {
			auth = true;
		}
	}


	// 아이디를 전달받아서 로그아웃 처리하기 (auth의 값을 false로 바꾸기)
	public void logout(String id) {
		if (id.equals(member.getId())) {
			auth = false;
		}
	}


/*
	// 아이디와 비밀번호를 전달받아서 로그인가능 여부를 반환하는 메소드
	public boolean login(String id, String password) {
		boolean result = false;
					
		if (id == member.getId() && password == member.getPassword()) {
			result = true;
		}

		return result;
	}


	// 아이디를 전달받아서 로그아웃기능을 수행하는 메소드
	public boolean logout(String id) {
		boolean result = false;
		
		if (id == member.getId()) {
			result = true;
		}

		return result;
	}
*/


}