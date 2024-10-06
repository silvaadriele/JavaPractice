package challenges;
import java.util.Scanner;
//receive the age in days and convert to years, months and days.
public class AgeConversion {
	public static String convert(int age) {
		int years, months, days, cont;
		years = age / 365;
		cont = age % 365;
		months = cont / 30;
		days = months % 30;
		return String.format("%s years, %s months, %s days.", years, months, days);
	}
	
	public static void main (String[] args) {
		System.out.println("Please enter the age in days");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		System.out.println("Your age is: "+ convert(age));
		
	}
}
