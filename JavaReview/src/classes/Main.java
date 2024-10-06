package classes;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Company company1 = new Company();
		System.out.println("Enter the company name");
		Scanner in = new Scanner(System.in);
		company1.setName(in.next());
		company1.setStartDate(new Date());
		
		company1.print();
		
	}
}
