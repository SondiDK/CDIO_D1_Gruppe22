import data.IOperatoerDAO;
import data.IOperatoerDTO;
import data.OperatoerDAO;
import data.OperatoerDTO;
import exception.DALException;
import funktion.Funktionalitet;
import funktion.IFunktionalitet;
import graenseflade.Graenseflade;

public class Main {

	public static void main(String[] args) throws DALException{
IOperatoerDTO d = new OperatoerDTO();	
IOperatoerDAO d2 = new OperatoerDAO(d);	
IFunktionalitet f =  new Funktionalitet(d2);

Graenseflade g = new Graenseflade(f);
g.dialog();
	}
	
}
