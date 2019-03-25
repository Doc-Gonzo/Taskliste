public class App {

	
	// Für das Kommandozeilenmenue reichte die Zeit leider nicht aus
	public static void main(String[] args) {
		// Liste erstellen
		Taskliste liste = new Taskliste();
		// Aufgaben erstellen
		Aufgabe aufgabe1 = new Aufgabe("Ich bin eine Aufgabe");
		Aufgabe aufgabe2 = new Aufgabe("Ich auch");
		Aufgabe aufgabe3 = new Aufgabe("Ich bin keine Aufgabe");
		// Auch welche mit Deadline
		Aufgabe aufgabe4 = new AufgabeMitDeadline("Ich bin eine Aufgabe mit Deadline",2019,3,30);		
		Aufgabe aufgabe5 = new AufgabeMitDeadline("Ich bin eine abgelaufene Aufgabe",2019,3,23);
		// Aufgaben hinzufuegen
		liste.addAufgabe(aufgabe1);
		liste.addAufgabe(aufgabe2);
		liste.addAufgabe(aufgabe3);	
		liste.addAufgabe(aufgabe4);	
		liste.addAufgabe(aufgabe5);			
		
		// Test alle ausgeben
		liste.alleAusgeben();
		System.out.println("\n Aufgabe suchen mit dem wort keine: : \n ");
		liste.aufgabeSuchen("keine");
		System.out.println("\n Aufgabe index 1 ausgeben: : \n ");		
		liste.getAufgabeNr(1);
		System.out.println("\n Aufgabe index 2 geloescht: : \n ");
		liste.deleteAufgabe(2);
		System.out.println("\n Alle verblieben Aufgaben: \n ");
		liste.alleAusgeben();
		System.out.println("\n Aufgaben mit Deadline: \n ");
		liste.deadlinesAnzeigen();

	}

}
