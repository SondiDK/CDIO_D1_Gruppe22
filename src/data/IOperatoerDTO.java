package data;

import java.util.ArrayList;

public interface IOperatoerDTO {

	public String getOprNavn();	
	public String getIni();
	public String getCpr() ;
	public String getPassword();
	public ArrayList<OperatoerDTO> getOperatoer();
}
