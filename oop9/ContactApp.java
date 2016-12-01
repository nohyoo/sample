public class ContactApp {
	public static void main(String[] args) {

	//	주소록정보(이름, 전화번호[], 주소())를 저장하는 객체 생성	
		Contact contact = new Contact();

		String name = "가가";
		contact.setName(name);


	//	전화번호 정보 저장
		Tel[] phones = new Tel[10];

		Tel tel1 = new Tel();
		tel1.setType("스마트폰");
		tel1.setNumber("01011111111");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel2.setType("직장");
		tel2.setNumber("0259595959");
		phones[1] = tel2;
		contact.setTels(phones);


	//	주소 정보 저장
		Address addr = new Address();
		addr.setSido("서울");
		addr.setGugun("종로");
		addr.setDetail("봉익 디아망 4층");
		contact.setAddress(addr);
		

	}	// end main();
}