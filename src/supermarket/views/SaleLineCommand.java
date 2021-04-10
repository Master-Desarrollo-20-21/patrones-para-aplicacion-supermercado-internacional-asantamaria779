package supermarket.views;

import supermarket.controllers.PaymentController;
import supermarket.utils.Console;

public class SaleLineCommand extends Command {

	int itemCode;
	int itemUnits;
	float itemPrice;
	
	public SaleLineCommand(String title, PaymentController paymentController) {
		super(title, paymentController);
	}

	@Override
	protected void execute() {
		itemCode = Console.instance().readInt("Código del artículo: ");
		itemUnits = Console.instance().readInt("Número de unidades: ");
		itemPrice = Console.instance().readFloat("Precio unitario: ");
		this.paymentController.addTicketSaleLine(itemCode,itemUnits,itemPrice);
	}

	@Override
	protected boolean isActive() {
		return true;
	}
}
