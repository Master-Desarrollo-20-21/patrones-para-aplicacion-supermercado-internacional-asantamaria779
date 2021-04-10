package supermarket.models.ticket;

public class SaleLine extends WithProductLine {
	
	public SaleLine(Product product) {
		super(product);
	}
	
	protected void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
}
