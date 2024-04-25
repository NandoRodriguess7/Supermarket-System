package Model;

import java.util.Scanner;

public class Cashier extends Employee{
	
	public Cashier() {
		this.options = new Option[] {};
	}
	
	public Cashier(int iD, String firstName, String lastName, String email,
			String phoneNumber, String address, double salary, String password) {
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.password = password;
		this.options = new Option[] {};
	}

	@Override
	public int getDepartment() {
		return 1;
	}

	@Override
	public void showList(Scanner s, Database database) {
		System.out.println("Cashier List");
	}
	
}
