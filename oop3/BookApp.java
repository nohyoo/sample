public class BookApp {
	public static void main(String[] args) {

		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "�̰��� �ڹٴ�", "����", "�Ѻ��̵��", 35000, "2015-10-10");
		bookCart[1] = new Book(4, "������ �����ӿ�ũ", "����", "���۹̵��", 28000, "2016-11-09");
		bookCart[2] = new Book(9, "�װ��� �˰�ʹ�", "�ٴ�", "���̹��̵��", 50000, "2010-05-20");
		bookCart[3] = new Book(15, "���ѵ���", "���", "�����̵��", 15000, "2011-03-07");
		bookCart[4] = new Book(22, "��Ƽ���⽺", "����", "���ù̵��", 28000, "2016-08-22");
/*
		// ��� ���� ���� ��ȸ
		System.out.println("========== ���� ���� ==========");
		for (Book a : bookCart) {		
			System.out.println("��    ȣ : "+a.getBkNo());
			System.out.println("��    �� : "+a.getBkTitle());
			System.out.println("��    �� : "+a.getBkAuthor());
			System.out.println("�� �� �� : "+a.getBkPublisher());
			System.out.println("��    �� : "+a.getBkPrice());
			System.out.println("�� �� �� : "+a.getBkDate());
		}
		System.out.println();
*/	
		// ���� ����鸸 ��ȸ
		System.out.println("========== ���� ���� ==========");
		for (Book a : bookCart) {		
			System.out.println("��    �� : "+a.getBkTitle());
			
		}
		System.out.println();

		
		// ��� ���� ������ ��
		int priceTotal = 0; 
		for (Book a : bookCart) {
			priceTotal += a.getBkPrice();
		
		}
		System.out.println("========== ���� ���� ����  ==========");
		System.out.println("�������� : "+priceTotal);
		System.out.println();


		// īƮ�� ��� ���� �� ���� ��� ������ å ����� ���� ��ȸ
		int maxStat = 0;
		int checkPrice = 0;
		for (int i=0; i<bookCart.length; i++) {
			if (checkPrice < bookCart[i].getBkPrice()) {
				checkPrice = bookCart[i].getBkPrice();
				maxStat = i;	
			}
		
		}

		System.out.println("========== ���� ��� ���� ���� ==========");
		System.out.println("��    �� : "+bookCart[maxStat].getBkTitle());
		System.out.println("��    �� : "+bookCart[maxStat].getBkPrice());
		System.out.println();
	
		bookCart[0].setBkPrice(5000);
		int x = bookCart[0].getBkPrice();
		System.out.println("x : "+x);

	} // end main();
}