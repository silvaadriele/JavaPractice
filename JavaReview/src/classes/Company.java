package classes;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private Date startDate;
	private List<Person> employees = new ArrayList<Person>();
	
	
	public List<Person> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}


	public void print() {
		System.out.println("Name: "+name);
		System.out.println("Start date: "+startDate);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void verifyName(String name) {
		if (name.length()<=1)
			System.out.println("Name is not valid");
	}
}


