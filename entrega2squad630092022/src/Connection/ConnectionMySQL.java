package Connection;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConnectionMySQL {
		public static Connection createConnectionMySQL() throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager
					.getConnection("jdbc:mysql://localhost:3306/squad06?user=root&password=3636riam");
			return connection;
		}
		
	 public static void main (String [] args) throws Exception {
		 Connection con = createConnectionMySQL();
		 if (con !=null) {
			 System.out.println(con + "\n****Conexao bem sucedida****\n");
			 con.close();
		 }
		 
	 }
	}



