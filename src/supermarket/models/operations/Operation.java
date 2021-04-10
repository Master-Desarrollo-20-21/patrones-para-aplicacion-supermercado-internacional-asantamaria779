package supermarket.models.operations;

import supermarket.models.ticket.TicketVisitor;
import supermarket.models.ticket.Ticket;
import supermarket.models.ticket.Header;
import supermarket.models.ticket.Footer;
import supermarket.models.ticket.SaleLine;
import supermarket.models.ticket.RepetitionLine;
import supermarket.models.ticket.CancellationLine;
import supermarket.models.ticket.ReturnLine;

public abstract class Operation implements TicketVisitor {
	protected Ticket ticket;
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void visit(Header head) {
	}

	@Override
	public void visit(SaleLine saleLine) {
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
	}

	@Override
	public void visit(ReturnLine returnLine) {
	}

	@Override
	public void visit(Footer footer) {
	}
}
