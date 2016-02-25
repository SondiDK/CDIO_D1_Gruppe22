package graenseflade;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


import exception.DALException;
import funktion.IFunktionalitet;

public class Graenseflade {
	private IFunktionalitet f;

	public Graenseflade(IFunktionalitet f){
		this.f = f;
	}


	public void dialog() throws DALException{
		//opretter scanner objekt
		Scanner keybd = new Scanner(System.in);
		//opretter 3 variable, der bliver brugt til scanne ind
		int oprId;
		String pw;
		int choice = 0;

		do{
			System.out.println("Velkommen  \n  Skriv \n 1 =  Opret ny bruger \n 2. Skift password \n 3. Afveje \n 4. Afslutte");
			
			try{
			choice = keybd.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Fejl input, skriv et tal..");
				break;
			}
			
			//swwitch case alt efter hvilket tal brugeren indtaster
			switch(choice){
			//opretter en ny bruger
			case 1:
				System.out.println("Intast dit ID og derefter password.  Intast derefter brugerns navn og Cpr-nummer på ny bruger");
				oprId = keybd.nextInt();
				pw = keybd.next();
				f.newOperator(f.login(oprId, pw),keybd.next(), keybd.next());
				break;
			case 2:
				System.out.println("Intast oprid, gamle password, derefter dit nye to gange");
				f.changePassword(keybd.nextInt(), keybd.next(),keybd.next(), keybd.next());
				break;
			case 3:
				System.out.println("login");
				
				if(f.login(keybd.nextInt(), keybd.next())!=null)
					System.out.println("intast, netto derefter tara");
				System.out.println("tara: " + f.afvejning( keybd.nextInt(), keybd.nextInt()));
				break;
			default:
				System.out.println("Ugyldigt valg");

			}

		}while(choice != 4);
		System.out.println("Farvel");
		keybd.close();
	}
}
