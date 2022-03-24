package assignment4_16RZ28;

public class MaterialFinishNails extends Unit{
	/*
	 * This MaterialFinishNails class has the parent Unit, 
	 * and is used to get " Steel, with a Bright finish."
	 * part of the information.
	 */
	private static final long serialVersionUID = -8695434176462949564L;
	private String finishN;
	public MaterialFinishNails(String finishN, double priceUnit, int unit) throws IllegalFastener{
		super( priceUnit, unit);
		setMaterialFinishNails(finishN);
	}// end MaterialFinishNails constructor
		
	public void setMaterialFinishNails(String finishN) throws IllegalFastener{
     	if (!finishN.equalsIgnoreCase("Bright")&&!finishN.equalsIgnoreCase("Hot Dipped Galvanized")) {
	     	throw new IllegalFastener("Wrong Finish!");
	    }else {
	     	this.finishN = finishN;
		}
	}//end setMaterialFinishNails mutator
		
		public String toString() {
			return  "Steel, with a " + finishN + " finish. " + super.toString();
		}// end toString

}