import generated.RType;

import java.util.ArrayList;


public class Rezepte {
	
	static final String XML ="./Aufgabe3/3a.xml";
	
	public static void rezeptListe(ArrayList<RType> list){
		
		int anzahl = 1;
		
		System.out.println("");
		System.out.println("Rezepte");
		System.out.println("");
		
		for(RType item : list){
			System.out.println((anzahl++) + "" + item.getTitel());
			}
		
	}
}
