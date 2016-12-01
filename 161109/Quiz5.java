import java.util.*;
public class Quiz5 {
	public static void main(String[] args) throws Exception {

		// 국어, 영어, 수학점수를 입력받아서
		// 총점, 평균, 학점을 출력하기
		// 학점은 90이상 A, 80이상 B, 70이상 C, 60이상 D, 그외는 F

		Scanner sc = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;

		System.out.println("국어 점수를 입력해주세요.");
		kor = sc.nextInt();

		System.out.println("영어 점수를 입력해주세요.");
		eng = sc.nextInt();

		System.out.println("수학 점수를 입력해주세요.");
		math = sc.nextInt();
	 
		total = kor + eng + math;
		avg = total/3;

		System.out.println("입력하신 국어점수 "+ kor + "점, 영어점수 "+ eng +"점, 수학점수 "+ math +"점입니다.");
		System.out.println("총점은 " + total +"점 입니다.");
		System.out.println("평균은 " + avg +"점 입니다.");

		if (avg >= 90) {
			System.out.println("학점은 A 입니다");
		} else if (avg >= 80) {
			System.out.println("학점은 B 입니다");
		} else if (avg >= 70) {
			System.out.println("학점은 C 입니다");
		} else if (avg >= 60) {
			System.out.println("학점은 D입니다.");
		} else {
			System.out.println("학점은 F입니다.");
		}
	
		
	}
}