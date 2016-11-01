package ie.shorten.cit.taxcalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.shorten.cit.taxcalc.interfaces.*;


@SpringBootApplication
public class TaxCalculatorApplication implements CommandLineRunner{

	@Autowired
	CitizenService citizen_service;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TaxCalculatorApplication.class, args);
		
	}
}
