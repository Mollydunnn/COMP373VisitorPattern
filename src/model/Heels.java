package model;

public class Heels implements Item{

	private int price;
	private String productNum;
	private String color;
	private int size;
	private int inStock;
	
	public Heels(int cost, String proNum, String pattern, int sizeOf, int stockNum) {
		this.price=cost;
		this.productNum=proNum;
		this.color=pattern;
		this.size=sizeOf;
		this.inStock=stockNum;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInstock(int inStock) {
		this.inStock=inStock;
	}

	@Override
	public int accept(StorageRoomVisitor visitor) {
		return visitor.visit(this);
	}

}
