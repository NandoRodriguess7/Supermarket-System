package Controller;

import java.sql.SQLException;
import java.util.Scanner;

import Model.Database;
import Model.Employee;
import Model.Option;

public class CreateEmployee {
	
	public CreateEmployee(Employee e, Database database) {
		
		String insert = "INSERT INTO `employees`(`FirstName`, `LastName`, `Email`, "
				+ "`PhoneNumber`, `Address`, `Salary`, `Department`, `Password`) "
				+ "VALUES ('"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getEmail()+
				 "','"+e.getPhoneNumber()+"','"+e.getAddress()+"','"+e.getSalary()+"',"
						+ "'"+e.getDepartment()+"','"+e.getPassword()+"');";
		try {
			database.getStatement().executeQuery(insert);
			System.out.println("Employee created sucessfully");
		} catch (SQLException exception){
			exception.printStackTrace();
		}
	}
	
}
