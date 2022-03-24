package assignment4_16RZ28;

import java.io.Serializable;
/*
 * This class is the parent class of all classes
 */
public abstract class Fastener implements Serializable{
	
	private static final long serialVersionUID = 7821333395627254247L;
	private double pricePerUnit;
	
	private void setFastener(double pricePerUnit) throws IllegalFastener{
		if (pricePerUnit < 0) {
			throw new IllegalFastener("Wrong Price per Unit! (case<0)");
		}else if(pricePerUnit > 10000) {
			throw new IllegalFastener("Wrong Price per Unit! (case>10000)");
		}else {
			this.pricePerUnit = pricePerUnit;
		}
	}//end setFastener mutator
	
	public Fastener(double pricePerUnit) throws IllegalFastener{
		setFastener(pricePerUnit);
	}//end Fastener constructor
	
	public double getPrice() {
		return pricePerUnit;
	}//end getPrice accessor
	
	// since  this class can not solve getOrderCost, create an abstract  method and let Fastener to solve this problem
	public abstract double getOrderCost(int Unit); 
	
	// toString overrides and refines the toString method 
    // The "@Override" annotation tells the compiler that this is our intention, and then
    // it can check to make sure we have done it properly.
	@Override
	public String toString() {
		return ("$" + pricePerUnit + " per unit.");
	}//end toString
}