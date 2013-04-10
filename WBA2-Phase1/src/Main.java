import generated.RType;
import generated.RezepteType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;


public class Main {
	
	private static Scanner in;
	

	public static void main(String[] args)  throws JAXBException, IOException  {
		
		in = new Scanner(System.in);
		int auswahl;
		
		
		String xmlDatei = Rezepte.XML;
		
		 JAXBContext context = JAXBContext.newInstance(RType.class);
		 Unmarshaller u = context.createUnmarshaller();
		 
		 RezepteType rezeptliste = (RezepteType) u.unmarshal(new FileReader(xmlDatei));
		 ArrayList<RType> liste = (ArrayList<RType>) rezeptliste.getRezept();
		 
		 if(liste.isEmpty()){
			 System.out.println("Keine Rezepte gefunden!!!");
			 System.exit(1);
			 		
		 }
		 
		 do {
	            System.out.println();
	            System.out.println("[---- Rezeptsammlung ----]");
	            System.out.println();
	            System.out.println("1. Auflistung der Rezeptnamen");
	            System.out.println("2. Auflistung eines Rezepts");
	            System.out.println("3. Rezept kommentieren");
	            System.out.println("4. Programm beenden");
	            System.out.println();
	            System.out.println("Ihre Auswahl: ");

	            auswahl = in.nextInt();
	    
	            System.out.println();
	    
	            int rezeptauswahl = -1;
	    
	            switch(auswahl) {
	                case 1:
	                	Rezepte.rezeptListe(liste);
	                break;
	                default:
	                    continue;
	            }

	        }
	        while(auswahl != 4);
				 
	}
	
}
