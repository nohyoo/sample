public class StringDemo {
	public static void main(String[] args) {

		String str6 = "apple";
		String str7 = "Apple";
		boolean equals2 = str7.equalsIgnoreCase(str6);
		System.out.println("��ҹ��� ���� �� �� : "+equals2);

		
		String str8 = "�ڹ� ���α׷��� - �ڹ� ���� �� ����";  // 0 1 2 3 ...
		char ch = str8.charAt(1);
		System.out.println("1��° ���ڴ� : "+ch);


		int index = str8.indexOf("��");
		System.out.println("���ڿ����� [��]�̶�� ���ڰ� ó������ �����ϴ� ��ġ�� : "+index);

	//	String replace(String, String)	
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println("str8 : ["+str8+"]");
		System.out.println("str9 : ["+str9+"]");
		

	//	String substring(begin index) or substring(begin index, end index)
		String str10 = str8.substring(5);
		String str11 = str8.substring(5,10);
		System.out.println("str10 : "+str10);
		System.out.println("str11 : "+str11);

	//	���ڿ��� ���ڿ��� ���Եƴ��� Ȯ��
		boolean contains = str8.contains("�ڹ�");
		System.out.println("contains : "+contains);

	//	���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ� 
	//	String[] split(String delim)
		String text = "����,���,��õ,����,�λ�,����,���,�뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);


	//	���ڿ��� ��/�ҹ��ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	//	String toUpperCase(), String toLowerCae()
		String str12 = "apple";
		String str13 = str12.toUpperCase();
		String str14 = str13.toLowerCase();
		System.out.println("str12 : "+str12);
		System.out.println("str13 : "+str13);
		System.out.println("str14 : "+str14);
		

	//	int, double, boolean .. ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ
	//	String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		String str15 = String.valueOf(number);
		int number2 = Integer.valueOf(str15);
		System.out.println("Last word of str15 is "+str15.substring(str15.length()-1));
		System.out.println(str15 + 100);
		System.out.println(number2 + 100);


	} // end main();
}