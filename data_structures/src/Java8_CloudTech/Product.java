package Java8_CloudTech;

public class Product {

	private Integer id;
	private Integer price;
	private String name;
	private String category;
	public Product(Integer id, Integer price, String name, String category) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.category = category;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", category=" + category + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
