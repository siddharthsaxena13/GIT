package sg.edu.nus.iss.club.Exception;

public class FacilityException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6752783455026334456L;
	
	public FacilityException(){
		super("Facility Exception");
	}
	
	public FacilityException(String s){
		super("Facility Exception:"+s);
	}

}
