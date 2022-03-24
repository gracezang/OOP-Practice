package assignment4_16RZ28;

public class InnerThreaded extends ThreadB{
	/*
	 * This InnerThreaded class has the parent class ThreadB
	 * and is used to connect between ThreadB and WingNut to satisfy FastenerOrderSystem
	 */
	private static final long serialVersionUID = 613819211635789387L;
	public InnerThreaded(String ThreadB, String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(ThreadB, material,finish,priceUnit, unit);
	}// end ThreadB constructor
		
	public String toString() {
		return super.toString();
		}//end  toString
}//end InnerThreaded
