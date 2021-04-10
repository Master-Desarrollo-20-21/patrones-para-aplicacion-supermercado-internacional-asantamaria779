package supermarket.utils;

public class ClosedInterval {

	private int min;
	private int max;

	protected ClosedInterval(int min, int max) {
		assert min <= max;
		
		this.min = min;
		this.max = max;
	}

	protected boolean isIncluded(int value) {
		return this.min <= value && value <= this.max;
	}
	
	@Override
	public String toString() {
		return "[" + this.min + ", " + this.max + "]";
	}

}
