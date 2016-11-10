package ie.shorten.cit.taxcalc.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.shorten.cit.taxcalc.interfaces.*;

@Service
public class CitizenServiceImpl implements CitizenService{

	@Autowired
	CitizenRepository citizen_repository;
	@Autowired
	TaxBandsService tax_bands_service;
	
	public CitizenServiceImpl(CitizenRepository citizen_repository){
		this.citizen_repository = citizen_repository;
	}
	
	@Override
	public void save(Citizen citizen) {
		// TODO Auto-generated method stub
		set_take_home_salary(citizen);
		citizen_repository.save(citizen);
	}
	
	private void set_take_home_salary(Citizen citizen){
		double salary = citizen.get_salary();
		
	}

	@Override
	public List<Citizen> find_all() {
		// TODO Auto-generated method stub
		return citizen_repository.find_all();
	}	
}
