/*
	����ó ���� ���α׷�	
	
	����ó�� ����� �� �ִ�.
	��ϵ� ����ó�� ��ȸ�� �� �ִ�.

	1. ����ó ����(��ȣ, �̸�, ��ȭ��ȣ, �̸���)�� ������ �� �ִ� ��ü ����
	2. ������ ��� �����ϱ�
		- ���
			�迭�� Contact ��ü�� ����
		- ��ȸ
			�迭�� ����� ��� Contact ��ü�� ���� ǥ��


	Class
		Contact - ����ó ������ ǥ��
		ContactMgr - ����ó ���� ���(���, ��ȸ) ����
		ContactApp - ���ν���

*/

public class Contact {
	
	private	int seq;
	private String name;
	private String phone;
	private String email;

	public Contact() { }

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}

