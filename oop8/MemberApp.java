public class MemberApp {
	public static void main(String[] args) {

	//	ȸ�������� ������� Member ��ü�� �����ϰ�
	//	setter�� ����ؼ� �̸�, ���̵�, ���, ���̵��� �����͸� ��ü�� �����ϱ�

		Member m = new Member();
		m.setName("����");
		m.setId("gaga");
		m.setPassword("1234");
		m.setAge(9);


		System.out.println(m.getName());
		System.out.println(m.getId());
		System.out.println(m.getPassword());
		System.out.println(m.getAge());

	} // end main();
}