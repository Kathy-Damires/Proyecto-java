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
import javax.swing.JTextPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import java.awt.Panel;

public class Presentacion extends JFrame {

	private JPanel contentPane;
	private JTextField inputContraseñaUsuario;
	private JTextField inputApellidoUsuario;
	private JTextField inputCiUsuario;
	private JTextField inputMailUsuario;
	private JTextField inputNombreUsuario;
	private JTextField inputDia;
	private JTextField inputMes;
	private JTextField inputAño;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField inputCodigoMateria;
	private JTextField inputNombreMateria;
	private JTextField InputOrientacionMateria;
	private JTextField inputGeneracionMateria;
	private JTextField inputCantidadHorasInasistencia;
	private JTextField inputFechaInasistencia;
	private JTextField inputTipoInasistencia;
	private JTextField inputMateriaInasistencia;
	private JTextField inputEstudianteInasistencia;

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
		
		JPanel menu = new JPanel();
		contentPane.add(menu, "name_7267781861199800");
		menu.setLayout(null);
		
		Panel panelMenu = new Panel();
		panelMenu.setBounds(0, 0, 106, 261);
		menu.add(panelMenu);
		
		JButton btnMateriaMenu = new JButton("Materias");
		panelMenu.add(btnMateriaMenu);
		
		JButton btnEstudiantesMenu = new JButton("Estudiantes");
		panelMenu.add(btnEstudiantesMenu);
		
		JButton btnInasistenciasMenu = new JButton("Inasistencias");
		panelMenu.add(btnInasistenciasMenu);
		
		JButton btnNewButton_4 = new JButton("New button");
		panelMenu.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		panelMenu.add(btnNewButton_3);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(106, 0, 360, 20);
		menu.add(panel_1);
		
		JPanel logout = new JPanel();
		contentPane.add(logout, "name_7270980644940500");
		
		JPanel altaUsuario = new JPanel();
		contentPane.add(altaUsuario, "createUser");
		altaUsuario.setLayout(null);
		
		JLabel labelCrearUsuario = new JLabel("Crear usuario");
		labelCrearUsuario.setBounds(170, 11, 151, 24);
		altaUsuario.add(labelCrearUsuario);
		labelCrearUsuario.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		inputNombreUsuario = new JTextField();
		inputNombreUsuario.setBounds(80, 95, 86, 20);
		altaUsuario.add(inputNombreUsuario);
		inputNombreUsuario.setColumns(10);
		
		inputApellidoUsuario = new JTextField();
		inputApellidoUsuario.setBounds(80, 126, 86, 20);
		altaUsuario.add(inputApellidoUsuario);
		inputApellidoUsuario.setColumns(10);
		
		inputContraseñaUsuario = new JTextField();
		inputContraseñaUsuario.setBounds(80, 157, 86, 20);
		altaUsuario.add(inputContraseñaUsuario);
		inputContraseñaUsuario.setColumns(10);
		
		inputCiUsuario = new JTextField();
		inputCiUsuario.setToolTipText("sfsf");
		inputCiUsuario.setBounds(80, 188, 86, 20);
		altaUsuario.add(inputCiUsuario);
		inputCiUsuario.setForeground(Color.BLACK);
		inputCiUsuario.setColumns(10);
		
		inputMailUsuario = new JTextField();
		inputMailUsuario.setBounds(80, 219, 86, 20);
		altaUsuario.add(inputMailUsuario);
		inputMailUsuario.setForeground(Color.BLACK);
		inputMailUsuario.setColumns(10);
		
		JLabel labelNombreUsuario = new JLabel("Nombre:");
		labelNombreUsuario.setBounds(29, 98, 41, 14);
		altaUsuario.add(labelNombreUsuario);
		
		JLabel labelApellidoUsuario = new JLabel("Apellido:");
		labelApellidoUsuario.setBounds(29, 129, 41, 14);
		altaUsuario.add(labelApellidoUsuario);
		
		JLabel labelCiUsuario = new JLabel("ci:");
		labelCiUsuario.setBounds(59, 191, 11, 14);
		altaUsuario.add(labelCiUsuario);
		
		JLabel labelMailUsuario = new JLabel("Mail:");
		labelMailUsuario.setBounds(48, 222, 22, 14);
		altaUsuario.add(labelMailUsuario);
		
		JLabel labelContraseñaUsuario = new JLabel("Contrase\u00F1a:");
		labelContraseñaUsuario.setBounds(10, 160, 60, 14);
		altaUsuario.add(labelContraseñaUsuario);
		
		JButton btnGuardarUsuario = new JButton("guardar");
		btnGuardarUsuario.setBounds(395, 237, 71, 23);
		altaUsuario.add(btnGuardarUsuario);
		
