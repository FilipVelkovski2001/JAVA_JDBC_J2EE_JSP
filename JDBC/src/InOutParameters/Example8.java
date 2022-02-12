package InOutParameters;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example8 {

	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/demo";
		final String user = "student";
		final String pass = "student";
		CallableStatement stm;
		Statement stmTwo;
		
	try {

		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Connecting to database!");
		    Connection con = DriverManager.getConnection(url, user, pass);

			try {
				
			
			System.out.println("Increasing salaries with callable statements");
			System.out.println("");   		
			
			String theDepartment = "Engineering";
			int theIncreaseAmount = 10000;
			
			stm = con.prepareCall("{call greet_the_department(?)}");
           
			stm.setString(1, theDepartment);
            
            System.out.println("Calling the procedure, greet_the_department: "+ theDepartment);
            stm.execute();
            System.out.println("Finished calling stored procedure");
            
            String theResult = stm.getString(1);
            
            System.out.println("The result: "+ theResult);
			
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
