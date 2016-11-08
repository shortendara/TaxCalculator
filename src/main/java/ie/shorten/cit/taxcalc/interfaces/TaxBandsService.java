package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface TaxBandsService {

	void update_exempt_limit(TaxBands tax_bands);
	void update_lower_limit(TaxBands tax_bands);
	void update_lower_tax_rate(TaxBands tax_bands);
	void update_higher_tax_rate(TaxBands tax_bands);
	void update_solitary_tax_rate(TaxBands tax_bands);
	List<TaxBands> list_all();
}
