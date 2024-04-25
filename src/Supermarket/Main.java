package Supermarket;

import java.util.Scanner;

import Model.Database;
import View.Login;

//Before starting the application, if you want to insert an employee, use the commented code "//----//"

//Employee admin = new Admin(0, "Admin", "0", "admin0@supermarket.com", 
//"000000", "Address 0", 1000, "0000");
//Database database = new Database();
//new CreateEmployee(admin, database);
//}

// * Don't forget to click "Crtl-Shift-O" to import the classes before inserting the employee *

public class Main {

	public static void main(String[] args) {
		
		new Login().oper(null, new Scanner(System.in), new Database());
		
	}
}
