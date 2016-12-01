import java.util.Scanner;

public class ForDemo6 {
	public static void main(String[] args) {

	// 

	Scanner sc = new Scanner(System.in);
	int menuNo = 0;

	for (; ;) {
		System.out.println("[1]조회   [2]등록   [3]삭제   [0]종료");
		System.out.println("메뉴를 선택하세요");

		menuNo= sc.nextInt();


		if (menuNo == 1) {
			System.out.println("정보를 조회합니다...");
		} else if (menuNo == 2) {
			System.out.println("정보를 등록합니다...");
		} else if (menuNo == 3) {
			System.out.println("정보를 삭제합니다...");
		} else if (menuNo == 0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else {
			System.out.println("메뉴를 다시 선택해주세요.");
		}
	}

	} // end main()
}