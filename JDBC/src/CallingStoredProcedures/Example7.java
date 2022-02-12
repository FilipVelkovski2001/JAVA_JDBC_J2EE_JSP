package CallingStoredProcedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Example7 {

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
				
				stm = con.prepareCall("{call increase_salaries_for_department(?, ?)}");
	           
				stm.setString(1, theDepartment);
	            stm.setDouble(2, 10000);
	            
	            stm.execute();
				
	            stmTwo = con.createStatement();
	            String query1 = "SELECT * FROM employees WHERE department='Engineering';";
	            
	            System.out.println("Executing query!");
				ResultSet myRs = stm.executeQuery(query1);
	            
				while(myRs.next()) {
					String first_name = myRs.getString("first_name");
					String last_name = myRs.getString("last_name");
					String email = myRs.getString("email");
					String dept = myRs.getString("department");
					double salary = myRs.getDouble("salary");
					
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
