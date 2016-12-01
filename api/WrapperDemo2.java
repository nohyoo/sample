public class WrapperDemo2 {
	public static void main(String[] args) {

		int num1 = Integer.parseInt("123");
		int num2 = Integer.parseInt("11", 2);
		System.out.println("binary 2 : "+num2);

		int num3 = Integer.parseInt("a", 16);
		System.out.println("binary 16 : "+num3);

		String str1 = Integer.toBinaryString(12);
		System.out.println("str1 : "+str1);

		String str2 = Integer.toHexString(15345);
		System.out.println("str2 : "+str2);



	} // end main();
}