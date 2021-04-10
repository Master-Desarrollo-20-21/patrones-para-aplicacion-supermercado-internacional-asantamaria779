package supermarket.models.ticket;

public abstract class WithProductLine extends Line {
	
	protected Product product;

	protected WithProductLine(Product product) {
		this.product = product;
	}
	
	public int getItemCode() {
		return this.product.getItemCode();
	}
	
	public int getItemUnits() {
		return this.product.getItemUnits();
	}
	
	public float totalPrice() {
		return this.product.totalPrice();
	}
}
