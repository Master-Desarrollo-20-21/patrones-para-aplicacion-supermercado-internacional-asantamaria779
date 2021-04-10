package supermarket.models;

import supermarket.models.ticket.Ticket;
import supermarket.models.ticket.Line;
import supermarket.types.StateValue;

public class Session {

	private State state;
  	private String employeeName;
  	private Ticket ticket;

	public Session() {
		this.state = new State();
	}

	public StateValue getValueState() {
	  return this.state.getValueState();
	}
  
	public void next() {
		this.state.next();
	}
	  
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void closeTicket() {
		this.ticket.close();		
	}

	public void addTicketLine(Line line) {
		this.ticket.addLine(line);	
	}

}
