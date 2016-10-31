package ie.shorten.cit.taxcalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.shorten.cit.taxcalc.domain.CitizenImpl;
import ie.shorten.cit.taxcalc.interfaces.*;

@SpringBootApplication
public class TaxCalculatorApplication {

	@Autowired
	CitizenRepository citizen_repo;
	
	public static void main(String[] args) {
		SpringApplication.run(TaxCalculatorApplication.class, args);
		
	}
	
	public void test_repo(){
		Citizen citizen = citizen_repo.get_citizen(1);
	}
}
