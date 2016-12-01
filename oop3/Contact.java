/*
	연락처 관리 프로그램	
	
	연락처를 등록할 수 있다.
	등록된 연락처를 조회할 수 있다.

	1. 연락처 정보(번호, 이름, 전화번호, 이메일)를 저장할 수 있는 객체 설계
	2. 구현할 기능 선정하기
		- 등록
			배열에 Contact 객체를 저장
		- 조회
			배열에 저장된 모든 Contact 객체의 정보 표시


	Class
		Contact - 연락처 정보를 표현
		ContactMgr - 연락처 정보 기능(등록, 조회) 구현
		ContactApp - 메인실행

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

