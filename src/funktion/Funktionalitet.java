package funktion;

import java.util.Random;

import data.IOperatoerDAO;
import data.IOperatoerDTO;
import data.OperatoerDTO;
import exception.DALException;

public class Funktionalitet implements IFunktionalitet {

	private IOperatoerDAO d;	


	public Funktionalitet(IOperatoerDAO data) {
		this.d= data;
	}	

	public OperatoerDTO login(int OprId, String password) throws DALException{
		
		for (int j = 0; j < d.getOperatoerList().size(); j++) {


			if(d.getOperatoerList().get(j).getOprId() == OprId && d.getOperatoerList().get(j).getPassword().equals(password)) {
				System.out.println("Velkommen " + d.getOperatoer(OprId).getOprNavn() );
				return d.getOperatoer(OprId);
				
			}
//			else
//				System.out.println("Forkert bruger info");
		}
		return null;
	}

	public void newOperator(OperatoerDTO op, String oprNavn, String cpr) throws DALException{
	
	try{
		if(op.getOprId()==10){
		

			String ini = pwGen();

			OperatoerDTO o = new OperatoerDTO(oprNavn, cpr, ini, ini);

			d.createOperatoer(o);
		
			System.out.println("Bruger oprettet \n" +"Bruger: " + oprNavn +  "\nPassword: " + ini +  " og oprID :" + o.getOprId());
		}
	}
	catch(NullPointerException e){
		
	}


	}

	@Override
	public void changePassword(int OprId, String password, String newPass, String newPass2) throws DALException {

		System.out.println("Indtast id og password");
		if(login(OprId, password)!=null){
			System.out.println("Intast pass twice");
			if(newPass.equals(newPass2)){
				d.getOperatoer(OprId).setPassword(newPass);

				System.out.println(newPass);
			}
		}

	}



	@Override
	public int afvejning(int tara, int netto) {
		
		return tara+netto;

	}

	@Override
	public void test(OperatoerDTO opr) {


	}

	@Override
	public String pwGen() {
		String ini = "";
		Random r = new Random();
		for (int j = 0; j < 6; j++) {
			if(j<2)
				ini += (char) (r.nextInt(26) + 'A');
			if(j>=2 && j<4)
				ini += (char) (r.nextInt(26) + 'a');
			if(j>=4)
				ini += (char) (r.nextInt(10) + '0');
		}
		return ini;
	}

}