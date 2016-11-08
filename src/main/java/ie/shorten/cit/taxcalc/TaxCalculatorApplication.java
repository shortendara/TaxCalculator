package ie.shorten.cit.taxcalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.shorten.cit.taxcalc.domain.CitizenImpl;
import ie.shorten.cit.taxcalc.domain.TaxBandsImpl;
import ie.shorten.cit.taxcalc.interfaces.*;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TaxCalculatorApplication implements CommandLineRunner{

	@Autowired
	CitizenService citizen_service;
	
	@Autowired
	TaxBandsService tax_bands_service;
	
	Scanner kb;
	public void list_all_citizens(){
		List<Citizen> citizen_list = citizen_service.find_all();
		System.out.println("Name:		Salary:        Take home pay:");
		for(Citizen citizen : citizen_list){
			System.out.println(citizen.get_name()  + "    " + citizen.get_salary() + "\n");
		}
	}
	
	public void add_citizen(){
		System.out.println("Enter Citizen name: ");
		String name = kb.next();
		System.out.println("Enter citizen salary: ");
		double salary = kb.nextDouble();
		Citizen citizen = new CitizenImpl(name, salary);
		
		//Use service class to add citizen to database
		citizen_service.save(citizen);
	}
	
	public void change_rates(){
		TaxBands tax_bands = new TaxBandsImpl();
		
		System.out.println("1.  List all tax rates");
		System.out.println("2.  Change exempt limit");
		System.out.println("3.  Change lower tax rate");
		System.out.println("4.  Change lower limit");
		System.out.println("5.  Change higher tax rate");
		System.out.println("6.  Change solitory tax rate");
		int choice = kb.nextInt();
		switch(choice){
			case 1:
				//Print out all tax related rates
				List<TaxBands> list_tax_bands = tax_bands_service.list_all();
				for(TaxBands tax_band : list_tax_bands){
					System.out.println("Exempt limit: " + tax_band.get_exempt_limit());
					System.out.println("Lower limit: " + tax_band.get_lower_limit());
					System.out.println("Lower tax rate: " + tax_band.get_lower_rate());
					System.out.println("Higher tax rate: " + tax_band.get_higher_rate());
					System.out.println("Solitary tax rate: " + tax_band.get_solitary_rate());
				}
				break;
			
			case 2:
				System.out.println("Enter new tax exempt limit: ");
				double exempt_limit = kb.nextDouble();
				tax_bands.set_exempt_limit(exempt_limit);
				tax_bands_service.update_exempt_limit(tax_bands);
				break;
			
			case 3:
				System.out.println("Enter new lower tax rate:");
				double tax_rate = kb.nextDouble();
				tax_bands.set_lower_rate(tax_rate);
				tax_bands_service.update_lower_tax_rate(tax_bands);
				break;
				
			case 4:
				System.out.println("Enter new lower limit:");
				double lower_limit = kb.nextDouble();
				tax_bands.set_lower_limit(lower_limit);
				tax_bands_service.update_lower_limit(tax_bands);
				break;
			
			case 5:
				System.out.println("Enter new higher tax rate:");
				double higher_tax_rate = kb.nextDouble();
				tax_bands.set_higher_rate(higher_tax_rate);
				tax_bands_service.update_higher_tax_rate(tax_bands);
				break;
				
			case 6:
				System.out.println("Enter new solitary tax rate:");
				double solitary_tax_rate = kb.nextDouble();
				tax_bands.set_soloitary_rate(solitary_tax_rate);
				tax_bands_service.update_solitary_tax_rate(tax_bands);
				break;
		}
	}
	
	public void menu(){
		while(true){
			System.out.println("Enter Number for coropsonding choice:");
			System.out.println("1.  List Citizens and take home pay");
			System.out.println("2.  Enter new citizen");
			System.out.println("3.  Change tax bands rates");
			System.out.println("4.  Exit");
			int choice = kb.nextInt();
			switch(choice){
				case 1:
					//List all citizens and their pay
					list_all_citizens();
					break;
				case 2:
					//Enter a new citizen
					add_citizen();
					break;
				case 3:
					//Change tax rates
					change_rates();
					break;
				case 4:
					//Exit
					System.exit(0);
			}
		}
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
		menu();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TaxCalculatorApplication.class, args);
		
	}
}
