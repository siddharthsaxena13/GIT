package sg.edu.nus.iss.club.Exception;

public class FacilityExistException extends FacilityException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2787234309165813926L;
	
	public FacilityExistException(){
		super("Facility Already Exist");
	}
	public FacilityExistException(String s){
		super("Facility "+s+" Already Exist");
	}

}
