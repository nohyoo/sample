import java.util.*;

public class StringTokenizerDemo {
	public static void main(String[] args) {

	/*	
	StringTokenizer
		- 문자열을 구분자를 기준으로 잘라서 토큰으로 만든다.
		- new StringTokenizer(text);	// 구분자를 지정하지 않으면 공백이 default
		- new StringTokenizer(text, 구분자);

		- boolean hasMoreTokens() : 다음번에 꺼낼 토큰이 존재하면 true를 반환
		- String nextToken()      : 토큰(문자열)을 꺼낸다.
	*/
		String text = "The string   tokenizer   class allows  an  application    to break a string into tokens. The tokenization method is much simpler than the one used by the StreamTokenizer class. The StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments.";
	
		StringTokenizer stz = new StringTokenizer(text);
		
		int count1 = stz.countTokens();
		System.out.println("Before while text counts : "+count1);
	/*
		while (stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
		

		int count2 = stz.countTokens();
		System.out.println("After while text counts : "+count2);
	*/

		String[] tokens = text.split(" ");
		System.out.println("text count : " + tokens.length);

	} // end main();
}