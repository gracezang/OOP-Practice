package assignment4_16RZ28;

public class ThreadB extends MaterialFinishFastener{
	/*
	 * This ThreadB class has the parent class MaterialFinishFastener 
	 * and is used to get "1/4-20 thread,"
	 * part of the information.
	 */
	private static final long serialVersionUID = 3251445363907773829L;
	private String ThreadB;
	public ThreadB(String ThreadB, String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(material,finish,priceUnit, unit);
		setThreadB(ThreadB);
	}// end ThreadB constructor
	
	public void setThreadB(String ThreadB) throws IllegalFastener{
		if (!ThreadB.equalsIgnoreCase("#8-13") && !ThreadB.equalsIgnoreCase("#8-15") && !ThreadB.equalsIgnoreCase("#8-32")&& !ThreadB.equalsIgnoreCase("#10-13")&& !ThreadB.equalsIgnoreCase("#10-24")&& !ThreadB.equalsIgnoreCase("#10-32")&& !ThreadB.equalsIgnoreCase("1/4-20")&& !ThreadB.equalsIgnoreCase("5/16-18")&& !ThreadB.equalsIgnoreCase("3/8-16")&& !ThreadB.equalsIgnoreCase("7/16-14")&& !ThreadB.equalsIgnoreCase("1/2-13")&& !ThreadB.equalsIgnoreCase("5/8-11")&& !ThreadB.equalsIgnoreCase("3/4-10")) {
			throw new IllegalFastener("Wrong Thread!");
		}else {
			this.ThreadB = ThreadB;
		}
	}// end setThreadB mutator
		
	public String toString() {
		return ThreadB +" thread, "+ super.toString();
		}// end toString method
}// end ThreadB class