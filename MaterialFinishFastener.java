package assignment4_16RZ28;

public class MaterialFinishFastener extends Unit{
	/*
	 * This MaterialFinishFastener class has the parent class Unit, 
	 * and is used to get "Stainless Steel, with a Plain finish."
	 * part of the information.
	 */
	private static final long serialVersionUID = 1976190955543316165L;
	private String material;
	private String finish;
	public MaterialFinishFastener(String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(priceUnit, unit);
		setMaterialFinishFastener(finish, material);
	}// end MaterialFinishFastener constructor
	
	public void setMaterialFinishFastener(String finish, String material) throws IllegalFastener{
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
	     		if (!finish.equals("Chrome")&&!finish.equals("Hot Dipped Galvanized")&&!finish.equals("Plain")&&!finish.equals("Yellow Zinc")&&!finish.equals("Zinc")&&!finish.equals("ACQ 1000 Hour")) {
	     			throw new IllegalFastener("Wrong Finish!");
	     		}
	     	}
	     	this.finish = finish;
		}// end setMaterialFinishFastener mutator
		
		public String toString() {
			return material + ", with a " + finish + " finish. " + super.toString();
		}// end to String

}
	

