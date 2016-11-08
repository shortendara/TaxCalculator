package ie.shorten.cit.taxcalc.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.shorten.cit.taxcalc.interfaces.*;

@Service
public class CitizenServiceImpl implements CitizenService{

	@Autowired
	CitizenRepository citizen_repository;
	public CitizenServiceImpl(CitizenRepository citizen_repository){
		this.citizen_repository = citizen_repository;
	}
	
	@Override
	public void save(Citizen citizen) {
		// TODO Auto-generated method stub
		citizen_repository.save(citizen);
	}

	@Override
	public List<Citizen> find_all() {
		// TODO Auto-generated method stub
		return citizen_repository.find_all();
	}

	
}
