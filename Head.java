package assignment4_16RZ28;

public class Head extends Drive{
	/*
	 * This Drive class has the parent class Point, 
	 * and is used to get "Flat head"
	 * part of the information.
	 */
	private static final long serialVersionUID = -3174957190409468687L;
	private String head;
	public Head(String head, String Drive, String point, double priceUnit, int unit)  throws IllegalFastener{
		super(Drive,point,priceUnit,unit);
		setHead(head);
	}//end Head constructor
	
	public void setHead(String head) throws IllegalFastener{
		if (!head.equalsIgnoreCase("Bugle") && !head.equalsIgnoreCase("Flat")&& !head.equalsIgnoreCase("Oval")&& !head.equalsIgnoreCase("Pan") && !head.equalsIgnoreCase("Round")) {
			throw new IllegalFastener("Wrong Head!");
		}else {
			this.head = head;
		}
	}// end setHead mutator
		
	public String toString() {
		return head + " head, " + super.toString();
		}// end toString
}