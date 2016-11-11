package ie.shorten.cit.taxcalc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ie.shorten.cit.taxcalc.interfaces.*;

@Service
public class TaxBandsServiceImpl implements TaxBandsService{

	@Autowired
	TaxBandRepository tax_band_repository;

	@Override
	public void update_exempt_limit(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		tax_band_repository.update_exempt_limit(tax_bands);
	}
	
	@Override
	public double get_exempt_limit() {
		// TODO Auto-generated method stub
		return tax_band_repository.get_exempt_limit();
	}

	@Override
	public void update_lower_limit(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		tax_band_repository.update_lower_limit(tax_bands);
	}
	
	@Override
	public double get_lower_limit() {
		// TODO Auto-generated method stub
		return tax_band_repository.get_lower_limit();
	}

	@Override
	public void update_lower_taxrate(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		tax_band_repository.update_lower_taxrate(tax_bands);
	}
	
	@Override
	public double get_lower_taxrate() {
		// TODO Auto-generated method stub
		return tax_band_repository.get_lower_taxrate();
	}

	@Override
	public void update_higher_taxrate(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		tax_band_repository.update_higher_taxrate(tax_bands);
	}
	
	@Override
	public double get_higher_taxrate() {
		// TODO Auto-generated method stub
		return tax_band_repository.get_higher_taxrate();
	}

	@Override
	public void update_solitary_taxrate(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		tax_band_repository.update_solitary_taxrate(tax_bands);
	}
	
	@Override
	public double get_solitary_rate() {
		// TODO Auto-generated method stub
		return tax_band_repository.get_solitary_taxrate();
	}

	@Override
	public List<TaxBands> list_all() {
		// TODO Auto-generated method stub
		return tax_band_repository.list_all_taxrates();
	}	
}
