public class ProductApp {
	public static void main(String[] args) {

	//	��ǰ�� 5�� ��� �迭�� �����ϱ�
		Product[] product = new Product[5];


	// �迭�� ��ǰ 5�� �����ϱ�
		Product pd1 = new Product(30, "��������", "�ѱ�ȸ��",20000, 3, false);
		Product pd2 = new Product(45, "��ī��", "�븸ȸ��",5000, 3, false);
		Product pd3 = new Product(60, "��Ǫ�Ҵ�", "�߱�ȸ��",35000, 3, false);
		Product pd4 = new Product(75, "���丶��", "�Ϻ�ȸ��",8000, 3, false);
		Product pd5 = new Product(90, "��̼�Ʈ", "����ȸ��",150000, 3, true);

		product[0] = pd1;
		product[1] = pd2;
		product[2] = pd3;
		product[3] = pd4;
		product[4] = pd5;


	// �迭�� ����� ��ǰ�߿��� �Ǹ����� ��ǰ�� ǥ���ϱ�
		for (Product a : product ) {
			if (!a.isSold) {
				a.getAllInfo();
			}
		}
		System.out.println();

	// �迭�� ����� ��ǰ�߿��� ������ 10,000�� �̻��� ��ǰ�� ǥ���ϱ�
		for (Product a : product ) {
			if (a.pdPrice >= 10000) {
				a.getAllInfo();
			}
		}
		System.out.println();


	// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�
		for (Product a : product ) {
			System.out.println("��ǰ���� : "+a.pdPrice);
		}


	} // end main();
}