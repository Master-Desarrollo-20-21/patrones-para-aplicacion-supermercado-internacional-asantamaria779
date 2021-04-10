package supermarket.models.ticket;

import java.util.ArrayList;

public class Ticket {
	private Header header;
	private ArrayList<Line> lines;
	private Footer footer;
	private TicketVisitor lineOperations;
	private TicketVisitor ticketOperations;

	public Ticket(Header header, Footer footer) {
		this.header = header;
		this.footer = footer;
		this.lines = new ArrayList<Line>();
	}
	
	public Footer getFooter() {
		return this.footer;
	}
	
	public Header getHeader() {
		return this.header;
	}	
	
	public void addLine(Line line) {
		this.lines.add(line);
	}
	
	public void setLineOperations(TicketVisitor operations) {
		this.lineOperations = operations;
	}
	
	public void setTicketOperations(TicketVisitor operations) {
		this.ticketOperations = operations;
	}
	
	public void close() {
		header.accept(ticketOperations);
		footer.accept(ticketOperations);
		for (Line line : lines) {
			line.accept(lineOperations);
		}	
	}

	public SaleLine getLine(int number) {
		return (SaleLine) this.lines.get(number-1);
	}
}
