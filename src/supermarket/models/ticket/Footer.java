package supermarket.models.ticket;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Footer {
	
	protected ArrayList<String> footer;
	
	private float totalPrice;
	
	public float getTotalPrice() {
		return totalPrice;
	}
	
	protected Footer() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		Calendar calendar = new GregorianCalendar();
		this.footer = new ArrayList<String>();
		this.footer.add(simpleDateFormat.format(calendar.getTime()));
	}
	
	protected void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	public String toString() {
		
		return "";		
	}
}
