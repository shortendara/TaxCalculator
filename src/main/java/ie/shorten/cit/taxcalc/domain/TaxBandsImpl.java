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
		this.exempt_limit = exempt_limit;
	}
	
	@Override
	public double get_exempt_limit() {
		// TODO Auto-generated method stub
		return exempt_limit;
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
