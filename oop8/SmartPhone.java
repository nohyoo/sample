public class SmartPhone extends Phone {
	
	private String ip;

	public SmartPhone() {}

	public SmartPhone(String telNumber, String company, String ip) {
		super(telNumber, company);	// �θ��� ������ ȣ���ϱ� - Phone(String, String) ������
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}


	public void displayInfo() {
		super.displayInfo();
	//	System.out.println("��ȭ��ȣ : " + super.getTelNumber());
	//	System.out.println("�� �� �� : " + super.getCompany());
		System.out.println("�� �� �� : " + ip);
		
					
	}

	



}