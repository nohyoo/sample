public class Product {
		
	// 상품번호, 상품명, 제조사, 가격, 할인율(double), 판매여부
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

	// 기본 생성자
	public Product() {
		pdNo = 123;
		pdName = "Gaga";
		pdMaker = "KOREA";
		pdPrice = 50000;
		pdDiscount = 5;
		isSold = false;
	}


	// 매개변수 생성자
	public Product(int pdNo, String pdName, String pdMaker, int pdPrice, double pdDiscount, boolean isSold) {
		this.pdNo = pdNo;
		this.pdName = pdName;
		this.pdMaker = pdMaker;
		this.pdPrice = pdPrice;
		this.pdDiscount = pdDiscount;
		this.isSold = isSold;
	}

	
	// 할인된 가격을 반환하는 메소드
	public double getDiscountPrice() {
		double result = pdPrice - (pdPrice*(pdDiscount/100));
		
		return result;
	}


	// 상품정보를 모두 출력하는 메소드
	public void getAllInfo() {
		System.out.println("========== 상품정보 ==========");
		System.out.println("상품번호 : "+pdNo);
		System.out.println("상품이름 : "+pdName);
		System.out.println("제 조 사 : "+pdMaker);
		System.out.println("가    격 : "+pdPrice);
		System.out.println("할 인 율 : "+pdDiscount+"(%)");
		System.out.println("판매여부 : "+isSold);
		System.out.println("==============================");

	}

}