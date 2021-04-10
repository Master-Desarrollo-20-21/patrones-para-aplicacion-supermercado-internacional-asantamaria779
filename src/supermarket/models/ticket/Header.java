package supermarket.models.ticket;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public abstract class Header {
	
	protected ArrayList<String> header;
	private Date date;
	
	protected Header() {
		this.header = new ArrayList<String>();
		this.header.add("**** SUPERMARKET ****");		
		this.date = Calendar.getInstance().getTime();
	}

	public ArrayList<String> getHeader() {
		return header;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	protected void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}	
}
