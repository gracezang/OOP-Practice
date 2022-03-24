package assignment4_16RZ28;

public class IllegalFastener extends Exception {

	private static final long serialVersionUID = -5017573938042748548L;

	public IllegalFastener() {
		super("Illegal parameter value supplied to Fastener");
	}

	/**
	 * exception class constructor
	 * @param message A more specific message.
	 */
	public IllegalFastener(String message) {
		super(message);
	}

} // end IllegalFastener

                                   