package Views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Models.Conexion;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Conexion c = new Conexion();
		if(c.getConexion() != null) {
			System.out.println("Conexion OK");
			PreparedStatement pr;
			//INSERTAR UN NUEVO USUARIO
			Scanner sc = new Scanner(System.in);
			String insertar_usuario = "INSERT INTO USUARIO VALUES(?,?,?,?)";
			System.out.println("ALIAS: ");
			String usuario = sc.next();
			System.out.println("NOMBRE: ");
			String nombre = sc.next();
			System.out.println("EMAIL: ");
			String email = sc.next();
			System.out.println("CONTRASEÑA: ");
			String password = sc.next();
			sc.close();
			
			pr = c.getConexion().prepareStatement(insertar_usuario);
			pr.setString(1, usuario);
			pr.setString(2, nombre);
			pr.setString(3, email);
			pr.setString(4, password);
			pr.executeUpdate();//aqui recien ejecutamos
			pr.close();
			
			
			String sentencia = "SELECT ALIAS, NOMBRE, EMAIL FROM USUARIO";
			pr = c.getConexion().prepareStatement(sentencia);
			ResultSet rs = pr.executeQuery();
			System.out.println("ALIAS\t" + "NOMBRE\t" + "EMAIL");
			while(rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getString(2) +" | "+ rs.getString(3));
				
				System.out.println("-------");
			}
			pr.close();
			c.closeConexion();
		}else {
			System.out.println("Error");
		}
	}
}
