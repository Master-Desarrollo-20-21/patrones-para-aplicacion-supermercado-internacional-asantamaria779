package supermarket.views;

import supermarket.controllers.PaymentController;

public class ExitLineCommand extends Command {

	public ExitLineCommand(String title, PaymentController paymentController) {
    super(title, paymentController);
  }

  @Override
  protected void execute() {
	  this.paymentController.closeTicket();
	  this.paymentController.next();
  }

  @Override
  protected boolean isActive() {
    return true;
  }

}
