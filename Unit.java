package assignment4_16RZ28;

public class Unit extends Fastener {
	/*
	 * This Unit class has the parent class Fastener, and is used to get "50 in a unit, $18.825 per unit."
	 * part of the information.
	 */
	private static final long serialVersionUID = -3658389080924682896L;
	private double unit;
	
	   private void setUnit(int unit) throws IllegalFastener {
		  	  if (unit < 0) {
		  		  throw new IllegalFastener("Wrong Unit! (unit<0)");
		  	  }else if(unit > 10000) {
		  		  throw new IllegalFastener("Wrong Unit! (unit>10000)");
		  	  }else {
		  		  this.unit = unit;
		  	  }
		    }//mutator
	
    public Unit(double pricePerUnit, int unit)  throws IllegalFastener{
  	  super(pricePerUnit);
  	  setUnit(unit);
    }//constructor
    
    
    public double getOrderCost(int unit) {
  	  return super.getPrice() * unit;
    }//accessor
    
    // toString overrides and refines the toString method of the parent class, Fastener
    public String toString() {
  	  return unit + " in a unit, " + super.toString();
    }// end toString 
}//end Unit class

