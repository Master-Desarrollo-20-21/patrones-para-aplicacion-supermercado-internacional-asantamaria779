package supermarket.views.spain;

import supermarket.utils.Console;

public enum Message {

	CHAIN_NAME("**** SUPERMARKET ****"),
	SALE_LINE_COMMAND("L�nea de venta"),
	REPETITION_LINE_COMMAND("L�nea de repetici�n"),
	CANCELLATION_LINE_COMMAND("L�nea de anulaci�n"),
	RETURN_LINE_COMMAND("L�nea de devoluci�n"),
	EXIT_LINE_COMMAND ("Salir");
	private String message;

	private Message(String message) {
		this.message = message;
	}

	protected String getMessage() {
		return this.message;
	}

	protected void write() {
		Console.instance().write(this.message);
	}

	protected void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
  }
}
