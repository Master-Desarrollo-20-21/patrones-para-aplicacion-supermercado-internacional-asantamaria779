package supermarket.models.ticket;

public abstract class Line {
	
	protected float price;
	
	public void setPrice(float price){
		this.price = price;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	protected abstract void accept(TicketVisitor ticketVisitor);
}
