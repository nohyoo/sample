public abstract class Transaction {

	public void connect() {
		System.out.println("���� ������ ����!");
	}


	public void close() {
		System.out.println("���� ������ ���� ����!");
	}


	public abstract void job();

	public void process() {
		connect();
		job();
		close();
	}

}