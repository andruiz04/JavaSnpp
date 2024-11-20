package Views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginViews {
	JFrame login;
	public LoginViews() {
		login = new JFrame();//creamos la ventana
		login.setTitle("Formulario de Login");
		login.setBounds(200, 100, 500, 300);
		login.setLayout(new GridLayout(4,2));
		//crear una etiqueta
		JLabel título = new JLabel("Autenticación", JLabel.CENTER);
		login.add(título);
		//etiqueta y campo de usuario
		JLabel lUsuario = new JLabel("Usuario: ", JLabel.CENTER);
		JTextField tUsuario = new JTextField();
		//etiqueta y campo de contraseña
		JLabel lPass = new JLabel("Contraseña: ");
		JPasswordField tPass = new JPasswordField(10);
		//boton de acceder y cancelar
		JButton bAcceder = new JButton("Acceder");
		bAcceder.addActionListener(new ActionListener() {
			@Override //sobreescrito...abstracta
			public void actionPerformed(ActionEvent e) {
				String user = tUsuario.getText();
				String pass = String.valueOf(tPass.getPassword());
				validarDatos(user, pass);
			}
		});
		login.add(lUsuario);
		login.add(tUsuario);
		login.add(lPass);
		login.add(tPass);
		login.add(bAcceder);
		login.setVisible(true);
	}
	protected void validarDatos(String user, String pass) {
		String mensaje = "Usuario: " + user + "\nContraseña: " + pass;
		JOptionPane.showMessageDialog(login, mensaje);
		
	}
	public static void main(String[] args) {
		new LoginViews();
	}
}
