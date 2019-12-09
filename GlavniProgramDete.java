package domaci_11292019;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GlavniProgramDete {

	public static double avgAge(ArrayList<Dete> lista) {
		double result = 0;
		for (int i = 0; i < lista.size(); i++) {
			Dete deteTemp = lista.get(i);
			result = result + deteTemp.getAge();
		}
		result = result / lista.size();

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Dete> deca = new ArrayList<Dete>();

		Dete kid1 = new Dete("Pera", "Peric", 3, 5);
		deca.add(kid1);
		Dete kid2 = new Dete("Mika", "Mikic", 4, 6);
		deca.add(kid2);
		Dete kid3 = new Dete("Zika", "Zikic", 7, 10);
		deca.add(kid3);

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println(df.format(avgAge(deca)));
	}

}
