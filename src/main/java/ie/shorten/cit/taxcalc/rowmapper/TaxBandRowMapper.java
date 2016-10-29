package ie.shorten.cit.taxcalc.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import ie.shorten.cit.taxcalc.domain.*;

public class TaxBandRowMapper implements RowMapper<TaxBandsImpl>{

	@Override
	public TaxBandsImpl mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		TaxBandsImpl tax_bands = new TaxBandsImpl();
		tax_bands.set_exempt_limit(rs.getDouble("excempt_tax_limit"));
		tax_bands.set_lower_rate(rs.getDouble("lower_tax_rate"));
		tax_bands.set_lower_limit(rs.getDouble("lower_tax_limit"));
		tax_bands.set_higher_rate(rs.getDouble("higher_tax_rate"));
		tax_bands.set_soloitary_rate(rs.getDouble("solitary_tax_rate"));
		return tax_bands;
	}

}
