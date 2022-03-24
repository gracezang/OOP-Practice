package assignment4_16RZ28;

public class Thread extends MaterialFinishScrew{
	/*
	 * This Thread class has the parent class MaterialFinishScrew, 
	 * and is used to get " #8-15 thread,"
	 * part of the information.
	 */
	private static final long serialVersionUID = -1135314428127729312L;
	private String Thread;
	public Thread(String Thread, String material, String finish, String head, String Drive, String point, double priceUnit, int unit)  throws IllegalFastener{
		super(material, finish, head, Drive ,point,priceUnit,unit);
		setThread(Thread);
	}//end Thread constructor
	
	public void setThread(String Thread) throws IllegalFastener{
		if (!Thread.equalsIgnoreCase("#8-13") && !Thread.equalsIgnoreCase("#8-15") && !Thread.equalsIgnoreCase("#8-32")&& !Thread.equalsIgnoreCase("#10-13")&& !Thread.equalsIgnoreCase("#10-24")&& !Thread.equalsIgnoreCase("#10-32")&& !Thread.equalsIgnoreCase("1/4-20")&& !Thread.equalsIgnoreCase("5/16-18")&& !Thread.equalsIgnoreCase("3/8-16")&& !Thread.equalsIgnoreCase("7/16-14")&& !Thread.equalsIgnoreCase("1/2-13")&& !Thread.equalsIgnoreCase("5/8-11")&& !Thread.equalsIgnoreCase("3/4-10")) {
			throw new IllegalFastener("Wrong Thread!");
		}else {
			this.Thread = Thread;
		}
	}// end setThread mutator
		
	public String toString() {
		return Thread +" thread, "+ super.toString();
		}// end toString
}//end Thread