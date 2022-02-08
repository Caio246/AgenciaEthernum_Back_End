package connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoComBanco {
	
		
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/crudagenciaethernum";

		private static final String USERNAME = "root";

		private static final String PASSWORD = "4e3fdp35aon34";
		
		public static Connection createConnectionToMySQL() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver"); 

			Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			
			return connection;
		}

		public static void main(String[] args) throws Exception {
			Connection conn = createConnectionToMySQL();

			if (conn != null) {
				System.out.println("Conexão obtida com sucesso!");
			} else {
				System.out.println("Conexão não foi possível!");
			}
		}

		public static Connection createConnection() {
			// TODO Auto-generated method stub
			return null;
		}

	}

