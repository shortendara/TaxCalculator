package ie.shorten.cit.taxcalc.repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.shorten.cit.taxcalc.interfaces.*;
import ie.shorten.cit.taxcalc.rowmapper.TaxBandRowMapper;

@Repository
public class TaxBandRepositoryImpl implements TaxBandRepository {

	private JdbcTemplate jdbc_template;
	
	@Autowired
	public TaxBandRepositoryImpl(JdbcTemplate jdbc_template){
		this.jdbc_template = jdbc_template;
	}
	
	@Override
	public void update_exempt_limit(TaxBands tax_bands) {
		// Exempt limit initially set to 10000
		String sql = "UPDATE tax_bands SET excempt_tax_limit = ?";
		jdbc_template.update(sql, new Object[]{ tax_bands.get_exempt_limit() });
		System.out.println("Exempt limit has been changed");
	}

	@Override
	public void update_lower_limit(TaxBands tax_bands) {
		// Lower limit is initially set to 15000
		String sql = "UPDATE tax_bands SET lower_tax_limit = ?";
		jdbc_template.update(sql, new Object[]{ tax_bands.get_lower_limit() });
		System.out.println("Lower limit has been changed");
	}

	@Override
	public void update_lower_taxrate(TaxBands tax_bands) {
		// Lower tax rate initially set to 20%
		String sql = "UPDATE tax_bands SET lower_tax_limit = ?";
		jdbc_template.update(sql, new Object[]{ tax_bands.get_lower_rate() });
		System.out.println("Lower tax rate has been changed");
	}

	@Override
	public void update_higher_taxrate(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tax_bands SET higher_tax_rate = ?";
		jdbc_template.update(sql, new Object[]{ tax_bands.get_higher_rate() });
		System.out.println("Higher tax rate has been changed");
	}

	@Override
	public void update_solitary_taxrate(TaxBands tax_bands) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tax_bands SET solitary_tax_rate = ?";
		jdbc_template.update(sql, new Object[]{ tax_bands.get_solitary_rate() });
		System.out.println("Higher tax rate has been changed");
	}

	@Override
	public List<TaxBands> list_all_tax_rates() {
		// TODO Auto-generated method stub
		String sql = "Select * from tax_bands";
		List<TaxBands> tax_bands = jdbc_template.query(sql, new TaxBandRowMapper());
		return tax_bands;
	}

}
