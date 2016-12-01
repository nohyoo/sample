public class Phone {

	private String tel;
	private String com;

	public Phone() {}

	public Phone(String tel, String com) {
		System.out.println("Phone(String, String) is running");
		this.tel = tel;
		this.com = com;
	}



	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}




}