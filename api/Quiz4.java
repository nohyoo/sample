import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz4 {
	public static void main(String[] args) {

	//	아이디를 입력받아서 올바른 아이디인지 검사하기
	//	아이디 작성 규칙(길이가 6글자 이상, 영어소문자  97~122 lower

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID를 입력해주세요 : ");
		String inputData = sc.next();
		boolean isLower = false;

		

		// 아이디가 6글자 이상인지 체크
		if (inputData.length() < 6) {
			System.out.println("문자 길이가 짧습니다.");
		
		// 아이디가 영어 소문자로 구성되었는지 체크
		}
		
		for (int i=0; i<inputData.length(); i++) {
			int ch = inputData.charAt(i);
			if (ch < 97 || ch > 122) {
				isLower = true;
				break;
			}
		}
			
		if (isLower) {
			System.out.println("소문자만 입력해주세요.");
		}

		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, inputData);

		if (!valid) {
			System.out.println("유효하지 않음");
		}
	
		


	}	// end main();  
}