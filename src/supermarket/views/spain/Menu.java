package supermarket.views.spain;

import supermarket.controllers.PaymentController;
import supermarket.views.SaleLineCommand;
import supermarket.views.RepetitionLineCommand;
import supermarket.views.CancellationLineCommand;
import supermarket.views.ExitLineCommand;
import supermarket.views.ReturnLineCommand;

public class Menu extends supermarket.views.Menu {

	protected Menu(PaymentController paymentController) {
		super(paymentController);
	}
	
	protected void addCommands(PaymentController paymentController) {
		this.addCommand(new SaleLineCommand(Message.SALE_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new RepetitionLineCommand(Message.REPETITION_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new CancellationLineCommand(Message.CANCELLATION_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new ReturnLineCommand(Message.RETURN_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new ExitLineCommand(Message.EXIT_LINE_COMMAND.getMessage(),paymentController));
	}
	
}
