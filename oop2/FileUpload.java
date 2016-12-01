public class FileUpload {
	
	long maxFSize;
	int maxFCnt;

	public FileUpload() {
		maxFSize = 1024 * 1024 * 10;  // 10MByte
		maxFCnt = 10;
	}


	public FileUpload(long size) {
		maxFSize = size;
		maxFCnt = 10;
	}


	public FileUpload(int cnt) {
		maxFSize = 1024 * 1024 * 10;
		maxFCnt = cnt;
	}


	public FileUpload(long size, int cnt) {
		maxFSize = size;
		maxFCnt = cnt;
	}


	public void upload() {
		System.out.println("file max size -> "+maxFSize);
		System.out.println("file max count -> "+maxFCnt);
	}

}