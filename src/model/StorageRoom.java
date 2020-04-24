package model;

public class StorageRoom implements StorageRoomVisitor {

	@Override
	public int visit(Dress dress) {
		// TODO should i have it return all the variables besides stock?
		int stock=0;
		stock= dress.getInStock();
		System.out.println("Boutique dress stock in total: "+stock);
		return stock;
	}

	@Override
	public int visit(Heels heels) {
		int stock=0;
		stock= heels.getInStock();
		System.out.println("Boutique heel stock in total: "+stock);
		return stock;
	}

}
