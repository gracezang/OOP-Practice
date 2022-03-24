package assignment4_16RZ28;

public class LengthScrew extends Thread{
	/*
	 * This LengthScrew class has the parent class Thread, 
	 * and is used to get " 0.75" long,"
	 * part of the information.
	 */
	private static final long serialVersionUID = -5879322793877310669L;
	private double length;
	public LengthScrew(double length, String Thread, String material, String finish, String head, String Drive, String point, double priceUnit, int unit)  throws IllegalFastener{
		super(Thread, material,finish, head, Drive,point,priceUnit,unit);
		setLengthScrew(length);
	}//end LengthScrew constructor
	
	public void setLengthScrew(double length) throws IllegalFastener{
		if (length!= 0.50 && length!= 0.75 && length!=1.0 && length!=1.25 && length!=1.5 && length!=1.75 && length!=2 && length!=2.25 && length!=2.5&& length!=2.75&& length!=3&& length!=3.25&& length!=3.5&& length!=3.75&& length!=4&& length!=4.25&& length!=4.5&& length!=4.75&& length!=5&& length!=5.25&& length!=6&& length!=6.5&& length!=7&& length!=7.5&& length!=8&& length!=8.5&& length!=9&& length!=9.5&& length!=10.0&& length!=10.5&&length!=11&&length!=12&&length!=13&&length!=14&&length!=15&&length!=16&&length!=17&&length!=18&&length!=19&&length!=20) { 
			throw new IllegalFastener("Wrong Length!");
		}else
			this.length = length;
	}//end setLengthScrew mutator

	public String toString() {
		return length + "\" long, " + super.toString();
	}// end toString
}