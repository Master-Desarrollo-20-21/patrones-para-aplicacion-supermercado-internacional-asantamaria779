package supermarket.models.ticket;

public class CancellationLine extends WithNumberLine {
	
	public CancellationLine(int number) {
		super(number);
	}
	
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
}
