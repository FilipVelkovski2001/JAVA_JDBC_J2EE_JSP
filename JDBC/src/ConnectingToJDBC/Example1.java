package ConnectingToJDBC;
import java.sql.*;

public class Example1 {

	public static void main(String[] args) {
		
		// Step 1: Set url, user and password for the connection
		
		final String url = "jdbc:mysql://localhost:3306/sakila";
		final String user = "root";
		final String pass = "filip";
		 Statement stm;
	try {
		   	// Step 2: Get connection to db
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Connecting to database!");
			final Connection con = DriverManager.getConnection(url, user, pass);
			try {
			// Step 3: Create a statement	
			stm = con.createStatement();
			// Step 4: Create a query
			String query1 = "SELECT * FROM actor;";
			// Step 5: Execute query
			System.out.println("Executing query!");
			ResultSet rs = stm.executeQuery(query1);
			// Step 6: Extract info from query
			System.out.println("Printing the values from the query:");
			while(rs.next()) {
				int actor_id = rs.getInt("actor_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				
				System.out.println("Actor id: "+ actor_id);
				System.out.println("First name: "+ first_name);
				System.out.println("Last name: "+ last_name);
			}
			// Step 7: Clean up the environment
			System.out.println("Closing the environment!");
			rs.close();
			stm.close();
			con.close();
			
			// Handle SQL Exceptions
			}catch(SQLException e) {
				System.err.println("Error executing query");
				System.out.println(e);
			}
	// Handle Class.forName Exceptions	 
	}catch(Exception e) {
		System.err.println("Unable to load driver!");
		System.out.println(e);
	}
	}
	
	
}
