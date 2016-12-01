import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

	//	이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기
	//	ex) asdf@gmail.com   -> asdf

		Scanner sc = new Scanner(System.in);

		System.out.print("Email을 입력해주세요 : ");
		String inputData = sc.next();

		int position = inputData.indexOf("@");
		String result = inputData.substring(0,position);
		System.out.println("substring type :"+result);

		String[] arr = inputData.split("@");
		System.out.println("split type : "+arr[0]);


	}	// end main();
}