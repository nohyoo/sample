public class Demo6 {
	public static void main(String[] args)  {
	
	// 타입변환

	int a = 4;
	float b = 5.0f;
	double c;

	c = a+b;

	System.out.println(c);


	int d = (int)4.0;
	Integer e = d;
	System.out.println("d : "+d);
	System.out.println("e : "+e.toString());


	int intValue = 'N';
	char charValue = (char)intValue;
	System.out.println(intValue);
	System.out.println(charValue);
	
	
	}
}