		JPanel FechaDeNacimientoUsuario = new JPanel();
		FechaDeNacimientoUsuario.setBounds(197, 95, 241, 35);
		altaUsuario.add(FechaDeNacimientoUsuario);
		FechaDeNacimientoUsuario.setLayout(null);
		
		JLabel lblFechaDeNacimientoUsuario = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimientoUsuario.setBounds(7, 11, 102, 14);
		FechaDeNacimientoUsuario.add(lblFechaDeNacimientoUsuario);
		
		inputDia = new JTextField();
		inputDia.setBounds(108, 8, 22, 20);
		FechaDeNacimientoUsuario.add(inputDia);
		inputDia.setForeground(Color.GRAY);
		inputDia.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(135, 11, 11, 14);
		FechaDeNacimientoUsuario.add(label);
		
		inputMes = new JTextField();
		inputMes.setBounds(144, 8, 29, 20);
		FechaDeNacimientoUsuario.add(inputMes);
		inputMes.setColumns(10);
		
		inputAño = new JTextField();
		inputAño.setBounds(183, 8, 29, 20);
		FechaDeNacimientoUsuario.add(inputAño);
		inputAño.setColumns(10);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(175, 11, 11, 14);
		FechaDeNacimientoUsuario.add(label_1);
		
		JPanel altaMateria = new JPanel();
		contentPane.add(altaMateria, "name_589994793660900");
		altaMateria.setLayout(null);
		
		JLabel labelCrearMateria = DefaultComponentFactory.getInstance().createLabel("Crear materia");
		labelCrearMateria.setBounds(157, 5, 151, 29);
		labelCrearMateria.setFont(new Font("Arial Black", Font.PLAIN, 20));
		altaMateria.add(labelCrearMateria);
		
		JLabel labelNombreMateria = DefaultComponentFactory.getInstance().createLabel("C\u00F3digo");
		labelNombreMateria.setBounds(157, 71, 92, 14);
		altaMateria.add(labelNombreMateria);
		
		JLabel labelCodigoMateria = DefaultComponentFactory.getInstance().createLabel("Nombre");
		labelCodigoMateria.setBounds(157, 102, 92, 14);
		altaMateria.add(labelCodigoMateria);
		
		JLabel labelGeneracionMateria = DefaultComponentFactory.getInstance().createLabel("Generaci\u00F3n");
		labelGeneracionMateria.setBounds(157, 130, 92, 14);
		altaMateria.add(labelGeneracionMateria);
		
		JLabel labelOrientacionMateria = DefaultComponentFactory.getInstance().createLabel("Orientaci\u00F3n");
		labelOrientacionMateria.setBounds(157, 164, 92, 14);
		altaMateria.add(labelOrientacionMateria);
		
		inputCodigoMateria = new JTextField();
		inputCodigoMateria.setBounds(222, 68, 86, 20);
		altaMateria.add(inputCodigoMateria);
		inputCodigoMateria.setColumns(10);
		
		inputNombreMateria = new JTextField();
		inputNombreMateria.setBounds(222, 161, 86, 20);
		altaMateria.add(inputNombreMateria);
		inputNombreMateria.setColumns(10);
		
		InputOrientacionMateria = new JTextField();
		InputOrientacionMateria.setBounds(222, 99, 86, 20);
		altaMateria.add(InputOrientacionMateria);
		InputOrientacionMateria.setColumns(10);
		
		inputGeneracionMateria = new JTextField();
		inputGeneracionMateria.setBounds(222, 130, 86, 20);
		altaMateria.add(inputGeneracionMateria);
		inputGeneracionMateria.setColumns(10);
		
		JButton btnGuardarMateria = new JButton("Guardar");
		btnGuardarMateria.setBounds(191, 203, 89, 23);
		altaMateria.add(btnGuardarMateria);
		
		JPanel altaInasistencia = new JPanel();
		contentPane.add(altaInasistencia, "name_591472834284400");
		altaInasistencia.setLayout(null);
		
		JLabel labelAltaMateria = DefaultComponentFactory.getInstance().createLabel("Pasar inasistencia");
		labelAltaMateria.setFont(new Font("Arial Black", Font.PLAIN, 20));
		labelAltaMateria.setBounds(127, 0, 200, 34);
		altaInasistencia.add(labelAltaMateria);
		
		JLabel labelCantidadHorasInasistencia = DefaultComponentFactory.getInstance().createLabel("Cantidad de horas");
		labelCantidadHorasInasistencia.setBounds(127, 68, 92, 14);
		altaInasistencia.add(labelCantidadHorasInasistencia);
		
