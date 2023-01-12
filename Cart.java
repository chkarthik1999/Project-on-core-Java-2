package ecommerce;

public class Cart {
	private String cartId;
	
	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private Product[] ListOfProducts;

	public Product[] getListOfProducts() {
		return ListOfProducts;
	}

	public void setListOfProducts(Product[] listOfProducts) {
		ListOfProducts = listOfProducts;
	}
	public boolean checkout() {
		return true;
	}
	

}
