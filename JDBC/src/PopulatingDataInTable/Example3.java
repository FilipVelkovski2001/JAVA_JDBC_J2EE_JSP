package PopulatingDataInTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) {
			final String url = "jdbc:mysql://localhost:3306/sakila";
			final String user = "root";
			final String pass = "filip";
			 Statement stm;
		try {

			    Class.forName("com.mysql.cj.jdbc.Driver");
			    System.out.println("Connecting to database!");
				final Connection con = DriverManager.getConnection(url, user, pass);
				
				try {	
				stm = con.createStatement();
				System.out.println("Populating data in given table from db!");
				String query1 = "INSERT INTO registration "+
				                "VALUES (100, 'Ben', 'Sen', 18)";
				stm.executeUpdate(query1);
				query1 = "INSERT INTO registration "+
		                "VALUES (101, 'Neha', 'Vaida', 21)";
		        stm.executeUpdate(query1);
		        query1 = "INSERT INTO registration "+
		                "VALUES (102, 'Benno', 'Lugio', 23)";
		        stm.executeUpdate(query1);
				System.out.println("Inserted records in table!");                 
					
				stm.executeUpdate(query1);
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