		JLabel labelFechaInasistencia = DefaultComponentFactory.getInstance().createLabel("Fecha");
		labelFechaInasistencia.setBounds(127, 99, 92, 14);
		altaInasistencia.add(labelFechaInasistencia);
		
		JLabel labelTipoInasistencia = DefaultComponentFactory.getInstance().createLabel("Tipo de inasistencia");
		labelTipoInasistencia.setBounds(126, 127, 93, 14);
		altaInasistencia.add(labelTipoInasistencia);
		
		JLabel labelMateriaInasistencia = DefaultComponentFactory.getInstance().createLabel("Materia");
		labelMateriaInasistencia.setBounds(127, 158, 92, 14);
		altaInasistencia.add(labelMateriaInasistencia);
		
		JLabel labelEstudianteInasistencia = DefaultComponentFactory.getInstance().createLabel("Estudiante");
		labelEstudianteInasistencia.setBounds(127, 189, 92, 14);
		altaInasistencia.add(labelEstudianteInasistencia);
		
		inputCantidadHorasInasistencia = new JTextField();
		inputCantidadHorasInasistencia.setBounds(241, 65, 86, 20);
		altaInasistencia.add(inputCantidadHorasInasistencia);
		inputCantidadHorasInasistencia.setColumns(10);
		
		inputFechaInasistencia = new JTextField();
		inputFechaInasistencia.setBounds(241, 96, 86, 20);
		altaInasistencia.add(inputFechaInasistencia);
		inputFechaInasistencia.setColumns(10);
		
		inputTipoInasistencia = new JTextField();
		inputTipoInasistencia.setBounds(241, 124, 86, 20);
		altaInasistencia.add(inputTipoInasistencia);
		inputTipoInasistencia.setColumns(10);
		
		inputMateriaInasistencia = new JTextField();
		inputMateriaInasistencia.setBounds(241, 155, 86, 20);
		altaInasistencia.add(inputMateriaInasistencia);
		inputMateriaInasistencia.setColumns(10);
		
		inputEstudianteInasistencia = new JTextField();
		inputEstudianteInasistencia.setBounds(241, 186, 86, 20);
		altaInasistencia.add(inputEstudianteInasistencia);
		inputEstudianteInasistencia.setColumns(10);
		
		JButton btnGuardarInasistencia = new JButton("Guardar");
		btnGuardarInasistencia.setBounds(184, 214, 89, 23);
		altaInasistencia.add(btnGuardarInasistencia);
		
		JPanel consultarMateria = new JPanel();
		consultarMateria.setLayout(null);
		contentPane.add(consultarMateria, "name_7266486128463000");
		
		JPanel consultarInasistencia = new JPanel();
		contentPane.add(consultarInasistencia, "name_7266998621049400");
		
		JPanel listarEstudiates = new JPanel();
		contentPane.add(listarEstudiates, "name_7267049094696900");
		
		JPanel listarMaterias = new JPanel();
		contentPane.add(listarMaterias, "name_7267056620904900");
		
		JPanel listarInasistencias = new JPanel();
		contentPane.add(listarInasistencias, "name_7267062274337900");
		
		JPanel listarInasistencias2 = new JPanel();
		contentPane.add(listarInasistencias2, "name_7267071442693000");
		
		JPanel modificarUsiario = new JPanel();
		contentPane.add(modificarUsiario, "name_7267074492216600");
		modificarUsiario.setLayout(null);
		
		JPanel modificarMateria = new JPanel();
		contentPane.add(modificarMateria, "name_7267351147469500");
		
		JPanel bajaInasistencia = new JPanel();
		contentPane.add(bajaInasistencia, "name_7267357692936300");
		
		JPanel listarEstudiantes = new JPanel();
		contentPane.add(listarEstudiantes, "name_7267362782124800");
		
		JPanel listarHistoricoDeExamenes = new JPanel();
		contentPane.add(listarHistoricoDeExamenes, "name_7267368213336600");
		
		JPanel listarHistoricoDeExamenes2 = new JPanel();
		contentPane.add(listarHistoricoDeExamenes2, "name_7267373661775800");
		
		JPanel listarPendientes = new JPanel();
		contentPane.add(listarPendientes, "name_7267378307327800");
		
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
		
		JPanel listarClase = new JPanel();
		contentPane.add(listarClase, "name_7267312426129100");
		
		JPanel listarDocentes = new JPanel();
		contentPane.add(listarDocentes, "name_7267620451904000");
		
		JPanel listarFuncionarios = new JPanel();
		contentPane.add(listarFuncionarios, "name_7267611360304500");
	}
}
