package supermarket.models.ticket;

public class ReturnLine extends WithProductLine {
	
	public ReturnLine(Product product) {
		super(product);
	}
	
	protected void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
}
