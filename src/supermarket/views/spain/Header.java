package supermarket.views.spain;

import java.util.ArrayList;

public class Header extends supermarket.models.ticket.Header {
	
	protected Header() {
		super();
		this.header.add("Avda. de la Paz, 25");
		this.header.add("CIF: A-28425270	TLF: 941253674");
	}

	public ArrayList<String> getHeader() {
		return header;
	}
	
}
