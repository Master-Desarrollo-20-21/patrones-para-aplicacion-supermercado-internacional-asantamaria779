package supermarket.views.france;

import supermarket.controllers.PaymentController;
import supermarket.views.SaleLineCommand;
import supermarket.views.RepetitionLineCommand;
import supermarket.views.CancellationLineCommand;
import supermarket.views.ExitLineCommand;

public class Menu extends supermarket.views.Menu {

	public Menu(PaymentController paymentController) {
		super(paymentController);
	}
	
	protected void addCommands(PaymentController paymentController) {
		this.addCommand(new SaleLineCommand(Message.SALE_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new RepetitionLineCommand(Message.REPETITION_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new CancellationLineCommand(Message.CANCELLATION_LINE_COMMAND.getMessage(), paymentController));
		this.addCommand(new ExitLineCommand(Message.EXIT_LINE_COMMAND.getMessage(),paymentController));
	}
	
}
