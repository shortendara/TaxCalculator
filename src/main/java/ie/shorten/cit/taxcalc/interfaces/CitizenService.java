package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface CitizenService {

	void save(Citizen citiezen);
	
	Citizen get(int id);
	
	void remove(Citizen citizen);
	
	List<Citizen> find_all();
}
