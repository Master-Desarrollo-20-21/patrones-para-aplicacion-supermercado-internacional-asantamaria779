package supermarket.views;

import supermarket.controllers.PaymentController;

public class RepetitionLineCommand extends Command {

	public RepetitionLineCommand(String title,PaymentController paymentController) {
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
