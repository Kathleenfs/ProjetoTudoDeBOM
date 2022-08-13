package Projeto;
import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	private static String servidor ="jdbc:mysql://localhost/ProjetoIBM";
	private static String usuario="root";
	private static String senha="@k95#t94";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	public static Connection connect() throws Exception {
	
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(servidor,usuario,senha);
			
			if(connection != null) {
				System.out.println("Connect ok class BancoDeDados");
				
			}else {
				System.out.println("Connect fail class BancoDeDados");
			}
			return connection;
		
	}
	
}