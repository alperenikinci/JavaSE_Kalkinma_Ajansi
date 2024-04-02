package week04.enums.kodornekleri.ornek01;

public enum BagSize {

	SHORT(15), MEDIUM(20), BIG(25);

	private int price;

	private BagSize(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}