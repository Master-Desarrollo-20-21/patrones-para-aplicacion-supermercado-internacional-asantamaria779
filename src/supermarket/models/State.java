package supermarket.models;

import supermarket.types.StateValue;

public class State {

	private StateValue stateValue;

	protected State() {
	this.reset();
	}

	protected void reset() {
		this.stateValue = StateValue.INITIAL;
	}

	protected void next() {
		this.stateValue = StateValue.values()[(this.stateValue.ordinal() + 1) % StateValue.values().length];
	}

	protected StateValue getValueState() {
		return this.stateValue;
	}
}
