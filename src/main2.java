import java.util.Random;

public class main2 {

	public static void main(String[] args) {
		
		String ini = "";
		Random r = new Random();
		for (int j = 0; j < 6; j++) {
			if(j<2)
				ini += (char) (r.nextInt(26) + 'A');
			if(j>=2 && j<4)
				ini += (char) (r.nextInt(26) + 'a');
			if(j>=4)
				ini += (char) (r.nextInt(10) + '0');

			System.out.println(ini);
		}


	}

}
