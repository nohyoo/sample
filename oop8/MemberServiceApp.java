public class MemberServiceApp {
	public static void main(String[] args) {

	/*
		��    �� : ����
		�� �� �� : gaga
		��й�ȣ : 1234
		��    �� : 9

		������ ���� Member��ü�� ��� �ִ� MemberService�� ��ü �����ϱ�
	*/

		Member m = new Member();
		m.setName("����");
		m.setId("gaga");
		m.setPassword("1234");
		m.setAge(9);

		String id = "gaga";
		String password = "1234";

		MemberService ms = new MemberService(m);

		ms.login(id, password);
		System.out.println("�������� : " + ms.isAuth());

		ms.logout(id);
		System.out.println("�������� : " + ms.isAuth());
		

/*
		// �α����ϱ�
		
		if (ms.login(id, password)) {
			System.out.println("���̵� " + id + "�� �α��� �Ǿ����ϴ�");
		} else {
			System.out.println("��ġ�ϴ� ȸ�������� �����ϴ�.");
		}

		// �α׾ƿ��ϱ�
		if (ms.logout(id)) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		} else {
			System.out.println("�α׾ƿ� ����!");
		}
*/

		

	} // end main();
}