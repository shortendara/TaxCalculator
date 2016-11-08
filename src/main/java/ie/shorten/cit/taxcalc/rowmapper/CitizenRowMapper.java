package ie.shorten.cit.taxcalc.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import ie.shorten.cit.taxcalc.domain.*;
import ie.shorten.cit.taxcalc.interfaces.*;

public class CitizenRowMapper implements RowMapper<Citizen>{

	@Override
	public Citizen mapRow(ResultSet rs, int index) throws SQLException {
		// TODO Auto-generated method stub
		Citizen citizen = new CitizenImpl();  
		citizen.set_name(rs.getString("name"));
		citizen.set_salary(rs.getDouble("salary"));
		return citizen;
	}
}
