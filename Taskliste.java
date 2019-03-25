import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Taskliste {
	
	private ArrayList<Aufgabe> taskliste;

	public Taskliste () {
		taskliste = new ArrayList<Aufgabe>();
			
	}
	public void addAufgabe(Aufgabe aufgabe) {
		taskliste.add(aufgabe);
	}
	public void deleteAufgabe(int index) {
		taskliste.remove(index);
	}
	public void alleAusgeben() {
		for (Aufgabe aufgabe : taskliste) {
			System.out.println(aufgabe.toString());
		}		
	}
	public void aufgabeSuchen(String suchtext) {
		for ( Aufgabe aufgabe : taskliste) {
			if (aufgabe.aufgabentext.contains(suchtext) ) {				
				System.out.println(aufgabe.toString());
			}
		}
	}
	public void getAufgabeNr(int index) {
		String aufgabe = taskliste.get(index).toString();
		System.out.println(aufgabe);
	}
	public void deadlinesAnzeigen() {
		ArrayList<AufgabeMitDeadline> deadlines = new ArrayList<>();
		// Datum checken
		GregorianCalendar datumAktuell = new GregorianCalendar();
		/* Arraylist mit deadlines befuellen */
		for (Aufgabe aufgabe : taskliste) {
			if (aufgabe instanceof AufgabeMitDeadline) {
				deadlines.add((AufgabeMitDeadline) aufgabe);
			}
		}
		// vergangene
		for (AufgabeMitDeadline aufgabe : deadlines) {
			if (aufgabe.deadline.compareTo(datumAktuell) < 0 ) {
				System.out.println(aufgabe.toString().toUpperCase());
			}
		}
		//heutige
		for (AufgabeMitDeadline aufgabe : deadlines) {
			if (aufgabe.deadline.compareTo(datumAktuell) == 0   ) {
				System.out.println(aufgabe.toString());
			}
		}
		// Zukuenftige
		for (AufgabeMitDeadline aufgabe : deadlines) {
			if (aufgabe.deadline.compareTo(datumAktuell) > 0 ) {
				System.out.println(aufgabe.toString());
			}
		}		
		
	}
}

