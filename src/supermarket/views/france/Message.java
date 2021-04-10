package supermarket.views.france;

import supermarket.utils.Console;

public enum Message {
	
	CHAIN_NAME("**** SUPERMARKET ****"),
	SALE_LINE_COMMAND("Ligne de vente"),
	REPETITION_LINE_COMMAND("Ligne de répétition"),
	CANCELLATION_LINE_COMMAND("Ligne d'annulation"),
	EXIT_LINE_COMMAND ("Sortir");

	private String message;

	private Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void write() {
		Console.instance().write(this.message);
	}

	public void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
  }
}
