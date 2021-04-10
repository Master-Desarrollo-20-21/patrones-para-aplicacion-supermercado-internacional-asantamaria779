package supermarket.views.spain;

import supermarket.controllers.PaymentController;
import supermarket.main.CountryFactory;
import supermarket.models.ticket.Ticket;

public class CountrySpain extends CountryFactory {
	
	public Menu createMenu(PaymentController paymentController) {
		return new Menu(paymentController);
	};
	
	public Ticket createTicket() {
		return new TicketBuilder().buildTicket();
	};
	
}
