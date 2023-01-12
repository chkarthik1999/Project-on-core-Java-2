package ecommerce;

public class Order {
	private String orderId;
	private Customer user;
	Product[] listOfOrderProducts;
	

	public Product[] getListOfOrderProducts() {
		return listOfOrderProducts;
	}

	public void setListOfOrderProducts(Product[] listOfOrderProducts) {
		this.listOfOrderProducts = listOfOrderProducts;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}

	public Boolean checkout() {
		return true;
	}

}
