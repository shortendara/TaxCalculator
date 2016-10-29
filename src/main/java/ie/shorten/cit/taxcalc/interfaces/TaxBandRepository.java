package ie.shorten.cit.taxcalc.interfaces;

public interface TaxBandRepository {
	
	public TaxBands get_tax_bands();
	
	public void save(TaxBands tax_bands);
	
}
