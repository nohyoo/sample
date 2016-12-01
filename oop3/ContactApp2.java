import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {

	// 연락처 정보를 입력받는 화면
		Scanner sc = new Scanner(System.in);

		ContactMgr mgr = new ContactMgr();
		Contact contact = new Contact();

		for ( ;; ) {
			System.out.println("메뉴 번호를 입력해주세요.");
			System.out.println("1.등록   2.조회   3.종료");
			
			int menuCode = sc.nextInt();	
			
			if (menuCode == 1) {
				// 등록
				// mgr의 addContact() 이용  객체 전달
				System.out.print("이름을 입력해주세요 : ");
				String inputName = sc.next();
				System.out.print("전화번호를 입력해주세요 : ");
				String inputPhone = sc.next();
				System.out.print("이메일을 입력해주세요 : ");
				String inputEmail = sc.next();
				
				contact.setSeq(mgr.getPosition());
				contact.setName(inputName);
				contact.setPhone(inputPhone);
				contact.setEmail(inputEmail);
				mgr.addContact(contact);
			
			} else if (menuCode == 2) {
				// 조회
				mgr.viewContact();
			
			} else if (menuCode == 3) {
				// 종료
				break;
		
			} else {
				System.out.println("메뉴 번호를 확인 후 입력해주세요.");
			}
			
		} // end for();

	} // end main();
}