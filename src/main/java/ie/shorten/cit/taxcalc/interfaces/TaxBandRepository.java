package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface TaxBandRepository {
	
	public void update_exempt_limit(TaxBands tax_bands);
	
	public double get_exempt_limit();
	
	public void update_lower_limit(TaxBands tax_bands);
	
	public double get_lower_limit();
	
	public void update_lower_taxrate(TaxBands tax_bands);
	
	public double get_lower_taxrate();
	
	public void update_higher_taxrate(TaxBands tax_bands);
	
	public double get_higher_taxrate();
	
	public void update_solitary_taxrate(TaxBands tax_bands);
	
	public double get_solitary_taxrate();
	
	public List<TaxBands> list_all_taxrates();
	
}
