/*Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
....
...
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Grand Salary : 45000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


//insert_emp.jsp
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<html>
<head><title>Insert Employee</title></head>
<body>

<%
String empnoStr = request.getParameter("empno");
String empname = request.getParameter("empname");
String basicsalaryStr = request.getParameter("basicsalary");

if (empnoStr != null && empname != null && basicsalaryStr != null) {
    int empno = Integer.parseInt(empnoStr);
    int basicsalary = Integer.parseInt(basicsalaryStr);

    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");
        String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, basicsalary);
        ps.executeUpdate();
        out.println("<h3>Record inserted successfully!</h3>");
        ps.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (conn != null) conn.close();
    }
}
%>

<h2>Enter Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required><br>
    Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="text" name="basicsalary" required><br>
    <input type="submit" value="Insert">
</form>

</body>
</html>



//report_emp.jsp
<%@ page import="java.sql.*" %>

<html>
<head><title>Salary Report</title></head>
<body>

<h2>Salary Report</h2>
<%
Connection conn = null;
int totalSalary = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
        int id = rs.getInt("Emp_NO");
        String name = rs.getString("Emp_Name");
        int salary = rs.getInt("Basicsalary");
        totalSalary += salary;
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
Emp_No: <%= id %><br>
Emp_Name: <%= name %><br>
Basic: <%= salary %><br>
<%
    }
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
Grand Salary: <%= totalSalary %><br>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
<%
    rs.close();
    st.close();
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (conn != null) conn.close();
}
%>

</body>
</html>

