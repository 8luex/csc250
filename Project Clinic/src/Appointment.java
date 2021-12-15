import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment implements Serializable
{
	private Date dateTime;
	private String objective;

	public Appointment(Date date, String DetailString){
		dateTime = date;
		objective = DetailString;
	}
	public String appointmentDetail(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateformat = formatter.format(dateTime);
		String formatStr = "Date: %s \nObjective: %s";
		String info = String.format(formatStr, dateformat, objective);

		return info;
	}

	public void setDateTime(Date dateTime){
		this.dateTime = dateTime;
	}
	public void setObjective(String objective){
		this.objective = objective;
	}

	public Date getDataTime(){return this.dateTime;}
	public String objective(){return this.objective;}
}
