 public class MethodDemo2 {

	public void displayGugudan(int x) {
		
		for (int j=1; j<10 ; j++) {
			System.out.println(x+" * "+j+" = "+x*j);
		}
		
	} // end displayGugudan(int);
	

	public static void main(String[] args) {
		MethodDemo2 md = new MethodDemo2();

		int a = 5;
		md.displayGugudan(a);
		md.displayGugudan(10);

		


	} // end main();
 }