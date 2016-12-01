public class MemberServiceApp {
	public static void main(String[] args) {

	/*
		이    름 : 가가
		아 이 디 : gaga
		비밀번호 : 1234
		나    이 : 9

		정보를 가진 Member객체를 담고 있는 MemberService의 객체 생성하기
	*/

		Member m = new Member();
		m.setName("가가");
		m.setId("gaga");
		m.setPassword("1234");
		m.setAge(9);

		String id = "gaga";
		String password = "1234";

		MemberService ms = new MemberService(m);

		ms.login(id, password);
		System.out.println("인증여부 : " + ms.isAuth());

		ms.logout(id);
		System.out.println("인증여부 : " + ms.isAuth());
		

/*
		// 로그인하기
		
		if (ms.login(id, password)) {
			System.out.println("아이디 " + id + "로 로그인 되었습니다");
		} else {
			System.out.println("일치하는 회원정보가 없습니다.");
		}

		// 로그아웃하기
		if (ms.logout(id)) {
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("로그아웃 실패!");
		}
*/

		

	} // end main();
}