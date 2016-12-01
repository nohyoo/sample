import java.util.*;

public class ForDemo11 {
	public static void main(String[] args) {

	// 무인도 탈출 
	// 합계가 7인 경우 무인도행
	// 더블인 경우만 무인도 탈출

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	for (; ; ) {

		int firstDice = 0;  // 첫번째 주사위 값
		int secondDice = 0; // 두번째 주사위 값
		int sumDice = 0;    // 두 주사위 합
		int locked = 0;     // 무인도행 여부 0:정상 1~3:무인도
		int locate = 0;     // 현재 이동 값
		int inputCode = 0;  // 사용자 메뉴 선택 값

		System.out.println("=============================");
		System.out.println("[1]주사위 굴리기     [0] 종료");
		System.out.println("=============================");

		inputCode = sc.nextInt();

		if (inputCode == 1) {
			for (int i=1; i<=10 ; i++) {
				System.out.println("===== 주사위를 던집니다! =====");
				firstDice = rd.nextInt(6) + 1;
				secondDice = rd.nextInt(6) + 1;
				sumDice = firstDice + secondDice;

				if (locked != 0) {
					if (firstDice == secondDice) {
						locked = 0;
						locate += sumDice;
						System.out.println("무인도 탈출에 성공!");
						System.out.println(sumDice+"칸 이동!");
					} else {
						locked -= 1;
						System.out.println("무인도 탈출 실패!");
					}
				} else {
					if (sumDice == 7) {
						locked = 3;
						System.out.println("무인도행!");
					} else {
						locate += sumDice;
						System.out.println(sumDice+"칸 이동!");
					}
				}
				
				
				System.out.println("첫번째 주사위 : "+firstDice);
				System.out.println("두번째 주사위 : "+secondDice);
				System.out.println("현재 이동한 위치 : "+locate);
			}
		
		} else if (inputCode == 0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else {
			System.out.println("메뉴를 다시 선택해주세요.");
		}
	}


	} // end main()
}