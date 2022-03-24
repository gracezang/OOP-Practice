package assignment4_16RZ28;

public class Drive extends Point{
	/*
	 * This Drive class has the parent class Point, 
	 * and is used to get "Square drive"
	 * part of the information.
	 */
	private static final long serialVersionUID = -8101414795142401340L;
	private String Drive;
	public Drive(String Drive, String point, double priceUnit, int unit) throws IllegalFastener{
		super (point, priceUnit, unit); 
		setDrive(Drive);
	}//end Drive
	
	public void setDrive(String Drive) throws IllegalFastener{
		if (!Drive.equalsIgnoreCase("6-Lobe") && !Drive.equalsIgnoreCase("Philips")&& !Drive.equalsIgnoreCase("Slotted")&& !Drive.equalsIgnoreCase("Square")) {
			throw new IllegalFastener("Wrong Drive!");
		}else {
			this.Drive = Drive;
		}
	}//end setDrive
		
	public String toString() {
		return Drive + " drive, " + super.toString();
		}//end toString
}