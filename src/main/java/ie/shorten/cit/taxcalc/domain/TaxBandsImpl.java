package ie.shorten.cit.taxcalc.domain;

import ie.shorten.cit.taxcalc.interfaces.TaxBands;

public class TaxBandsImpl implements TaxBands {

	private double exempt_limit;
	private double lower_limit;
	private double lower_rate;
	private double middle_limit;
	private double middle_rate;
	private double higher_rate;
	private double solitary_rate;
	
	@Override
	public void set_exempt_limit(double exempt_limit) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double get_exempt_limit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set_lower_limit(double lower_limit) {
		// TODO Auto-generated method stub
		this.lower_limit = lower_limit;
	}
	
	@Override
	public double get_lower_limit() {
		// TODO Auto-generated method stub
		return lower_limit;
	}
	
	@Override
	public void set_lower_rate(double lower_rate) {
		// TODO Auto-generated method stub
		this.lower_rate = lower_rate;
	}

	@Override
	public double get_lower_rate() {
		// TODO Auto-generated method stub
		return lower_rate;
	}

	@Override
	public void set_middle_limit(double middle_limit) {
		// TODO Auto-generated method stub
		this.middle_limit = middle_limit;
	}

	@Override
	public double get_middle_limit() {
		// TODO Auto-generated method stub
		return middle_limit;
	}
	
	@Override
	public void set_middle_rate(double middle_rate) {
		// TODO Auto-generated method stub
		this.middle_rate = middle_rate;
	}

	@Override
	public double get_middle_rate() {
		// TODO Auto-generated method stub
		return middle_rate;
	}

	@Override
	public void set_higher_rate(double higher_rate) {
		// TODO Auto-generated method stub
		this.higher_rate = higher_rate;
	}

	@Override
	public double get_higher_rate() {
		// TODO Auto-generated method stub
		return higher_rate;
	}

	@Override
	public void set_soloitary_rate(double solitary_rate) {
		// TODO Auto-generated method stub
		this.solitary_rate = solitary_rate;
	}

	@Override
	public double get_solitary_rate() {
		// TODO Auto-generated method stub
		return solitary_rate;
	}
}
