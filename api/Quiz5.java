public class Quiz5 {
	public static void main(String[] args) {

		String[] words = {"����", "��", "��", "����"};
		String text = "�ڤ��� ���� ���� ���� ������";
		boolean isBad = false;

		for (String a : words) {
			if (text.contains(a)) {
				isBad = true;
			}
		}

		if (isBad) {
			System.out.println("������ �ȵ˴ϴ�.");
		} else {
			System.out.println("good");
		}


	} // end main();
}