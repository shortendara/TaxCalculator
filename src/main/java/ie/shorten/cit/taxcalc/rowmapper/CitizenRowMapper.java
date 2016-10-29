package ie.shorten.cit.taxcalc.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import ie.shorten.cit.taxcalc.domain.*;

public class CitizenRowMapper implements RowMapper<CitizenImpl>{

	@Override
	public CitizenImpl mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		CitizenImpl citizen = new CitizenImpl(); 
		
		citizen.set_name(rs.getString("name"));
		citizen.set_salary(rs.getDouble("salary"));
		
		return citizen;
	}

}
