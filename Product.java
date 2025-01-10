package UserLoginArray;


public class Product {
	
	private int id;
	private String name;
	private double price;
	private double gst; 
	private String orderLocation;
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getGst() {
		return gst;
	}


	public void setGst(double gst) {
		this.gst = gst;
	}


	public String getOrderLocation() {
		return orderLocation;
	}


	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", gst=" + gst + ", orderLocation="
				+ orderLocation + "]";
	}
	
	
}
