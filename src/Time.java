import java.util.Calendar;

//This is the class to get the time from the computer
public class Time {
	
	private Calendar cal1 = Calendar.getInstance(); //The current time.
	private Calendar cal2 = Calendar.getInstance(); //The times that will be checked.
	private int[] times = {17, 12, 00};
	private String[] greeting = {"evening.", "afternoon.", "morning."};

	public void checkTime() {
		for (int i = 0; i < 3; i++) {
			cal2.set(Calendar.HOUR_OF_DAY, times[i]);
			cal2.set(Calendar.MINUTE, 00);
			if (cal1.after(cal2)) {
				System.out.println("Good " + greeting[i]);
				break;
			}
		}
	}
	
}
