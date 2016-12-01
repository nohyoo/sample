import java.util.*;
public class Quiz4 {
	public static void main(String[] args) throws Exception {

		// 임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼

		Scanner sc = new Scanner(System.in);
		
		int inputData = 0;
		int dv1 = 0;
		int dv2 = 0;
		String result1 = "";
		String result2 = "";
		String output = "일이삼";

		System.out.println("두자리 수의 정수를 입력해주세요.");
		inputData = sc.nextInt();
	 
		dv1 = (inputData/10);
		dv2 = (inputData - (dv1*10));

		// 십의 자리 설정
		if (dv1 == 0) {
			result1 = "";
		} else if (dv1 == 1) {
			result1 = "십";
		} else if (dv1 == 2) {
			result1 = "이십";
		} else if (dv1 == 3) {
			result1 = "삼십";
		} else if (dv1 == 4) {
			result1 = "사십";
		} else if (dv1 == 5) {
			result1 = "오십";
		} else if (dv1 == 6) {
			result1 = "육십";
		} else if (dv1 == 7) {
			result1 = "칠십";
		} else if (dv1 == 8) {
			result1 = "팔십";
		} else if (dv1 == 9) {
			result1 = "구십";
		}
		
		// 일의 자리 설정
		if (dv2 == 0) {
			result2 = "";
			if (dv1 == 0) {
				result2 = "영";
			}
		} else if (dv2 == 1) {
			result2 = "일";
		} else if (dv2 == 2) {
			result2 = "이";
		} else if (dv2 == 3) {
			result2 = "삼";
		} else if (dv2 == 4) {
			result2 = "사";
		} else if (dv2 == 5) {
			result2 = "오";
		} else if (dv2 == 6) {
			result2 = "육";
		} else if (dv2 == 7) {
			result2 = "칠";
		} else if (dv2 == 8) {
			result2 = "팔";
		} else if (dv2 == 9) {
			result2 = "구";
		}
	
	
		output = result1 + result2;
		System.out.println("입력하신 숫자 "+inputData+"의 한글변환 값은 "+output+"입니다.");

		
	}
}