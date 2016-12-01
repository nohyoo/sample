public class Demo2 {
	public static void main(String[] args) {

	//
	int a = 4;
	int b = 6;
	int c = -4;
	int result = 0;

	result = a & b;
	System.out.println(result);
	result = a | b;
	System.out.println(result);
	result = a ^ b;
	System.out.println(result);	
	result = ~a;
	System.out.println(result);

	result = c >> 2;
	System.out.println(result);
	result = c << 2;
	System.out.println(result);
	result = c >>> 2;
	System.out.println(result);

	}
}