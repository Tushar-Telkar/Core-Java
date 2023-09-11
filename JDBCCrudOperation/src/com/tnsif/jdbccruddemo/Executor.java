//Program to demonstrate Statement Interface
package com.tnsif.jdbccruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.*;

public class Executor {

	public static void main(String[] args) {
		StatementInterface.showEmp();
		System.out.println("----------------------------------------------");

		System.out.println(StatementInterface.updateEmpName(12, "keerthi"));
		StatementInterface.updateEmpSalary(106, 70000);
		System.out.println("-------------After Updating Name and Salary------------");
		StatementInterface.showEmp();
		StatementInterface.deleteEmp(105);
		StatementInterface.deleteEmp(101);
		StatementInterface.updateEmpName(203, "Nayna");
		System.out.println("-----------After Deleting --------------------");
		StatementInterface.showEmp();
		StatementInterface.addEmployee(1000, "Vampire", 95000);
		StatementInterface.showEmp();

	}

}