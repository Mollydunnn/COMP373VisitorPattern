package model;

public class Dress implements Item{

	private static int price;
	private static String tagNumber;
	private static String color;
	private static String size;
	private static int inStock;
	
	
	public Dress(int cost, String tagNum, String pattern, String sizeOf, int stockNum) {
		this.price=cost;
		this.tagNumber=tagNum;
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
	public static String getTagNumber() {
		return tagNumber;
	}
	public void setTagNumber(String tagNumber) {
		this.tagNumber = tagNumber;
	}
	public static String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static String getSize() {
		return size;
	}
	public void setSize(String size) {
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
