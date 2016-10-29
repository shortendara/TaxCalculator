package ie.shorten.cit.taxcalc.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class CitizenService {

	private CitizenImpl citizen;
	
	@Autowired
	public CitizenService(CitizenImpl citizen){
		
	}
}
