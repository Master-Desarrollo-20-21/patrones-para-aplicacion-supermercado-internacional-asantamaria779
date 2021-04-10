package supermarket.models.ticket;

public class RepetitionLine extends WithNumberLine {
	
	public RepetitionLine(int number) {
		super(number);
	}
	
	protected void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
}
