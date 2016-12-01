import java.util.*;
public class Demo7 {
	public static void main(String[] args) throws Exception {

		// 임의의 숫자를 입력받아서 그 수가 짝수인지 홀수인지
		// 삼항연사자를 이용해서 결과를 표시하기

		Scanner sc = new Scanner(System.in);
		
		int inputData = 0;
		int code = 0;

		System.out.println("임의의 숫자를 입력해 주세요.");
		inputData = sc.nextInt();

		code = (inputData%2 == 0) ? 0 : 1;


		if ( code == 0 ) {
			System.out.println("입력하신 숫자 "+inputData+"는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자 "+inputData+"는 홀수입니다.");
		}
		
	}
}