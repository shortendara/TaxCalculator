package ie.shorten.cit.taxcalc.domain;

import ie.shorten.cit.taxcalc.interfaces.Citizen;

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
		set_take_home_pay(salary);
		this.salary = salary;
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
	public void set_take_home_pay(double salary) {
		// TODO Auto-generated method stub
		double remaining_pay = salary;
		double tax_deducted = 0;
		if(salary <= 10000){
			//For salary below 10000 apply solidarity tax
			take_home_pay = (salary * 0.97);
		}else{
			//First 10000 exempt from tax
			remaining_pay = (remaining_pay - 10000);
			//Calculate tax deducted on pay less then 25000
			if(remaining_pay <= 15000){
				//Calculate salary @20% tax
				remaining_pay = (remaining_pay * 0.8);
				//Calculate solidarity tax
				tax_deducted = (salary * 0.03);
				take_home_pay = (remaining_pay - tax_deducted);
			}else{
				
			}
		}
	}

	@Override
	public double get_take_home_pay() {
		// TODO Auto-generated method stub
		return take_home_pay;
	}

}
