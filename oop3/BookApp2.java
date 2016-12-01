public class BookApp2 {
	public static void main(String[] args) {
	
		Book[] bkCart = new Book[2];
		
		Book book1 = new Book();
		book1.setBkNo(52);
		book1.setBkTitle("力1格1力1格");
		book1.setBkAuthor("历1累1历1累");
		book1.setBkPublisher("免1魄1魄1荤");
		book1.setBkPrice(70000);
		book1.setBkDate("2014-01-01");

		Book book2 = new Book();
		book2.setBkNo(78);
		book2.setBkTitle("力2格2力2格");
		book2.setBkAuthor("历2累2历2累");
		book2.setBkPublisher("免2魄2魄2荤");
		book2.setBkPrice(50000);
		book2.setBkDate("2016-02-20");

		bkCart[0] = book1;
		bkCart[1] = book2;

		for (Book tmp : bkCart ) {
			System.out.println(tmp.getBkNo());
			System.out.println(tmp.getBkTitle());
			System.out.println(tmp.getBkAuthor());
			System.out.println(tmp.getBkPublisher());
			System.out.println(tmp.getBkPrice());
			System.out.println(tmp.getBkDate());

		}
		

	} // end main();
}