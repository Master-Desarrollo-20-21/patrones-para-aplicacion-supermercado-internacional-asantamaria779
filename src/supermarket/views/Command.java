package supermarket.views;

import supermarket.controllers.PaymentController;

abstract class Command extends supermarket.utils.Command {

  protected PaymentController paymentController;

  protected Command(String title, PaymentController paymentController) {
    super(title);
    this.paymentController = paymentController;
  }

}
