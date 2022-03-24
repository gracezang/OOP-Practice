package assignment4_16RZ28;

public class GaugeCommonNail extends MaterialFinishNails{
	
	/*
	 * This GaugeCommonNail class has the parent MaterialFinishNails, 
	 * and is used to get " 9.0 gauge,"
	 * part of the information.
	 */
	private static final long serialVersionUID = -5597853298723357053L;
	private double gauge;
	public GaugeCommonNail(double gauge, String finishN, double priceUnit, int unit)  throws IllegalFastener{
		super(finishN, priceUnit, unit);
		setGaugeCommonNails(gauge);
	}//end GaugeCommonNail constructor
	
	public void setGaugeCommonNails(double gauge) throws IllegalFastener{
		if (gauge != 2.0 && gauge !=8.0 && gauge !=9.0 && gauge !=10.25 && gauge !=11.5) {
			throw new IllegalFastener("Wrong gauge!");
		}else {
			this.gauge = gauge;
		}
	}//end setGaugeCommonNail
		
	public String toString() {
		return gauge + " gauge, " + super.toString();
		}//end toString
}//end GaugeCommonNail