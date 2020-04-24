package model;

public class Heels implements Item{

	private static int price;
	private static String productNum;
	private static String color;
	private static int size;
	private static int inStock;
	
	public Heels(int cost, String proNum, String pattern, int sizeOf, int stockNum) {
		this.price=cost;
		this.productNum=proNum;
		this.color=pattern;
		this.size=sizeOf;
		this.inStock=stockNum;
	}
	
	public static int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public static String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public static int getInStock() {
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
