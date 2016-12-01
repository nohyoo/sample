import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {

	// 연락처 정보를 입력받는 화면
		Scanner sc = new Scanner(System.in);

		Contact[] contact = new Contact[100];
		Contact ct = new Contact();
		int currentPosition = 0;

		for ( ;; ) {
			System.out.println("메뉴 번호를 입력해주세요.");
			System.out.println("1.등록   2.조회   3.종료");
			
			int menuCode = sc.nextInt();

			
			
			if (menuCode == 1) {
				// 등록
				// currentPosition이 가르키는 위치에 Contact를 저장하고
				// currentPosition의 값을 1증가
				

			
			} else if (menuCode == 2) {
				// 조회
				// currentPosition이 가르키는 위치 앞까지 반복

			
			} else if (menuCode == 3) {
				// 종료
				break;
			
			} else {
				System.out.println("메뉴 번호를 확인 후 입력해주세요.");
			}
			
		} // end for();
	

	} // end main();
}