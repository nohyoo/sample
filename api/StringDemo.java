public class StringDemo {
	public static void main(String[] args) {

		String str6 = "apple";
		String str7 = "Apple";
		boolean equals2 = str7.equalsIgnoreCase(str6);
		System.out.println("대소문자 무시 비교 값 : "+equals2);

		
		String str8 = "자바 프로그래밍 - 자바 기초 및 응용";  // 0 1 2 3 ...
		char ch = str8.charAt(1);
		System.out.println("1번째 문자는 : "+ch);


		int index = str8.indexOf("프");
		System.out.println("문자열에서 [프]이라는 글자가 처음으로 등장하는 위치는 : "+index);

	//	String replace(String, String)	
		String str9 = str8.replace("자바", "파이썬");
		System.out.println("str8 : ["+str8+"]");
		System.out.println("str9 : ["+str9+"]");
		

	//	String substring(begin index) or substring(begin index, end index)
		String str10 = str8.substring(5);
		String str11 = str8.substring(5,10);
		System.out.println("str10 : "+str10);
		System.out.println("str11 : "+str11);

	//	문자열에 문자열이 포함됐는지 확인
		boolean contains = str8.contains("자방");
		System.out.println("contains : "+contains);

	//	문자열을 지정한 구분자를 기준으로 잘라서 배열을 반환하는 메소드 
	//	String[] split(String delim)
		String text = "서울,경기,인천,대전,부산,광주,울산,대구";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);


	//	문자열을 대/소문자로 변환한 새로운 문자열을 반환하는 메소드
	//	String toUpperCase(), String toLowerCae()
		String str12 = "apple";
		String str13 = str12.toUpperCase();
		String str14 = str13.toLowerCase();
		System.out.println("str12 : "+str12);
		System.out.println("str13 : "+str13);
		System.out.println("str14 : "+str14);
		

	//	int, double, boolean .. 기타 여러 종류의 값들을 문자열로 변환해서 반환
	//	String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		String str15 = String.valueOf(number);
		int number2 = Integer.valueOf(str15);
		System.out.println("Last word of str15 is "+str15.substring(str15.length()-1));
		System.out.println(str15 + 100);
		System.out.println(number2 + 100);


	} // end main();
}