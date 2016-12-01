public class Book {
	
	private int bkNo;
	private	String bkTitle;
	private String bkAuthor;
	private String bkPublisher;
	private int bkPrice;
	private String bkDate;

	public Book() {

	}


	public Book(int bkNo, String bkTitle, String bkAuthor, String bkPublisher, int bkPrice, String bkDate) {
		this.bkNo = bkNo;
		this.bkTitle = bkTitle;
		this.bkAuthor = bkAuthor;
		this.bkPublisher = bkPublisher;
		this.bkPrice = bkPrice;
		this.bkDate = bkDate;
	}


	public int getBkNo() {
		return bkNo;
	}
	public void setBkNo(int bkNo) {
		this.bkNo = bkNo;
	}

	public String getBkTitle() {
		return bkTitle;
	}
	public void setBkTitle(String bkTitle) {
		this.bkTitle = bkTitle;
	}

	public String getBkAuthor() {
		return bkAuthor;
	}
	public void setBkAuthor(String bkAuthor) {
		this.bkAuthor = bkAuthor;
	}

	public String getBkPublisher() {
		return bkPublisher;
	}
	public void setBkPublisher(String bkPublisher) {
		this.bkPublisher = bkPublisher;
	}

	public int getBkPrice() {
		return bkPrice;
	}
	public void setBkPrice(int bkPrice) {
		if (bkPrice > 0) {
			this.bkPrice = bkPrice;
		} else {
			this.bkPrice = 0;
		}	
	}

	public String getBkDate() {
		return bkDate;
	}
	public void setBkDate(String bkDate) {
		this.bkDate = bkDate;
	}

}