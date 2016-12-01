public class Quiz5 {
	public static void main(String[] args) {

		String[] words = {"»õ³¢", "³ð", "³â", "º´½Å"};
		String text = "¹Ú¤¡¤¤ ³ª»Û »õ³¢ »¡¸® ³»·Á¿Í";
		boolean isBad = false;

		for (String a : words) {
			if (text.contains(a)) {
				isBad = true;
			}
		}

		if (isBad) {
			System.out.println("±ÝÁö¾î ¾ÈµË´Ï´Ù.");
		} else {
			System.out.println("good");
		}


	} // end main();
}