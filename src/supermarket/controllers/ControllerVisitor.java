package supermarket.controllers;

public interface ControllerVisitor {
  
	void visit(StartController startController);
	void visit(PaymentController paymentController);
	
}
