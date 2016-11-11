package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface TaxBandsService {

	void update_exempt_limit(TaxBands tax_bands);
	double get_exempt_limit();
	void update_lower_limit(TaxBands tax_bands);
	double get_lower_limit();
	void update_lower_taxrate(TaxBands tax_bands);
	double get_lower_taxrate();
	void update_higher_taxrate(TaxBands tax_bands);
	double get_higher_taxrate();
	void update_solitary_taxrate(TaxBands tax_bands);
	double get_solitary_rate();
	List<TaxBands> list_all();
}
