package ie.shorten.cit.taxcalc.interfaces;

public interface TaxBandRepository {
	
	public void update_exempt_limit(double exempt_limit);
	
	public void update_lower_limit(double lower_limit);
	
	public void update_lower_rate(double tax_rate);
	
	public void update_higher_limit(double higher_limit);
	
	public void update_higher_rate(double tax_rate);
	
	public void update_solitary_rate(double solitary_rate);
	
}
