public class ProductApp {
	public static void main(String[] args) {

	//	상품을 5개 담는 배열을 정의하기
		Product[] product = new Product[5];


	// 배열에 상품 5개 저장하기
		Product pd1 = new Product(30, "초코파이", "한국회사",20000, 3, false);
		Product pd2 = new Product(45, "마카롱", "대만회사",5000, 3, false);
		Product pd3 = new Product(60, "쿵푸팬더", "중국회사",35000, 3, false);
		Product pd4 = new Product(75, "마요마요", "일본회사",8000, 3, false);
		Product pd5 = new Product(90, "어린이세트", "영국회사",150000, 3, true);

		product[0] = pd1;
		product[1] = pd2;
		product[2] = pd3;
		product[3] = pd4;
		product[4] = pd5;


	// 배열에 저장된 상품중에서 판매중인 상품만 표시하기
		for (Product a : product ) {
			if (!a.isSold) {
				a.getAllInfo();
			}
		}
		System.out.println();

	// 배열에 저장된 상품중에서 가격이 10,000원 이상인 상품만 표시하기
		for (Product a : product ) {
			if (a.pdPrice >= 10000) {
				a.getAllInfo();
			}
		}
		System.out.println();


	// 배열에 저장된 상품의 전체 가격을 표시하기
		for (Product a : product ) {
			System.out.println("상품가격 : "+a.pdPrice);
		}


	} // end main();
}