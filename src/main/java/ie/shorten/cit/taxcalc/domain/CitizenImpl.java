package ie.shorten.cit.taxcalc.domain;

import ie.shorten.cit.taxcalc.interfaces.Citizen;
import ie.shorten.cit.taxcalc.interfaces.TaxBands;

public class CitizenImpl implements Citizen {

	private String name;
	private double salary;
	private double take_home_pay;
	private int id;
	
	public CitizenImpl(){
		
	}
	
	public CitizenImpl(String name, double salary){
		set_name(name);
		set_salary(salary);
		//Citizen id automatically set to 0 for each new citizen database increments the id number
		set_id(0);
	}
	@Override
	public void set_name(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String get_name() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public void set_salary(double salary) {
		// TODO Auto-generated method stub
		calculate_take_home_pay(salary);
		this.salary = salary;
	}

	private void calculate_take_home_pay(double salary) {
		// TODO Auto-generated method stub
		TaxBands tax_bands = new TaxBandsImpl();
		double exempt_limit = tax_bands.get_exempt_limit();
		double lower_limit = tax_bands.get_lower_limit();
		double lower_rate = tax_bands.get_lower_rate();
		double higher_rate = tax_bands.get_higher_rate();
		double solitary_rate = tax_bands.get_solitary_rate();
		System.out.println(lower_limit);
	}

	@Override
	public double get_salary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void set_id(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public int get_id() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void set_take_home_pay(double take_home_pay) {
		// TODO Auto-generated method stub
		this.take_home_pay = take_home_pay;
	}

	@Override
	public double get_take_home_pay() {
		// TODO Auto-generated method stub
		return take_home_pay;
	}

}
