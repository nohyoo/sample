public class Quiz2 {
	public static void main(String[] args) {

		String text = "<aaaaaaa@gmail.com>,<bbbbbb@gmail.com>,<ccccc@gmail.com>";
		String[] data = text.split(",");
		
		for(String x : data) {
			x = x.replace("<","").replace(">","");
			System.out.println(x);
		}

	}	// end main();
}