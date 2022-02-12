package PopulatingDataInTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example4 {

	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/demo";
		final String user = "student";
		final String pass = "student";
		 Statement stm;
		 ResultSet myRs = null;
	try {

		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Connecting to database!");
			final Connection con = DriverManager.getConnection(url, user, pass);
			
			try {	
			stm = con.createStatement();
			System.out.println("Populating data in given table from db!");
			String query = "UPDATE employees SET email='john.doe@luv2code.com'"
					+ " WHERE last_name ='Doe' and first_name= 'John'";		
			
			int rowsAffected = stm.executeUpdate(query);
            myRs = stm.executeQuery("SELECT * FROM employees ORDER BY last_name");
            
			while(myRs.next()) {
				String first_name = myRs.getString("first_name");
				String last_name = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				System.out.println("First name: "+ first_name);
				System.out.println("Last name: "+ last_name);
				System.out.println("Email: "+ email);
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


