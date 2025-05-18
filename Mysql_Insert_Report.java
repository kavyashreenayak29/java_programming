//Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary into the table Emp of the database Employee by getting the fields through keyboard and Generate
//the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP to get the field and display the results respectively

// File: Mysql_Insert_Report.java
package com.mysql;
import java.sql.*;
import java.util.*;

public class Mysql_Insert_Report {
    public static void main(String[] args) {
        Connection dbConnection = null;
        Scanner sc = new Scanner(System.in);

        try {
            String url = "jdbc:mysql://localhost/Employee";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database Employee");
            }

            String insertQuery = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
            PreparedStatement ps = dbConnection.prepareStatement(insertQuery);

            for (int i = 1; i <= 5; i++) {
                System.out.println("\nEnter details for employee " + i + ":");

                System.out.print("Emp No: ");
                int empno = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Emp Name: ");
                String empname = sc.nextLine();

                System.out.print("Basic Salary: ");
                int basicsalary = sc.nextInt();

                ps.setInt(1, empno);
                ps.setString(2, empname);
                ps.setInt(3, basicsalary);
                ps.executeUpdate();
            }

            System.out.println("\nRecords inserted successfully!");

            // Salary report where name starts with 'R'
            String reportQuery = "SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'";
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

            ps.close();
            rs.close();
            dbConnection.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
