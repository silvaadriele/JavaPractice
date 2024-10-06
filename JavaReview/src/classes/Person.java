package classes;
import java.util.Date;

public class Person {
	protected String name;
	protected String CPF;
	protected Date birthday;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		CPF = CPF;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
