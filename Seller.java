package ecommerce;

public class Seller extends User{
private Product [] productsListed;

	public Product[] getProductsListed() {
	return productsListed;
}
public void setProductsListed(Product[] productsListed) {
	this.productsListed = productsListed;
}
	public Boolean verifyUser() {
		
		return true;
	}

}