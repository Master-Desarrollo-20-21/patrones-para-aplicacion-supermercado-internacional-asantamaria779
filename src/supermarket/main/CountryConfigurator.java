package supermarket.main;

import supermarket.models.ticket.Ticket;
import supermarket.views.Menu;
import supermarket.utils.File;
import java.lang.reflect.InvocationTargetException;

import supermarket.controllers.PaymentController;

public class CountryConfigurator {
	
	private final String COUNTRY_CONFIGURATION = "C:\\_EscuelaIT\\eclipse-workspace\\Supermarket\\src\\supermarket\\ticket";
	private static CountryConfigurator countryConfigurator;
	
	private CountryFactory countryFactory;
	
	public static CountryConfigurator getInstance() {
		if (countryConfigurator == null) {
			countryConfigurator = new CountryConfigurator();
		}
		return countryConfigurator;
	}
	private CountryConfigurator() {
		this.countryFactory = this.getCountryFactory();
	}
	
	private CountryFactory getCountryFactory() {
		String line = new File().readFile(COUNTRY_CONFIGURATION);
		try {
			return (CountryFactory) (Class.forName(line).getDeclaredConstructor().newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();		
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Ticket createTicket() {
		return this.countryFactory.createTicket();
	}
	
	public Menu createMenu(PaymentController paymentController) {
		return this.countryFactory.createMenu(paymentController);
	}
	
}
