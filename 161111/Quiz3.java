import java.util.*;

public class Quiz3 {
	public static void main(String[] args) {

	//	야구게임

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int[] ranNum = new int[3];
		int[] inputNum = new int[3];
		int strike = 0;
		int ball = 0;
		int check = 0;
		int position = 0;
		boolean isInput = false;

		//	ranNum 랜덤넘버 3개 생성
		for ( ; ; ) {
			check = rd.nextInt(9)+1;
			
			for (int i=0; i<position; i++) {
				if (check == ranNum[position]) {
					isInput = true;
				}
			}
			
			if (!isInput) {
				ranNum[position] = check;
				position++;
			}

			if (position == 3) {
				break;
			}
					
		}

		System.out.println(Arrays.toString(ranNum));


	} // end main();
}