import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Aufgabe {
	protected String aufgabentext;
	protected GregorianCalendar datumErstellung;
	
	
	
	public Aufgabe(String aufgabentext ) {
		this.aufgabentext = aufgabentext;
		datumErstellung = new GregorianCalendar();
	}

	public String getAufgabentext() {
		return aufgabentext;
	}

	public void setAufgabentext(String aufgabentext) {
		this.aufgabentext = aufgabentext;
	}

	public GregorianCalendar getDatumErstellung() {
		return datumErstellung;
	}

	public void setDatumErstellung(GregorianCalendar datumErstellung) {
		this.datumErstellung = datumErstellung;
	}
    public GregorianCalendar getDeadline()
    {
        return null;
    }
	public String toString() {
	       SimpleDateFormat formatierer = new SimpleDateFormat("dd.MM.yyyy");
	        return aufgabentext + "\nErstellungsdatum: " + formatierer.format(datumErstellung.getTime());
	}
}