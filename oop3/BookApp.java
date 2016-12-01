public class BookApp {
	public static void main(String[] args) {

		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "이것이 자바다", "가가", "한빛미디어", 35000, "2015-10-10");
		bookCart[1] = new Book(4, "스프링 프레임워크", "나나", "구글미디어", 28000, "2016-11-09");
		bookCart[2] = new Book(9, "그것이 알고싶다", "다다", "네이버미디어", 50000, "2010-05-20");
		bookCart[3] = new Book(15, "무한도전", "라라", "다음미디어", 15000, "2011-03-07");
		bookCart[4] = new Book(22, "스티브잡스", "마마", "애플미디어", 28000, "2016-08-22");
/*
		// 모든 도서 정보 조회
		System.out.println("========== 도서 정보 ==========");
		for (Book a : bookCart) {		
			System.out.println("번    호 : "+a.getBkNo());
			System.out.println("제    목 : "+a.getBkTitle());
			System.out.println("저    자 : "+a.getBkAuthor());
			System.out.println("출 판 사 : "+a.getBkPublisher());
			System.out.println("가    격 : "+a.getBkPrice());
			System.out.println("출 판 일 : "+a.getBkDate());
		}
		System.out.println();
*/	
		// 도서 제목들만 조회
		System.out.println("========== 도서 제목 ==========");
		for (Book a : bookCart) {		
			System.out.println("제    목 : "+a.getBkTitle());
			
		}
		System.out.println();

		
		// 모든 도서 가격의 합
		int priceTotal = 0; 
		for (Book a : bookCart) {
			priceTotal += a.getBkPrice();
		
		}
		System.out.println("========== 도서 가격 총합  ==========");
		System.out.println("가격총합 : "+priceTotal);
		System.out.println();


		// 카트에 담긴 도서 중 가장 비싼 가격의 책 제목과 가격 조회
		int maxStat = 0;
		int checkPrice = 0;
		for (int i=0; i<bookCart.length; i++) {
			if (checkPrice < bookCart[i].getBkPrice()) {
				checkPrice = bookCart[i].getBkPrice();
				maxStat = i;	
			}
		
		}

		System.out.println("========== 가장 비싼 도서 정보 ==========");
		System.out.println("제    목 : "+bookCart[maxStat].getBkTitle());
		System.out.println("가    격 : "+bookCart[maxStat].getBkPrice());
		System.out.println();
	
		bookCart[0].setBkPrice(5000);
		int x = bookCart[0].getBkPrice();
		System.out.println("x : "+x);

	} // end main();
}