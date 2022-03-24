package assignment4_16RZ28;

public class LengthBolt extends ThreadB{
	/*
	 * This LengthBolt class has the parent class ThreadB, 
	 * and is used to get "0.75" long,"
	 * part of the information.
	 */
	private static final long serialVersionUID = 4137541451427189643L;
	private double length;
	public LengthBolt(double length, String ThreadB, String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(ThreadB, material,finish, priceUnit,unit);
		setLengthBolt(length);
	}// end LengthBolt constructor
	
	public void setLengthBolt(double length) throws IllegalFastener{
		if (length!= 0.50 && length!= 0.75 && length!=1.0 && length!=1.25 && length!=1.5 && length!=1.75 && length!=2 && length!=2.25 && length!=2.5&& length!=2.75&& length!=3&& length!=3.25&& length!=3.5&& length!=3.75&& length!=4&& length!=4.25&& length!=4.5&& length!=4.75&& length!=5&& length!=5.25&& length!=6&& length!=6.5&& length!=7&& length!=7.5&& length!=8&& length!=8.5&& length!=9&& length!=9.5&& length!=10.0&& length!=10.5&&length!=11&&length!=12&&length!=13&&length!=14&&length!=15&&length!=16&&length!=17&&length!=18&&length!=19&&length!=20) { 
				throw new IllegalFastener("Wrong Length!");
		}else
			this.length = length;
	}// end setLengthBolt mutator

	public String toString() {
		return length + "\" long, " + super.toString();
	}// end to String
}