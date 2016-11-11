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
	private double salary;
	private double exempt_limit;
	private double lower_taxrate;
	private double lower_taxlimit;
	private double higher_taxrate;
	private double solitary_taxrate;
	private double take_home_pay;
	
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
		salary = citizen.get_salary();
		exempt_limit = tax_bands_service.get_exempt_limit();
		lower_taxrate = tax_bands_service.get_lower_taxrate();
		lower_taxlimit = tax_bands_service.get_lower_limit();
		higher_taxrate = tax_bands_service.get_higher_taxrate();
		solitary_taxrate = tax_bands_service.get_solitary_rate();
		take_home_pay = 0;
		double total_deducted = 0;
		
		if(salary <= 10000){
			//Apply solitary rate to people under 10000
			take_home_pay = (salary/100) * solitary_taxrate;
			citizen.set_take_home_pay(take_home_pay);
		}else{
			//Manipulate remaining to calculate tax 
			double remaining = salary;
			//Remove exempt limit from salary
			remaining -= exempt_limit;
			if(remaining < lower_taxlimit){
				//Calculate tax on remaining salary
				total_deducted = (remaining / 100) * lower_taxrate;
			}else{
				//Calculate tax on next band
				total_deducted = (remaining / 100) * lower_taxrate;
				remaining = (remaining - lower_taxlimit);
				//Calculate tax on remaining salary
				total_deducted += (remaining /100) * higher_taxrate;
			}
			//Apply solitary tax rate on salaries over exempt limit
			total_deducted += (salary / 100) * solitary_taxrate;
			citizen.set_take_home_pay(salary - total_deducted);
		}
	}

	@Override
	public List<Citizen> find_all() {
		// TODO Auto-generated method stub
		return citizen_repository.find_all();
	}	
}
