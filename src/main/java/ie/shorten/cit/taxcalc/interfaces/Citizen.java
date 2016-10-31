package ie.shorten.cit.taxcalc.interfaces;

public interface Citizen {
	
	public void set_name(String name);
	
	public String get_name();

	public void set_id(int id);
	
	public int get_id();
	
	public void set_salary(double salary);
	
	public double get_salary();
}
