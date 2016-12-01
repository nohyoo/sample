public class FileUploadApp {
	public static void main(String[] args) {

		FileUpload f1 = new FileUpload();
		FileUpload f2 = new FileUpload(100);
		FileUpload f3 = new FileUpload(1024 * 1024 * 300, 200);

		f1.upload();
		f2.upload();
		f3.upload();

	

	} // end main();
}