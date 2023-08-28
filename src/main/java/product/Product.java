package product;

public class Product {
	private String productNumber;
	private String name;
	private long stock;
	public Product() {}
	public Product(String productNumber, String name, long stock) {
		this.productNumber = productNumber;
		this.name = name;
		this.stock = stock;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public String getName() {
		return name;
	}

	public long getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productNumber='" + productNumber + '\'' +
				", name='" + name + '\'' +
				", stock=" + stock +
				'}';
	}
}
