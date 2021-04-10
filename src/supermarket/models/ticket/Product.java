package supermarket.models.ticket;

public class Product {
	
	private int itemCode;
	private int itemUnits;
	private float itemPrice;
	
	public Product(int itemCode,int itemUnits,float itemPrice) {
		this.itemCode = itemCode;
		this.itemUnits = itemUnits;
		this.itemPrice = itemPrice;
	}
	
	protected int getItemCode() {
		return this.itemCode;
	}	
	
	protected int getItemUnits() {
		return this.itemUnits;
	}
	
	protected float totalPrice() {
		return this.itemUnits * this.itemPrice;
	}
}
