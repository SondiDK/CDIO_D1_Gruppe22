package data;

import java.util.List;

import exception.DALException;

public interface IOperatoerDAO {
	public OperatoerDTO getOperatoer(int oprId) throws DALException;
	public List<OperatoerDTO> getOperatoerList() throws DALException;
	public void createOperatoer(OperatoerDTO opr) throws DALException;
	public void updateOperatoer(OperatoerDTO opr) throws DALException;
	public void deleteOperatoer(OperatoerDTO opr) throws DALException;

}
