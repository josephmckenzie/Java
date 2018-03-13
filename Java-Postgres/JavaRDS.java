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

		
		// Create a query, execute it, and get the first row of results
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("SELECT cool_people, lame_people FROM java_rules");
		rs.next();
		
		// Print out what we retrieved
		System.out.println("Cool People = " + rs.getString("cool_people"));
		System.out.println("Lame People = " + rs.getString("lame_people"));
		
		// Clean up before we exit
		rs.close();
		statement.close();
		conn.close();
	}
	
}