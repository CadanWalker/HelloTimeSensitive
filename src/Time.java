import java.util.Calendar;

//This is the class to get the time from the computer and check it
public class Time {
	
	private Calendar cal1 = Calendar.getInstance(); //The current time.
	private Calendar cal2 = Calendar.getInstance(); //The times that will be checked.
	private int[] times = {17, 12, 00}; //An array that will be loaded into cal2
	private String[] greeting = {"evening.", "afternoon.", "morning."}; //An array of greetings that will be loaded depending on
																		//The result of the if statement		
	public void checkTime() {
		for (int i = 0; i < 3; i++) {
			cal2.set(Calendar.HOUR_OF_DAY, times[i]); //Setting the hour of day to be checked
			cal2.set(Calendar.MINUTE, 00);            //Setting the minutes to 00
			if (cal1.after(cal2)) {                   //Comparing the actual time vs the array times
				System.out.println("Good " + greeting[i]); //Printing the appropriate greeting
				break; //Breaking out of the loop
			}
		}
	}
	
}
