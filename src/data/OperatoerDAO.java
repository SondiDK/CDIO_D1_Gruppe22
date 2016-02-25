package data;

import java.util.List;

import exception.DALException;

public class OperatoerDAO implements IOperatoerDAO {
private IOperatoerDTO d;


	public OperatoerDAO(IOperatoerDTO data) {
		this.d= data;
	}	
	
	
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		int i =0;
		try{
		while( true){
			if (d.getOperatoer().get(i).getOprId() == (oprId))
				return d.getOperatoer().get(i);
			i++;
		}
		
			
		}
		catch(IndexOutOfBoundsException e){
			
			throw new DALException("Findes ikke");
			
		}
		
		
		
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		
		return d.getOperatoer();
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		d.getOperatoer().add(opr);
		
	}
		

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
	
	
	}

	@Override
	public void deleteOperatoer(OperatoerDTO opr) throws DALException {
	d.getOperatoer().remove(opr);

	}


	

}
