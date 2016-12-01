import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address addr = new Address();
	

		for ( ;; ) {
			System.out.println("=============================");
			System.out.println("이용하실 메뉴를 선택해주세요.");
			System.out.println("1.이름등록     2.전화번호등록");
			System.out.println("3.주소등록     4.주소록  조회");
			System.out.println("5.종    료                   ");
			System.out.println("=============================");
	
			int selected = sc.nextInt();
			
			if (selected == 1) {
			//	이름을 입력받아서 Contact에 저장
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				contact.setName(name);
				System.out.println(name+"이 등록되었습니다.");

			
			} else if (selected == 2) {
			//	전화번호 정보 입력받아서 Contact에 저장
			//	Tel객체 생성 -> 값 입력받아서 채우고 
			//	->  Contact의 addTel(Tel tel)에게 Tel 객체 전달해서 배열에 담기
				Tel tel = new Tel();
				
				System.out.print("연락처 종류를 입력하세요 : ");
				String type = sc.next();
				tel.setType(type);
				System.out.print("전화번호를 입력하세요 : ");
				String number = sc.next();
				tel.setNumber(number);
				contact.addTel(tel);
				
				
			} else if (selected == 3) {
			//	주소 정보를 입력받아서 Contact에 저장
			//	Address 객체 생성 -> 값 입력받아서 채우고 -> Contact setter 이용 저장
				System.out.print("시도를 입력하세요 : ");
				String sido = sc.next();
				addr.setSido(sido);
				System.out.print("구군를 입력하세요 : ");
				String gugun = sc.next();
				addr.setGugun(gugun);
				System.out.print("상세주소를 입력하세요 : ");
				String detail = sc.next();
				addr.setDetail(detail);
				contact.setAddress(addr);
				System.out.println("주소 정보 입력이 완료되었습니다.");
			

			} else if (selected == 4) {
				System.out.println("======= 정 보 조 회 ==========");
				System.out.println("이용자 이름 : "+ contact.getName());
				System.out.println("========= 연 락 처 ===========");
				for (int i=0; i<contact.getTelsLength(); i++) {
					System.out.println("종    류  : "+ contact.getTels()[i].getType());
					System.out.println("전화번호  : "+ contact.getTels()[i].getNumber());
				}
				
				String adr = addr.getSido() + " " + addr.getGugun() + " " + addr.getDetail();
				System.out.println("이용자 주소 : " + adr );
				System.out.println("==============================");
			
			} else if (selected == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			
			} else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}

		} // end for();

	} // end main();
}