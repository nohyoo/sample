import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {

	// 국어, 영어, 수학점수를 입력받아서 
	// 총합과 평균 계산
	// 실행은 4번째 Java Excute 2로 실행하세요.

	Scanner sn = new Scanner(System.in);

	int kor = 0;
	int eng = 0;
	int math = 0;
	int total = 0;
	double avg = 0;

	System.out.println("국어 점수를 입력해주세요.");
	kor = sn.nextInt();

	System.out.println("영어 점수를 입력해주세요.");
	eng = sn.nextInt();

	System.out.println("수학 점수를 입력해주세요.");
	math = sn.nextInt();
 
	total = kor + eng + math;
	avg = total/3;

	System.out.println("입력하신 국어점수 "+ kor + "점, 영어점수 "+ eng +"점, 수학점수 "+ math +"점입니다.");
	System.out.println("총점은 " + total +"점 입니다.");
	System.out.println("평균은 " + avg +"점 입니다.");

	}
}