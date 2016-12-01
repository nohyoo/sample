public class MemberApp {
	public static void main(String[] args) {

	//	회원정보를 담기위한 Member 객체를 생서하고
	//	setter를 사용해서 이름, 아이디, 비번, 나이등의 데이터를 객체에 저장하기

		Member m = new Member();
		m.setName("가가");
		m.setId("gaga");
		m.setPassword("1234");
		m.setAge(9);


		System.out.println(m.getName());
		System.out.println(m.getId());
		System.out.println(m.getPassword());
		System.out.println(m.getAge());

	} // end main();
}