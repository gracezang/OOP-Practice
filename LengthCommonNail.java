package assignment4_16RZ28;

public class LengthCommonNail extends GaugeCommonNail{
	/*
	 * This LengthCommonNail class has the parent GaugeCommonNail, 
	 * and is used to get " 3.0" long,"
	 * part of the information.
	 */
	private static final long serialVersionUID = -1179951853317640607L;
	private double lengthN;
	public LengthCommonNail(double lengthN, double gauge, String finishN, double priceUnit, int unit)  throws IllegalFastener{
		super(gauge,finishN, priceUnit, unit);
		setLengthCommonNail(lengthN);
	}// end LengthCommonNail constructor
	public void setLengthCommonNail(double lengthN) throws IllegalFastener{
		if (lengthN != 2.0 && lengthN !=2.5 && lengthN !=3.0 && lengthN !=3.25 && lengthN !=3.5&& lengthN !=6.0) {
			throw new IllegalFastener("Wrong length!");
		}else {
			this.lengthN = lengthN;
		}
	}// end setLengthCommonNail mutator

	public String toString() {
		return lengthN + "\" long, " + super.toString();
	}// end toString
}
