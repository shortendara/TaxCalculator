package ie.shorten.cit.taxcalc.domain;

import ie.shorten.cit.taxcalc.interfaces.Citizen;

public class CitizenImpl implements Citizen {

	private String name;
	private double salary;
	private int id;
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

}
