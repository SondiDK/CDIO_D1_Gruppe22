package data;

import java.util.ArrayList;
import java.util.List;

import exception.DALException;

public class OperatoerDTO implements IOperatoerDTO  {


	private static int 	oprIdCounter= 10;
	private int oprId;
	private String oprNavn;                
	private String ini;                 
	private String cpr;                 
	private String password;	


	public OperatoerDTO(String oprNavn,  String cpr, String ini, String password ) {

		this.oprId = oprIdCounter;
		this.oprNavn = oprNavn;
		this.cpr = cpr;
		this.ini = ini;
		this.password =  password;														
		oprIdCounter++;
	}
	private ArrayList<OperatoerDTO> operatoer;

	public OperatoerDTO(){
		operatoer = new ArrayList<OperatoerDTO>();

		operatoer.add(new OperatoerDTO("sysadmin","yep", "2","Abc02324"));
	}

	public int getOprId() {
		return oprId;
	}

	public String getOprNavn() {
		return oprNavn;
	}

	public String getIni() {
		return ini;
	}

	public String getCpr() {
		return cpr;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public ArrayList<OperatoerDTO> getOperatoer() {
		return operatoer;
	}

}
