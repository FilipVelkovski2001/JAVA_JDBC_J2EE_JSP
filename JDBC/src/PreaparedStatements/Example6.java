package PreaparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example6 {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/demo";
		final String user = "student";
		final String pass = "student";
		PreparedStatement stm;
		ResultSet myRs = null;
	try {

		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Connecting to database!");
			final Connection con = DriverManager.getConnection(url, user, pass);

			try {
				
			
			System.out.println("Getting values from db with prepared statements");
			System.out.println("");   		
			
			stm = con.prepareStatement("SELECT * FROM employees WHERE salary > ? and department=?");
           
			stm.setDouble(1, 8000);
            stm.setString(2, "Legal");
            
            myRs = stm.executeQuery();
			
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
