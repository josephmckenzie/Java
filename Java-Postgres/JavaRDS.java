import java.sql.*;

public class JavaRDS {

	public static void main(String[] args) throws Exception {
		// Force a load of the JDBC driver into the Driver manager
		Class.forName("org.postgresql.Driver");
		String joes_java_rdsInstance = System.getenv("joes_java_rdsInstance");
		String joes_java_rdsUsername = System.getenv("joes_java_rdsUsername");
		String joes_java_password = System.getenv("joes_java_password");
		// Open a connection to the database
		Connection conn = DriverManager.getConnection(joes_java_rdsInstance, joes_java_rdsUsername, joes_java_password);
	
		PreparedStatement insert = conn.prepareStatement("INSERT INTO java_rules (cool_people, lame_people) VALUES (?, ?)");
  insert.setString(1, "Joe");
  insert.setString(2, "Marvin");
  insert.executeUpdate();
		
		// Create a query, execute it, and get the results
		Statement statement = conn.createStatement();
		
		//Select Statement using above statement to get the results in the database
		ResultSet select = statement.executeQuery("SELECT cool_people, lame_people FROM java_rules");
		// Using select.next();  We get the first result in the table
		// When I took out select.next() it broke , we need this to get at least the first result
		
		// We can use a simple while loop using 	select.next() to get all the results back from our table
		while(select.next()) {
			// Print out what we retrieve
 		System.out.println("Cool People = " + select.getString("cool_people"));
		 System.out.println("Lame People = " + select.getString("lame_people"));
  }
		
		// Close all of our connections and clean up before we exit
		insert.close();
		select.close();
		statement.close();
		conn.close();
	}
	
}

