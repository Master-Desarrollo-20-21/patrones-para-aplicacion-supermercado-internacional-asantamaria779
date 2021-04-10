package supermarket.views;

import supermarket.controllers.PaymentController;
import supermarket.main.CountryConfigurator;

public class PaymentView {
	
	private Menu menu;
	
	public void interact(PaymentController paymentController) {
		if (this.menu == null) {			
			this.menu = CountryConfigurator.getInstance().createMenu(paymentController);
		}
		this.menu.execute();
	}
}
