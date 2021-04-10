package supermarket.models.ticket;

public abstract class WithNumberLine extends Line {
	
	protected int number;
	
	protected WithNumberLine(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
