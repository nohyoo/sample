public abstract class DBAccess {

	public void conntect() {
		System.out.println("DB conntected!");
	}

	// abstract
	public abstract void createRepository();

	public void disconnect() {
		System.out.println("DB disconnected!");
	}

}