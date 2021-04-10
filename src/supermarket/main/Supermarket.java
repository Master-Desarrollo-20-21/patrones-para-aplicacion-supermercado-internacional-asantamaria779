package supermarket.main;
import supermarket.views.View;
import supermarket.controllers.AcceptorController;
import supermarket.controllers.Logic;

public class Supermarket {
	
	private Logic logic;
	private View view;
	
	Supermarket() {
		this.logic = new Logic();
		this.view = new View();
	}
	
	private void pay() {
        AcceptorController controller;
		do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
		} while (controller != null);
    }
	
	public static void main(String[] args) {
		new Supermarket().pay();
	}
}
