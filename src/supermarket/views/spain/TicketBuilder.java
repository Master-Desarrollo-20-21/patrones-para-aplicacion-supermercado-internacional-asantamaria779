package supermarket.views.spain;

import supermarket.models.operations.*;
import supermarket.models.ticket.Ticket;

public class TicketBuilder implements supermarket.models.ticket.TicketBuilder {

	public Ticket buildTicket() {
		
		Ticket ticket = new Ticket(new Header(), new Footer());
		ticket.setLineOperations(this.buildLineOperations());
		ticket.setTicketOperations(this.buildTicketOperations());
		
		return ticket;
	}
	
	private TicketOperationComposite buildLineOperations() {
		
		TicketOperationComposite operations = new TicketOperationComposite();		
		operations.add(new PriceCalculationOperation());
		operations.add(new ClientPrinterOperation());
		operations.add(new TaxPrinterOperation());		

		return operations;
	}
	
	private TicketOperationComposite buildTicketOperations() {	
		
		TicketOperationComposite operations = new TicketOperationComposite();
		operations.add(new PriceCalculationOperation());
		operations.add(new ClientPrinterOperation());
		operations.add(new TaxPrinterOperation());
		
		return operations;
	}
}
