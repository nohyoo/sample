import java.util.Scanner;
public class Quiz2 {
	public static void main(String[] args) {

	// 3자리 정수받아 100, 10, 1자리숫자별 출력하세요.
	// 실행은 4번째 Java Excute 2로 실행하세요.

	Scanner sn = new Scanner(System.in);

	int inputData = 0;
	int dv1 = 0;
	int dv2 = 0;
	int dv3 = 0;

	System.out.println("세자리를 정수를 입력해주세요.");
	inputData = sn.nextInt();
 
	dv1 = inputData/100;
	dv2 = (inputData - (dv1*100))/10;
	dv3 = (inputData - ((dv1*100) + (dv2*10)));

	System.out.println("100의 자리수는 " + dv1 +"입니다.");
	System.out.println("10의 자리수는 " + dv2 +"입니다.");
	System.out.println("1의 자리수는 " + dv3 +"입니다.");

	}
}