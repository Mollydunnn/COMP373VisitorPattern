package view;

import model.Dress;
import model.Heels;

public class Client {
	static int totalStock;
	public static void main(String[] args) {
		new Dress(24, "L50247", "Black", "Large", 4);
		new Heels(30, "S53943", "Red", 10, 6);
		
		System.out.println("Dress information:");
		System.out.println("Price: "+ Dress.getPrice());
		System.out.println("Product Number: "+ Dress.getTagNumber());
		System.out.println("Color:"+ Dress.getColor());
		System.out.println("Size: "+ Dress.getSize());
		
		System.out.println("\nHeels information:");
		System.out.println("Price: "+ Heels.getPrice());
		System.out.println("Product Number: "+ Heels.getProductNum());
		System.out.println("Color:"+ Heels.getColor());
		System.out.println("Size: "+ Heels.getSize());
		
		System.out.println("\nTotal items in stock: "+ calculateStock());
	}
	private static int calculateStock() {
		totalStock= Dress.getInStock()+ Heels.getInStock();
		return totalStock;
		
	}
}
