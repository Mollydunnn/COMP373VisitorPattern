package model;

public interface Item {

	public int accept(StorageRoomVisitor visitor);
}
