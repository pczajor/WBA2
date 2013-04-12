import generated.KType;
import generated.ObjectFactory;
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
		;
		String xmlDatei = Rezepte.XML;
		
		 JAXBContext context = JAXBContext.newInstance(RezepteType.class);
		 Unmarshaller u = context.createUnmarshaller();
		 
		 RezepteType rezeptliste = (RezepteType) u.unmarshal(new StreamSource(new File(xmlDatei)), RezepteType.class).getValue();
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
	    
	            System.out.println("[------------------------]");
	    
	            int rezeptauswahl = -1;
	    
	            switch(auswahl) {
	                case 1:
	                	Rezepte.rezeptListe(liste);
	                break;
	                case 2:
	                	do{
	                		System.out.println("Bitte geben Sie eine Rezeptnummer ein.");
	                		rezeptauswahl = in.nextInt();
	                		if(rezeptauswahl <0 || rezeptauswahl>liste.size())
	                			System.out.println("Kein Rezept unter dieser Nummer gefunden.");
	                		else if(rezeptauswahl==0)break;
	                		else Rezepte.rezeptZeigen(liste.get(rezeptauswahl-1));
	                		
	                	
	                	}
	                	while(rezeptauswahl < 0 || rezeptauswahl>liste.size());
	                break;	
	                case 3:
	                	do{
		                	System.out.println("Bitte geben Sie eine Rezeptnummer ein.");
		                	rezeptauswahl = in.nextInt();
		                	if(rezeptauswahl <0 || rezeptauswahl>liste.size())
		                		System.out.println("Kein Rezept unter dieser Nummer gefunden.");
		                	else if(rezeptauswahl==0)break;
		                	else{
		                		ArrayList<KType> kommentarListe = (ArrayList<KType>)liste.get(rezeptauswahl-1).getKommentare().getKommentar();
		                		Rezepte.rezeptKommentieren(kommentarListe);
		                		
		                		Marshaller m = context.createMarshaller();
		                		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		                		m.marshal(new ObjectFactory().createRezepte(rezeptliste), new File(xmlDatei));
		                	}
		                	
		                	}
		                	while(rezeptauswahl < 0 || rezeptauswahl>liste.size());
	                break;	
	                default:
	                    continue;
	            }

	        }
	        while(auswahl != 4);
				 
	}
	
}
