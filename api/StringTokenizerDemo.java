import java.util.*;

public class StringTokenizerDemo {
	public static void main(String[] args) {

	/*	
	StringTokenizer
		- ���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
		- new StringTokenizer(text);	// �����ڸ� �������� ������ ������ default
		- new StringTokenizer(text, ������);

		- boolean hasMoreTokens() : �������� ���� ��ū�� �����ϸ� true�� ��ȯ
		- String nextToken()      : ��ū(���ڿ�)�� ������.
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