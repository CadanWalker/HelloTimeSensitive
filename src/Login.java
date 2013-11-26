import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
	 
		final String USERNAME = "username";
		final String PASSWORD = "password";
		 
		System.out.println("Please input a username");
		Scanner sc = new Scanner(System.in);
		String inputuser = sc.next();
		inputuser = inputuser.toLowerCase();
		 
		System.out.println("Please input a password");
		String inputpass = sc.next();
		inputpass = inputpass.toLowerCase();
		sc.close();
		 
		if (inputuser.equals(USERNAME) && inputpass.equals(PASSWORD)) {
			System.out.println("Logging in");
			Time clock1 = new Time();
			clock1.checkTime();
		}
		else {
			System.out.println("incorrect username and password");
		}
	}
}