package supermarket.views;

import supermarket.controllers.PaymentController;

public abstract class Menu extends supermarket.utils.Menu {
	
	public Menu (PaymentController paymentController) {
		super();
		this.addCommands(paymentController);
	}
	
	protected abstract void addCommands(PaymentController paymentController);

}
