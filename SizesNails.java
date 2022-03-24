package assignment4_16RZ28;

public class SizesNails extends LengthCommonNail{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6149147616240580754L;
	private String sizes;
	public SizesNails(String sizes, double lengthN, double gauge, String finishN, double priceUnit, int unit)  throws IllegalFastener{
		super(lengthN, gauge, finishN, priceUnit, unit);
		setSizesNails(sizes);
	}//end SizesNails constructor
	
	public void setSizesNails(String sizes) throws IllegalFastener{
		if (!sizes.equalsIgnoreCase("6D") && !sizes.equalsIgnoreCase("8D") && !sizes.equalsIgnoreCase("10D")&& !sizes.equalsIgnoreCase("12D")&& !sizes.equalsIgnoreCase("16D")&& !sizes.equalsIgnoreCase("60D")) {
			throw new IllegalFastener("Wrong size!");
		}else {
			this.sizes = sizes;
		}
	}// end setSizesNails mutator
		
	public String toString() {
		return sizes + " size, " + super.toString();
		}// end toString
}