import java.io.*;

public class ProductService {
	
	public static void read() {
		
		try {

			BufferedReader reader = new BufferedReader(new FileReader("phone.txt"));
			Product[] products = new Product[4];
			
			for(int i=0; i<products.length; i++) {
				products[i] = parseData(reader.readLine());
			}
			
			for (Product p : products) {
				System.out.println("�� ǰ �� : "+p.getName());
				System.out.println("ȸ �� �� : "+p.getCompany());
				System.out.println("��    �� : "+p.getPrice());
				System.out.println("�� �� �� : "+p.getRate());
				System.out.println();
			}
				
			

		} catch (FileNotFoundException e) {
			 // FileNotFoundException �� ����ä��, ��� L2Exception�� �����ؼ� ����.
			 throw new L2Exception();

		} catch (IOException e) {
			// IOException �� ����ä��, ��� L2Exception�� �����ؼ� ����.
			throw new L2Exception();
		}
		
	}


	//	��ǰ���� �ؽ�Ʈ �� ���� ���޹޾Ƽ�
	//	�߶� Product�� ��Ƽ� ��ȯ�ϱ�
	public static Product parseData(String text) {
		Product p = new Product();
		String[] arr = text.split(",");
		String name = arr[0];
		String company = arr[1];
		int price = Integer.parseInt(arr[2]);
		double rate = Double.parseDouble(arr[3]);

		p.setName(name);
		p.setCompany(company);
		p.setPrice(price);
		p.setRate(rate);

		return p;
	}

}