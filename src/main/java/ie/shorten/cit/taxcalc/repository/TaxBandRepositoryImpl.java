package ie.shorten.cit.taxcalc.repository;
import org.springframework.jdbc.core.JdbcTemplate;

import ie.shorten.cit.taxcalc.interfaces.*;

public class TaxBandRepositoryImpl implements TaxBandRepository {

	private JdbcTemplate jdbc_template;
	
	public TaxBandRepositoryImpl(JdbcTemplate jdbc_template){
		this.jdbc_template = jdbc_template;
	}
	
	@Override
	public void update_exempt_limit(double exempt_limit) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tax_bands SET excempt_tax_limit = ?";
		jdbc_template.execute(sql);
	}

	@Override
	public void update_lower_limit(double lower_limit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update_lower_rate(double tax_rate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update_higher_limit(double higher_limit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update_higher_rate(double tax_rate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update_solitary_rate(double solitary_rate) {
		// TODO Auto-generated method stub

	}

}
