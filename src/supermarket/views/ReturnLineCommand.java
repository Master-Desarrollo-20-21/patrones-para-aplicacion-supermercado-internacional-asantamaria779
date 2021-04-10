package supermarket.views;

import supermarket.controllers.PaymentController;

public class ReturnLineCommand extends Command {

	public ReturnLineCommand(String title,PaymentController paymentController) {
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
