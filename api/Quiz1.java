import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

	//	�̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
	//	ex) asdf@gmail.com   -> asdf

		Scanner sc = new Scanner(System.in);

		System.out.print("Email�� �Է����ּ��� : ");
		String inputData = sc.next();

		int position = inputData.indexOf("@");
		String result = inputData.substring(0,position);
		System.out.println("substring type :"+result);

		String[] arr = inputData.split("@");
		System.out.println("split type : "+arr[0]);


	}	// end main();
}