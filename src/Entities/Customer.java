package Entities;
import java.util.Date;

import Abstract.Entitiy;
public class Customer implements Entitiy{
	int id;
	String Firstname;
	String LastName;
	Date DateOfBirth;
	long NationaliyId;
	
	
	
	public Customer(int id, String firstname, String lastName, Date i, long nationaliyId) {
		super();
		this.id = id;
		Firstname = firstname;
		LastName = lastName;
		DateOfBirth = i;
		NationaliyId = nationaliyId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public long getNationaliyId() {
		return NationaliyId;
	}

	public void setNationaliyId(long nationaliyId) {
		NationaliyId = nationaliyId;
	}



}
