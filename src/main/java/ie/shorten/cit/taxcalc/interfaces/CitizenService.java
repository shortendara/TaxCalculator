package ie.shorten.cit.taxcalc.interfaces;

import java.util.List;

public interface CitizenService {

	void save(Citizen citiezen);
	
	List<Citizen> find_all();
}
