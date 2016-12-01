public class C {
	
	int x;
	static int y;

	// 정적 초기화 블록
	// 정적 변수의 초기화 작업에 필요한 수행문 구현
	// 주로 프로그램 실행에 사용되는 외부 리소스 연결작업을 구현
	static {
		System.out.println("초기화 블록 실행");
		// 정적변수, 정적 메소드를 사용할 수 있음
		
	}


	public C() {
		System.out.println("생성자 실행");
	}

	public void test() {
			x = 6;
			y = 5;
			System.out.println("x : "+x);
			System.out.println("y : "+y);
		}

}