package ie.shorten.cit.taxcalc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ie.shorten.cit.taxcalc.domain.CitizenImpl;
import ie.shorten.cit.taxcalc.interfaces.*;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TaxCalculatorApplication implements CommandLineRunner{

	@Autowired
	CitizenService citizen_service;
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
		double salary = 0.0;
		Citizen citizen = new CitizenImpl(name, salary);
		
		//Use service class to add citizen to database
		citizen_service.save(citizen);
	}
	
	public void change_rates(){
		System.out.print("1.  List all tax rates");
		System.out.print("1.  List all tax rates");
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
