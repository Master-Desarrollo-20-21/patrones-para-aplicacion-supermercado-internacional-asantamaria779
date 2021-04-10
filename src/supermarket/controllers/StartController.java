package supermarket.controllers;

import supermarket.models.Session;
import supermarket.main.CountryConfigurator;

public class StartController extends UseCaseController implements AcceptorController {

	protected StartController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);		
	}

	public void createTicket() {
		this.session.setTicket(CountryConfigurator.getInstance().createTicket());
		this.session.next();
	}
}
