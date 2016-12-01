public class Demo1 {
	public static void main(String[] args) {

	// 정수타입
	byte b1 = 23;
	byte b2 = -126;
//	byte b3 = 128;

	long c2 = 1000000000000L;

	int m1 = 10;
	int m2 = 012;
	int m3 = 0xA;

	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);


	// java 7부터 숫자 사용 시 _사용 가능
	int m4 = 100_000_000;
	int m5 = 5;

	System.out.println(m4 * m5);
	}
}