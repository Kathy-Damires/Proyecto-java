package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTree;

public class Presentacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCi;
	private JTextField txtTuMailgmaicom;
	private JTextField textField_2;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAo;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presentacion frame = new Presentacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Presentacion() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel login = new JPanel();
		contentPane.add(login, "inicioSesion");
		login.setLayout(null);
		
		JLabel lblCi_1 = new JLabel("ci:");
		lblCi_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCi_1.setBounds(183, 94, 20, 14);
		login.add(lblCi_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 91, 86, 20);
		login.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblContrasea_1 = new JLabel("contrase\u00F1a:");
		lblContrasea_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContrasea_1.setBounds(135, 119, 68, 14);
		login.add(lblContrasea_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(209, 116, 86, 20);
		login.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(229, 37, 43, 28);
		login.add(lblLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(248, 180, 89, 23);
		login.add(btnLogin);
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.setBounds(135, 180, 103, 23);
		login.add(btnCrearUsuario);
		
		JPanel createUser = new JPanel();
		contentPane.add(createUser, "createUser");
		createUser.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(80, 157, 86, 20);
		createUser.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(80, 126, 86, 20);
		createUser.add(textField_1);
		textField_1.setColumns(10);
		
		txtCi = new JTextField();
		txtCi.setToolTipText("sfsf");
		txtCi.setBounds(80, 188, 86, 20);
		createUser.add(txtCi);
		txtCi.setForeground(Color.BLACK);
		txtCi.setColumns(10);
		
		JLabel lblCrearUsuario = new JLabel("Crear usuario");
		lblCrearUsuario.setBounds(187, 11, 119, 24);
		createUser.add(lblCrearUsuario);
		lblCrearUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(29, 98, 41, 14);
		createUser.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(29, 129, 41, 14);
		createUser.add(lblApellido);
		
		JLabel lblCi = new JLabel("ci:");
		lblCi.setBounds(59, 191, 11, 14);
		createUser.add(lblCi);
		
		txtTuMailgmaicom = new JTextField();
		txtTuMailgmaicom.setBounds(80, 219, 86, 20);
		createUser.add(txtTuMailgmaicom);
		txtTuMailgmaicom.setForeground(Color.BLACK);
		txtTuMailgmaicom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mail:");
		lblNewLabel.setBounds(48, 222, 22, 14);
		createUser.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 160, 60, 14);
		createUser.add(lblContrasea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 95, 86, 20);
		createUser.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnGuardar = new JButton("guardar");
		btnGuardar.setBounds(395, 237, 71, 23);
		createUser.add(btnGuardar);
		
		JLabel lblFechaDeNasimiento = new JLabel("Fecha de nasimiento:");
		lblFechaDeNasimiento.setBounds(204, 98, 102, 14);
		createUser.add(lblFechaDeNasimiento);
		
		txtDia = new JTextField();
		txtDia.setForeground(Color.GRAY);
		txtDia.setBounds(316, 95, 22, 20);
		createUser.add(txtDia);
		txtDia.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(341, 98, 11, 14);
		createUser.add(label);
		
		txtMes = new JTextField();
		txtMes.setBounds(351, 95, 29, 20);
		createUser.add(txtMes);
		txtMes.setColumns(10);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(382, 98, 11, 14);
		createUser.add(label_1);
		
		txtAo = new JTextField();
		txtAo.setBounds(390, 95, 29, 20);
		createUser.add(txtAo);
		txtAo.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_589994793660900");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_591472834284400");
	}
}
