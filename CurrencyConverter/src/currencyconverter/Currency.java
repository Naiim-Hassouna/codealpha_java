package currencyconverter;

/**
 * @author Naiim
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.94);
				this.exchangeValues.put("GBP", 0.82);
				this.exchangeValues.put("INR", 83.12);
				this.exchangeValues.put("CNY", 7.19);
				this.exchangeValues.put("LBP", 14963.26);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.06);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.87);
				this.exchangeValues.put("INR", 88.12);
				this.exchangeValues.put("CNY", 7.63);
				this.exchangeValues.put("LBP", 15863.30);
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.22);
				this.exchangeValues.put("EUR", 1.15);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("INR", 101.74);
				this.exchangeValues.put("CNY", 8.81);
				this.exchangeValues.put("LBP", 18315.02);
				break;
			case "Indian Rupee":
				this.exchangeValues.put("USD", 0.012);
				this.exchangeValues.put("EUR", 0.011);
				this.exchangeValues.put("GBP", 0.0098);
				this.exchangeValues.put("INR", 1.00);
				this.exchangeValues.put("CNY", 0.087);
				this.exchangeValues.put("LBP", 180.02);
				break;
			case "Chinese Yuan":
				this.exchangeValues.put("USD", 0.14);
				this.exchangeValues.put("EUR", 0.13);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("INR", 11.55);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("LBP", 2079.73);
				break;
			case "Lebanese Lira":
				this.exchangeValues.put("USD", 0.000067);
				this.exchangeValues.put("EUR", 0.000063);
				this.exchangeValues.put("GBP", 0.000055);
				this.exchangeValues.put("INR", 0.0056);
				this.exchangeValues.put("CNY", 0.00048);
				this.exchangeValues.put("LBP", 1.000);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Indian Rupee", "INR") );
		currencies.add( new Currency("Chinese Yuan", "CNY") );
		currencies.add( new Currency("Lebanese Lira", "LBP") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}