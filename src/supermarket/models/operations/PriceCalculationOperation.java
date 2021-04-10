package supermarket.models.operations;

import supermarket.models.ticket.Header;
import supermarket.models.ticket.SaleLine;
import supermarket.models.ticket.RepetitionLine;
import supermarket.models.ticket.CancellationLine;
import supermarket.models.ticket.ReturnLine;
import supermarket.models.ticket.Footer;

public class PriceCalculationOperation extends Operation {
	
	@Override
	public void visit(Header head) {
		System.out.println("DIS: Head: " + head.getDate());
	}

	@Override
	public void visit(SaleLine saleLine) {
		saleLine.setPrice(saleLine.totalPrice());
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		SaleLine saleLine = (SaleLine) ticket.getLine(repetitionLine.getNumber());
		repetitionLine.setPrice(saleLine.totalPrice());
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		SaleLine saleLine = (SaleLine) ticket.getLine(cancellationLine.getNumber());
		cancellationLine.setPrice(-saleLine.totalPrice());
	}

	@Override
	public void visit(ReturnLine returnLine) {
		returnLine.setPrice(-returnLine.totalPrice());
	}

	@Override
	public void visit(Footer footer) {
		System.out.println("DIS: Foot: " + footer.getTotalPrice());
	}
}
