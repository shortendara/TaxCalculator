package ie.shorten.cit.taxcalc.interfaces;

public interface TaxBands {

	public void set_lower_rate(double lower_rate);
	
	public double get_lower_rate();
	
	public void set_middle_rate(double middle_rate);
	
	public double get_middle_rate();
	
	public void set_higher_rate(double higher_rate);
	
	public double get_higher_rate();
	
	public void set_soloitary_rate(double solitary_rate);
	
	public double get_solitary_rate();
}
