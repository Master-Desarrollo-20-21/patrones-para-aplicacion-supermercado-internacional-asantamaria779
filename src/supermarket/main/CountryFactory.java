package supermarket.main;

import supermarket.views.Menu;
import supermarket.controllers.PaymentController;
import supermarket.models.ticket.Ticket;

public abstract class CountryFactory {

	public abstract Ticket createTicket();
	public abstract Menu createMenu(PaymentController paymentController);
	
}
