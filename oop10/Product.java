public class Product implements Comparable<Product>, Cloneable {

	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	public int compareTo(Product other) {
		int result = this.getPrice() - other.getPrice();
		return result;
	}

	
	public Product copy() throws CloneNotSupportedException {
		Object obj = clone();
		Product cp = (Product) obj;
		return cp;
	}


	// Object로부터 물려받은 toString() 재정의
	public String toString() {
		
		return "{name : "+name+", price : "+price+"} \n";
	}


}