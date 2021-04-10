package supermarket.models.operations;

import supermarket.models.ticket.CancellationLine;
import supermarket.models.ticket.Footer;
import supermarket.models.ticket.Header;
import supermarket.models.ticket.RepetitionLine;
import supermarket.models.ticket.ReturnLine;
import supermarket.models.ticket.SaleLine;
import supermarket.models.ticket.Ticket;
import java.util.ArrayList;

public class TicketOperationComposite extends Operation {
	private ArrayList<Operation> operationList;
	
	public TicketOperationComposite() {
		operationList = new ArrayList<Operation>();
	}
	
	public void add(Operation Operation) {
		operationList.add(Operation);
	}
	
	@Override
	public void set(Ticket ticket) {
		super.set(ticket);
		for(Operation operation: operationList) {
			operation.set(ticket);
		}
	}
	
	@Override
	public void visit(Header head) {
		for(Operation operation : operationList){
			operation.visit(head);
		}
	}

	@Override
	public void visit(SaleLine saleLine) {
		for(Operation operation : operationList){
			operation.visit(saleLine);
		}
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		for(Operation operation : operationList){
			operation.visit(repetitionLine);
		}
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		for(Operation operation : operationList){
			operation.visit(cancellationLine);
		}
	}

	@Override
	public void visit(ReturnLine returnLine) {
		for(Operation operation : operationList){
			operation.visit(returnLine);
		}
	}

	@Override
	public void visit(Footer footer) {
		for(Operation ticketOperation : operationList){
			ticketOperation.visit(footer);
		}
	}
}
