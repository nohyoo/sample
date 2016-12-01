import java.util.Random;

public class MethodDemo3 {

	// 난수(1~9)를 발생시키는 메소드 만들기
	public int random() {
		Random rd = new Random();
		return rd.nextInt(9)+1;
		
		
	} // end random();
	

	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		
		double number = md.random(); // int -> double(auto)
		System.out.println("생성된 난수 : "+number);
		


	} // end main();
 }