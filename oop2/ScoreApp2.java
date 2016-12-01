public class ScoreApp2 {
	public static void main(String[] args) {
		
		Score s = new Score("´Ù´Ù", 100, 90, 80);
		
		int total = s.total();
		double avg = s.average();

		System.out.println(total);
		System.out.println(avg);
		System.out.println(s.name);



	} // end main();
}