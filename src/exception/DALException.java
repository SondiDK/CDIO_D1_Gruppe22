package exception;

public class DALException extends Exception {


	private static final long serialVersionUID = 1L;
	
	public DALException(){
		
	}
	
	public DALException(String meddelelse){
		super(meddelelse);
	}
	
}
