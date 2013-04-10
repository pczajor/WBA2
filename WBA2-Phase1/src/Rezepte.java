import generated.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class Rezepte {
	
	static final String XML ="Aufgabe3/3a.xml";
	private static Scanner in;
	public static void rezeptListe(ArrayList<RType> list){
		
		int anzahl = 1;
		
		System.out.println("");
		System.out.println("Rezepte");
		System.out.println("");
		
		for(RType item : list){
			System.out.println((anzahl++) + ". " + item.getTitel());
			}
		
	}
	
	public static void rezeptZeigen(RType rezept){
		
		System.out.println("Titel:" + rezept.getTitel() + "\n");
		
		System.out.println("Bilder:");
		List<FType> fotos = rezept.getFotos().getFoto();
		for(FType item : fotos){
			System.out.println(item.getBenutzer() + "\n" + item.getBildadresse()+ "\n");
		}
		
		System.out.println("Zutaten:");
		List<ZType> zutaten =rezept.getZutaten().getZutat();
		for (ZType zutat: zutaten){
			System.out.print(zutat.getName()+": "+zutat.getMenge()+" ");
			if (zutat.getEinheit()!=null)System.out.println(zutat.getEinheit());
		}
		
		System.out.println( "\n"+"Portionen:" + rezept.getPortionen()+ "\n");
		System.out.println("Arbeitszeit:" + rezept.getArbeitszeit());
		System.out.println("Schwierigkeit:" + rezept.getSchwierigkeit());
		System.out.println("Brennwert:" +" "+ rezept.getBrennwert().getWert()+" "+ rezept.getBrennwert().getEinheit()+ "\n");
		System.out.println("Zubereitung:" + rezept.getZubereitung()+ "\n");
		
		System.out.println("Kommentare:");
		 List<KType> kommentare = rezept.getKommentare().getKommentar();
		for (KType item : kommentare){
			System.out.println("\n"+ item.getUser()+" "+item.getDatum());
			if (item.getAvatar()!=null)System.out.println(item.getAvatar().getBildadresse());
			System.out.println(item.getNachricht());
		}
	}
	
	public static void rezeptKommentieren(ArrayList<KType> kListe){
		in = new Scanner(System.in);
		System.out.println("Bitte geben Sie ihren Benutzernamen ein:");
		String Benutzername= in.next();
		in.nextLine();
		System.out.println("Bitte geben Sie ihren Kommentar ein:");
		String komment=in.nextLine();
		
		KType kommi = new KType();
		kommi.setUser(Benutzername);
		
		GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar currGregCal;
        try {
			currGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	        kommi.setDatum(currGregCal);
		} catch (DatatypeConfigurationException e) {}
        kommi.setNachricht(komment);

        kListe.add(kommi);
	}
}
