public class Product {
		
	// ��ǰ��ȣ, ��ǰ��, ������, ����, ������(double), �Ǹſ���
	int pdNo;
	String pdName;
	String pdMaker;
	int pdPrice;
	double pdDiscount;
	boolean isSold;

	public int getPdNo() {
		return pdNo;
	}
	public void setPdNo(int pdNo) {
		this.pdNo = pdNo;
	}

	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public String getPdMaker() {
		return pdMaker;
	}
	public void setPdMaker(String pdMaker) {
		this.pdMaker = pdMaker;
	}

	public int getPdPrice() {
		return pdPrice;
	}
	public void setPdPrice(int pdPrice) {
		this.pdPrice = pdPrice;
	}

	public int getPdDiscount() {
		return (int)(pdPrice * (1 - pdDiscount));
	}
	public void setPdDiscount(double pdDiscount) {
		this.pdDiscount = pdDiscount;
	}

	public boolean isSold() {
		return isSold;
	}
	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	// �⺻ ������
	public Product() {
		pdNo = 123;
		pdName = "Gaga";
		pdMaker = "KOREA";
		pdPrice = 50000;
		pdDiscount = 5;
		isSold = false;
	}


	// �Ű����� ������
	public Product(int pdNo, String pdName, String pdMaker, int pdPrice, double pdDiscount, boolean isSold) {
		this.pdNo = pdNo;
		this.pdName = pdName;
		this.pdMaker = pdMaker;
		this.pdPrice = pdPrice;
		this.pdDiscount = pdDiscount;
		this.isSold = isSold;
	}

	
	// ���ε� ������ ��ȯ�ϴ� �޼ҵ�
	public double getDiscountPrice() {
		double result = pdPrice - (pdPrice*(pdDiscount/100));
		
		return result;
	}


	// ��ǰ������ ��� ����ϴ� �޼ҵ�
	public void getAllInfo() {
		System.out.println("========== ��ǰ���� ==========");
		System.out.println("��ǰ��ȣ : "+pdNo);
		System.out.println("��ǰ�̸� : "+pdName);
		System.out.println("�� �� �� : "+pdMaker);
		System.out.println("��    �� : "+pdPrice);
		System.out.println("�� �� �� : "+pdDiscount+"(%)");
		System.out.println("�Ǹſ��� : "+isSold);
		System.out.println("==============================");

	}

}