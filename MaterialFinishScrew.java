package assignment4_16RZ28;

public class MaterialFinishScrew extends Head{
	/*
	 * This MaterialFinishScrew class has the parent Head, 
	 * and is used to get " Steel, with a Zinc finish."
	 * part of the information.
	 */
	private static final long serialVersionUID = 4455030333996672376L;
	private String material;
	private String finish;
	public MaterialFinishScrew(String material, String finish, String head, String Drive, String point, double priceUnit, int unit)  throws IllegalFastener{
		super(head, Drive,point,priceUnit,unit);
		setMaterialFinishFastener(material, finish);
	}//end MaterialFinish constructor
		
	public void setMaterialFinishFastener(String material, String finish) throws IllegalFastener{
		if (!material.equalsIgnoreCase("Brass") && !material.equalsIgnoreCase("Stainless Steel") && !material.equalsIgnoreCase("Steel")) {
			throw new IllegalFastener("Wrong Material!");
		}else {
			this.material = material;
		}
		if (material.equalsIgnoreCase("Brass") || material.equalsIgnoreCase("Stainless Steel")) {
     		if (!finish.equalsIgnoreCase("Plain")) {
	     		throw new IllegalFastener("Wrong Finish!");
	     	}
	     	}else if (material.equalsIgnoreCase("Steel")) {
	     		if (!finish.equals("Chrome")&&!finish.equals("Hot Dipped Galvanized")&&!finish.equals("Plain")&&!finish.equals("Yellow Zinc")&&!finish.equals("Zinc")&&!finish.equals("ACQ 1000 Hour")&&!finish.equals("Black Phosphate")&&!finish.equals("Lubricated")) {
	     			throw new IllegalFastener("Wrong Finish!");
	     		}
	     	}
	     	this.finish = finish;
		}//end setMaterialFinishFastener mutator
		
		public String toString() {
			return material + ", with a " + finish + " finish. " + super.toString();
		}// end to String
}//end MaterialFinishScrew
