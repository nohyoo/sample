public class ForDemo5 {
	public static void main(String[] args) {

	// 1~100까지의 합을 계산하기
	// 단, 합계가 3000을 넘어간 순간의 숫자를 알아내기

	int i = 0;
	int result = 0;

	for (i=1; i<=100 ; i++) {
		result += i;

		if (result >= 3000) {
			break;
		}
//		System.out.println(result+ " "+i);
	}
	System.out.println("3000을 넘어간 순간의 수 : "+result);
	System.out.println("3000을 넘어간 순간 더한 수 : "+i);

	} // end main()
}