package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface CitizenRepository {	
	public void save(Citizen citizen);
	
	public List<Citizen> find_all();
}
