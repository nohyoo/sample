public class DBAccessApp {
	public static void main(String[] args) {
/*
		DBAccess db1 = new DBAccess();
		DBAccess db2 = new DBAccess();
		DBAccess db3 = new DBAccess();
*/

		DBAccess db1 = DBAccess.getInstance();
		DBAccess db2 = DBAccess.getInstance();
		DBAccess db3 = DBAccess.getInstance();

		db1.insert();
		db3.insert();
		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		System.out.println(db1 == db2 && db1 == db3);


	} // end main();
}