import java.text.SimpleDateFormat;
import java.util.Calendar;

//This is the class to get the time from the computer
public class Time {
	
	//This variable stores the time as a string.
	private String time;

	//This method sets the time to the variable 'time' when called.
	public void getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Calendar cal = Calendar.getInstance();
		time = dateFormat.format(cal.getTime());
	}
	
	//This method returns the value stored in the variable 'time' when called.
	public String giveTime() {
		return time;
	}
}
