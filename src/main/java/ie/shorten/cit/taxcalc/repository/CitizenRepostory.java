package ie.shorten.cit.taxcalc.repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ie.shorten.cit.taxcalc.interfaces.*;
import ie.shorten.cit.taxcalc.rowmapper.*;

@Repository
public class CitizenRepostory implements CitizenRepository{

	private JdbcTemplate jdbc_template;
	
	@Autowired
	public CitizenRepostory(JdbcTemplate jdbc_template){
		this.jdbc_template = jdbc_template;
	}

	@Override
	public void save(Citizen citizen) {
		// TODO Auto-generated method stub
		System.out.println(citizen.get_take_home_pay());
		String sql = "INSERT INTO citizens(name, salary) VALUES(?, ?)";
		jdbc_template.update(sql, new Object[]{citizen.get_name(), citizen.get_salary()});
		System.out.println("Inserted citizen");
	}

	@Override
	public List<Citizen> find_all() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM citizens";
		List<Citizen> citizens  = jdbc_template.query(sql, new CitizenRowMapper());
		return citizens;
	}

}
