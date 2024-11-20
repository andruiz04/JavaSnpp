package Views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conn;
	String connector = "com.mysql.jdbc.Driver";
	String user = "root";
	String pass = "root";
	String url = "jdbc:mysql://localhost:3306/cursojava_bd";
	
	public Conexion() {
		try {
			Class.forName(connector);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = (Connection) DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexion() {
		return conn;
	}
	
	public void closeConexion() throws SQLException {
		conn.close();
	}
}
