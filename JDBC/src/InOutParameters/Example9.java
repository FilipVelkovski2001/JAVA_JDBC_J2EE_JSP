package InOutParameters;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Example9 {

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
				
			
			System.out.println("Getting count for department: ");
			System.out.println("");   		
			
			String theDepartment = "Engineering";
			
			stm = con.prepareCall("{call get_count_for_department(?, ?)}");
           
			stm.setString(1, theDepartment);
			stm.registerOutParameter(2, Types.INTEGER);
            
            System.out.println("Calling the procedure, get_count_for department: "+ theDepartment);
            stm.execute();
            System.out.println("Finished calling stored procedure");
            
            
            int theCount = stm.getInt(2);
            
            System.out.println("The count: "+ theCount);
            
			
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
