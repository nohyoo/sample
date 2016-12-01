import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

	//	숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
	//	1. 학생 수를 입력받기
	//	2. 학생 수 만큼의 크기를 가진 배열을 만들기
	//  3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
	//	4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		Scanner sc = new Scanner(System.in);
		int stuCnt = 0;
		int score = 0;
		int total = 0;
		double avg = 0;


		System.out.print("국어 시험을 본 학생들의 수를 입력하세요 :");
		stuCnt = sc.nextInt();

		int[] scores = new int[stuCnt];
		
		
		for (int i=0; i<stuCnt ; i++) {
			System.out.print("학생들의 점수를 입력해주세요 :");
			score = sc.nextInt();
			scores[i] = score;
		}

		
		for (int a : scores) {
			total += a;
		}		
		avg = total/stuCnt;

	
		System.out.println("학생 수 : "+stuCnt);
		System.out.println("총합 : "+total);
		System.out.println("평균 : "+avg);


	} // end main();
}