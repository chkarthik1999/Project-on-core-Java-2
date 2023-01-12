package ecommerce;

public class Catalog {
	private Product[] listOfAllProducts;
	private Product [] electronicsProduct;
	private Product [] funitureItem;
	
	public Product[] getElectronicsProduct() {
		Product electronics1 = new Product();
		electronics1.setProductId("1");
		electronics1.setCost("10,000/-");
		electronics1.setProductName("Mobiles");
		Product electronics2 = new Product();
		electronics2.setProductId("2");
		electronics2.setProductName("Laptop");
		electronics2.setCost("30,000/-");
		Product electronics3 = new Product();
		electronics3.setProductId("3");
		electronics3.setProductName("Tv");
		electronics3.setCost("50,000/-");
		Product electronics4 = new Product();
		electronics4.setProductId("4");
		electronics4.setProductName("Washing machine");
		electronics4.setCost("40,000/-");
		electronicsProduct = new Product[4];
		electronicsProduct[0] =electronics1;
		electronicsProduct[1] =electronics2;
		electronicsProduct[2] =electronics3;
		electronicsProduct[3] =electronics4;
		return electronicsProduct;
	}

	public void setElectronicsProduct(Product[] electronicsProduct) {
		this.electronicsProduct = electronicsProduct;
	}

	public Product[] getFunitureItem() {
		
		Product furniture1 = new Product();
		furniture1.setProductId("1");
		furniture1.setCost("10,000/-");
		furniture1.setProductName("Dining Table");
		
		Product furniture2 = new Product();
		furniture2.setProductId("2");
		furniture2.setCost("20,000/-");
		furniture2.setProductName("Sofa");
		
		Product furniture3 = new Product();
		furniture3.setProductId("3");
		furniture3.setCost("15,000/-");
		furniture3.setProductName("Diwana coat");
		
		Product furniture4 = new Product();
		furniture4.setProductId("4");
		furniture4.setCost("10,000/-");
		furniture4.setProductName("Computer Table");
		funitureItem = new Product[4];
		funitureItem [0] =furniture1;
		funitureItem [1] =furniture2;
		funitureItem [2] =furniture3;
		funitureItem [3] =furniture4;
		return funitureItem;
	}

	public void setFunitureItem(Product[] funitureItem) {
		this.funitureItem = funitureItem;
	}
	private Product[] listofAllProductsSeller;

	public Product[] getListOfAllProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Jeans");
		product1.setCost("1000/-");
		
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Shirts");
		product2.setCost("800/-");
		
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("Shorts");
		product3.setCost("500/-");
		
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Track Pants");
		product4.setCost("450/-");
		listOfAllProducts = new Product[4];
		listOfAllProducts[0] = product1;
		listOfAllProducts[1] = product2;
		listOfAllProducts[2] = product3;
		listOfAllProducts[3] = product4;
		return listOfAllProducts;
	}

	public void setListOfAllProducts(Product[] listOfAllProducts) {
		this.listOfAllProducts = listOfAllProducts;
	}
	
	public Product[] getListofAllProductsSeller() {
		Product products1 = new Product();
		products1.setProductId("1");
		products1.setProductName("Product 10");
		products1.setCost("3000");
		Product products2 = new Product();
		products2.setProductId("2");
		products2.setProductName("Product 20");
		products2.setCost("4000");
		listofAllProductsSeller = new Product[2];
		listofAllProductsSeller[0] = products1;
		listofAllProductsSeller[1] = products2;
		return listofAllProductsSeller;
		
	}
	public void setListofAllProductsSeller(Product[] listofAllProductsSellor) {
		this.listofAllProductsSeller = listofAllProductsSellor;
	}
}
