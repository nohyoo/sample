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
				System.out.println("상 품 명 : "+p.getName());
				System.out.println("회 사 명 : "+p.getCompany());
				System.out.println("가    격 : "+p.getPrice());
				System.out.println("할 인 율 : "+p.getRate());
				System.out.println();
			}
				
			

		} catch (FileNotFoundException e) {
			 // FileNotFoundException 을 가로채고, 대신 L2Exception을 생성해서 던짐.
			 throw new L2Exception();

		} catch (IOException e) {
			// IOException 을 가로채고, 대신 L2Exception을 생성해서 던짐.
			throw new L2Exception();
		}
		
	}


	//	상품정보 텍스트 한 줄을 전달받아서
	//	잘라서 Product에 담아서 반환하기
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