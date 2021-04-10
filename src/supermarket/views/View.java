package supermarket.views;

import supermarket.controllers.AcceptorController;
import supermarket.controllers.PaymentController;
import supermarket.controllers.StartController;
import supermarket.controllers.ControllerVisitor;

public class View implements ControllerVisitor {

	private StartView startView;
	private PaymentView paymentView;
	
	public View(){
		this.startView = new StartView();
		this.paymentView = new PaymentView();
	}

	public void interact(AcceptorController controller) {
		controller.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);		
	}	
	
	@Override
	public void visit(PaymentController paymentController) {
		this.paymentView.interact(paymentController);		
	}
	
}