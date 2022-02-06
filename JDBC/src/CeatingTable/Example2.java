package CeatingTable;
import java.sql. *;

public class Example2 {

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
			System.out.println("Creating table in given db!");
			String query1 = "CREATE TABLE registration "+
			                 "(id INTEGER not NULL, "+
					          " first VARCHAR(255),"+ 
			                  " last VARCHAR(255), "+
					           " age INTEGER)";
				
			stm.executeUpdate(query1);
			System.out.println("Created table in given db! ");
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
