package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface CitizenRepository {

	public Citizen get_citizen(int id);
	
	public void save(Citizen citizen);
	
	public void delete(Citizen citizen);
	
	public List<Citizen> find_all();
}
