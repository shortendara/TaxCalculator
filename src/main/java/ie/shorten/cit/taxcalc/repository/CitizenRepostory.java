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
	public Citizen get_citizen(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * FROM citizens WHERE id = ?";
		Citizen citizen = jdbc_template.queryForObject(sql, new Object[]{ 1 }, new CitizenRowMapper());
		return citizen;
	}

	@Override
	public void save(Citizen citizen) {
		// TODO Auto-generated method stub
		if(citizen.get_id() != 0){
			System.out.println("Updating citizen");
			update(citizen);
		}else{
			insert(citizen);
		}
	}
	
	private void update(Citizen citizen){
		String sql = "UPDATE citizens SET name = ?, SET salary = ? WHERE id = ?";
		jdbc_template.update(sql, new Object[]{ citizen.get_name(), citizen.get_salary(), citizen.get_id()});
		System.out.println("INserted citizen");
	}
	
	private void insert(Citizen citezen){
		String sql = "INSERT INTO citizens(name, salary) VALUES(?, ?)";
		jdbc_template.update(sql, new Object[]{citezen.get_name(), citezen.get_salary()});
		System.out.println("INserted citizen");
	}

	@Override
	public void delete(Citizen citizen) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM citizens WHERE id = ?";
		jdbc_template.update(sql, new Object[] {citizen.get_id() });
	}

	@Override
	public List<Citizen> find_all() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM citizens";
		List<Citizen> citizens  = jdbc_template.query(sql, new CitizenRowMapper());
		return citizens;
	}

}
