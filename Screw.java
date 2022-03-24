package assignment4_16RZ28;

public class Screw extends LengthScrew {
	/*
	 * This Screw class has the parent class LengthScrew, 
	 * and is used to connect between WoodScrew class and LengthScrew class.
	 */
	private static final long serialVersionUID = 5181134171240218948L;

	public Screw(double length, String Thread, String material, String finish, String head, String Drive, String point, double priceUnit, int unit)  throws IllegalFastener{
    	super(length, Thread, material,finish, head, Drive,point,priceUnit,unit);
    }// end Screw constructor
    
    public String toString() {
  	  return super.toString();
    }// end toString mutator
}