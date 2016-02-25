package funktion;

import data.OperatoerDAO;
import data.OperatoerDTO;
import exception.DALException;

public interface IFunktionalitet {
	public OperatoerDTO login(int OprId, String password) throws DALException;
	public void changePassword(int OprId, String password, String newPass, String newPass2)throws DALException;
	public void newOperator(OperatoerDTO op, String oprNavn, String cpr) throws DALException;
	public int afvejning (int tara, int netto);
	public void test(OperatoerDTO opr);
	public String pwGen();
}
