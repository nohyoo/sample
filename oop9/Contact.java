public class Contact {

	private String name;
	private Tel[] tels = new Tel[100];
	private Address address;

	
	public Contact() {}

	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	
	public void addTel(Tel tel) {
		//	tels배열의 적절한 위치에 담기
		int check = 0;
		
		for (int i=0; i<tels.length; i++) {
			if(tels[i] == null) {
				check = i;
				break;
			}
		} 
		tels[check] = tel;
						
	}
	

	public int getTelsLength() {
		int check = 0;
		
		for (int i=0; i<tels.length; i++) {
			if(tels[i] == null) {
				check = i;
				break;
			}
		} 
		
		return check;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tel[] getTels() {
		return tels;
	}
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	


}