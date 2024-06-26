package Model;

import java.util.Scanner;

public abstract class Employee {
	
	protected int ID;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String phoneNumber;
	protected String address;
	protected double salary;
	protected String password;
	protected Option[] options;
	
	public Employee() {
		
	}

	public Employee(int iD, String firstName, String lastName, String email,
			String phoneNumber, String address, double salary, String password) {
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public abstract int getDepartment();
	// 0 ==> Admin
	// 1 ==> Cashier
	// 2 ==> Storekeeper
	
	public abstract void showList(Scanner s, Database database);
}
