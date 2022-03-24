package assignment4_16RZ28;

public class Point extends Unit{
	/*
	 * This Point class has the parent class Unit, 
	 * and is used to get "Sharp point"
	 * part of the information.
	 */
	private static final long serialVersionUID = -6720207652777473429L;
	private String point;
	public Point(String point, double priceUnit, int unit)  throws IllegalFastener{
		super(priceUnit,unit);
		setPoint(point);
	}//end Point constructor
	
	public void setPoint(String point) throws IllegalFastener{
		if (!point.equalsIgnoreCase("Double Cut") && !point.equalsIgnoreCase("Sharp")&& !point.equalsIgnoreCase("Type 17")) {
			throw new IllegalFastener("Wrong Point!");
		}else {
			this.point = point;
		}
	}// end setPoint mutator
		
	public String toString() {
		return point + " point, " + super.toString();
		}// end toString
}//end Point