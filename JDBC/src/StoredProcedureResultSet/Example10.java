package StoredProcedureResultSet;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Example10 {

	public static void main(String[] args) {

		final String url = "jdbc:mysql://localhost:3306/demo";
		final String user = "student";
		final String pass = "student";
		CallableStatement stm;
		ResultSet rs;
		
	try {

		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Connecting to database!");
		    Connection con = DriverManager.getConnection(url, user, pass);

			try {		
			
			String theDepartment = "Engineering";
			
			stm = con.prepareCall("{call get_employees_for_department(?)}");
           
			stm.setString(1, theDepartment);
            
            System.out.println("Calling the procedure, get_employees_for_department: "+ theDepartment);
            stm.execute();
            System.out.println("Finished calling stored procedure");
            
            rs = stm.getResultSet();
            
            System.out.println("Result: ");
            while(rs.next()) {
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				String dept = rs.getString("department");
				double salary = rs.getDouble("salary");
				
				System.out.println("First name: "+ first_name);
				System.out.println("Last name: "+ last_name);
				System.out.println("Email: "+ email);
				System.out.println("Department: "+ dept);
				System.out.println("Salary: "+ salary);
				System.out.println("");
			}
            
			
			System.out.println("Closing the environment!");
			stm.close();
			con.close();
			
			
			}catch(SQLException e) {
				System.err.println("Error executing query");
				System.out.println(e);
			}	
			
	}catch(Exception e) {
		System.err.println("Unable to load driver!");
		System.out.println(e);
	}

	}

}
