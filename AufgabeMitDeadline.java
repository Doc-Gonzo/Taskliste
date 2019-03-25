import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class AufgabeMitDeadline extends Aufgabe {

	protected GregorianCalendar deadline;
	
	public AufgabeMitDeadline(String aufgabentext, int deadlineYear, int deadlineMonth, int deadlineDay) {
	    super(aufgabentext);
	    this.deadline = new GregorianCalendar(deadlineYear, deadlineMonth - 1, deadlineDay);
		
	}
	@Override
    public GregorianCalendar getDeadline()
    {
        return deadline;
    }
    public void setDeadline(int deadlineYear, int deadlineMonth, int deadlineDay)
    {
        deadline = new GregorianCalendar(deadlineYear, deadlineMonth - 1, deadlineDay);
    }
   
    @Override
    public String toString()
    {
        SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy");
        return super.toString() + "\nDeadline: " + form.format(deadline.getTime());
    }
}
