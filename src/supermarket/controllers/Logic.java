package supermarket.controllers;

import java.util.HashMap;
import java.util.Map;
import supermarket.types.StateValue;
import supermarket.models.Session;

public class Logic {

  private Session session;
  private Map<StateValue, AcceptorController> controllers;

  public Logic() {
    this.session = new Session();
    this.controllers = new HashMap<StateValue, AcceptorController>();
    this.controllers.put(StateValue.INITIAL, new StartController(this.session));
    this.controllers.put(StateValue.IN_PAYMENT, new PaymentController(this.session));
    this.controllers.put(StateValue.EXIT, null);
  }

  public AcceptorController getController() {
    return this.controllers.get(this.session.getValueState());
  }

}
