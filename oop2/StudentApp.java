public class StudentApp {
	public static void main(String[] args) {

		Student st1 = new Student();

		int total1 = st1.getTotal();
		double avg1 = st1.getAvg();
/*
		System.out.println("====================");
		System.out.println("total1 : "+total1);
		System.out.println("avg1 : "+avg1);
		System.out.println("====================");
*/		st1.getInfo();



		Student st2 = new Student(50, "Nana", 70, 90, 80);

		int total2 = st2.getTotal();
		double avg2 = st2.getAvg();
/*
		System.out.println("====================");
		System.out.println("total2 : "+total2);
		System.out.println("avg2 : "+avg2);
		System.out.println("====================");
*/		st2.getInfo();


	} // end main();
}