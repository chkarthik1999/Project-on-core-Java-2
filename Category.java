package ecommerce;

public class Category {
	private String categoryname;
	private Category[] subCategories;
	

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Category[] getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Category[] subCategories) {
		this.subCategories = subCategories;
	}
}
