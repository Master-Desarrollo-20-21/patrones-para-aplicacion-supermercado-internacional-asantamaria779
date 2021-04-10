package supermarket.views;

import supermarket.controllers.PaymentController;

public class CancellationLineCommand extends Command {

	public CancellationLineCommand(String title, PaymentController paymentController) {
		super(title, paymentController);
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
