public class ArrayApp {
	public static void main(String[] args) {
	
		ArrayService as = new ArrayService();

		int[] move = as.move(3);
		
		for (int i=0; i<move.length; i++) {
			System.out.println(move[i]);
			
		}
		System.out.println("===== �̵� ���� =====");


		int[] copy = as.copy(9);
		for (int i=0; i<copy.length; i++) {
			System.out.println(copy[i]);
			
		}
		System.out.println("===== ���� ���� =====");



		int[] copy2 = as.copy(4,9);
		for (int i=0; i<copy2.length; i++) {
			System.out.println(copy2[i]);
			
		}
		System.out.println("===== ���� ���� ���� =====");



		int[] shift = as.shift(5,7);
		for (int i=0; i<shift.length; i++) {
			System.out.println(shift[i]);
			
		}
		System.out.println("===== Shift �̵� ���� =====");





	} // end main();
}