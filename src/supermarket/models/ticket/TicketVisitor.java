package supermarket.models.ticket;

public interface TicketVisitor {

	public abstract void visit(SaleLine saleLine);
	
	public abstract void visit(RepetitionLine repetionLine);
	
	public abstract void visit(ReturnLine returnLine);
	
	public abstract void visit(CancellationLine cancellationLine);	
	
	public abstract void visit(Header header);
		
	public abstract void visit(Footer footer);
}
