/* Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

// File: Mysql_Delete_By_Name.java
package com.mysql;
import java.sql.*;
import java.util.Properties;

public class Mysql_Delete_By_Name {
    public static void main(String[] args) {
        Connection dbConnection = null;

        try {
            String url = "jdbc:mysql://localhost/Employee";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);
            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database Employee");
            }

            // Delete records where Emp_Name starts with 'S'
            String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE 'S%'";
            PreparedStatement ps = dbConnection.prepareStatement(deleteQuery);
            int deleted = ps.executeUpdate();

            System.out.println("\nDeleted " + deleted + " records where name starts with 'S'.");

            // Generate salary report
            String reportQuery = "SELECT * FROM Emp";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(reportQuery);

            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Salary Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            while (rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String empname = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");

                System.out.println("Emp_No : " + empno);
                System.out.println("Emp_Name: " + empname);
                System.out.println("Basic : " + salary);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            rs.close();
            ps.close();
            dbConnection.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}

//sql
CREATE DATABASE IF NOT EXISTS Employee;
USE Employee;

CREATE TABLE IF NOT EXISTS Emp (
    Emp_NO INTEGER PRIMARY KEY,
    Emp_Name TEXT NOT NULL,
    Basicsalary INTEGER
);
