package supermarket.controllers;

import supermarket.models.Session;
import supermarket.models.ticket.Product;
import supermarket.models.ticket.SaleLine;

public class PaymentController extends UseCaseController implements AcceptorController {
	
	protected PaymentController(Session session) {
		super(session);
	}

	public void next() {
		this.session.next();		
	}
	
	public void closeTicket() {
		this.session.closeTicket();
		this.session.next();
	}

	public void addTicketSaleLine(int itemCode, int itemUnits, float itemPrice) {
		this.session.addTicketLine(new SaleLine(new Product(itemCode,itemUnits,itemPrice)));
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
	
}
