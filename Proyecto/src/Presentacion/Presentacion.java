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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		setBounds(100, 100, 636, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(0, 22, 630, 354);
		contentPane.add(panelMaster);
		panelMaster.setLayout(new CardLayout(0, 0));
		
		JPanel altaUsuario = new JPanel();
		panelMaster.add(altaUsuario, "name_7355866085280300");
		altaUsuario.setLayout(null);
		
		JLabel labelCrearUsuario = new JLabel("Crear usuario");
		labelCrearUsuario.setBounds(228, 11, 151, 24);
		altaUsuario.add(labelCrearUsuario);
		labelCrearUsuario.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		inputNombreUsuario = new JTextField();
		inputNombreUsuario.setBounds(164, 84, 86, 20);
		altaUsuario.add(inputNombreUsuario);
		inputNombreUsuario.setColumns(10);
		
		inputApellidoUsuario = new JTextField();
		inputApellidoUsuario.setBounds(164, 115, 86, 20);
		altaUsuario.add(inputApellidoUsuario);
		inputApellidoUsuario.setColumns(10);
		
		inputContraseñaUsuario = new JTextField();
		inputContraseñaUsuario.setBounds(164, 146, 86, 20);
		altaUsuario.add(inputContraseñaUsuario);
		inputContraseñaUsuario.setColumns(10);
		
		inputCiUsuario = new JTextField();
		inputCiUsuario.setToolTipText("sfsf");
		inputCiUsuario.setBounds(164, 177, 86, 20);
		altaUsuario.add(inputCiUsuario);
		inputCiUsuario.setForeground(Color.BLACK);
		inputCiUsuario.setColumns(10);
		
		inputMailUsuario = new JTextField();
		inputMailUsuario.setBounds(164, 208, 86, 20);
		altaUsuario.add(inputMailUsuario);
		inputMailUsuario.setForeground(Color.BLACK);
		inputMailUsuario.setColumns(10);
		
		JLabel labelNombreUsuario = new JLabel("Nombre:");
		labelNombreUsuario.setBounds(113, 87, 41, 14);
		altaUsuario.add(labelNombreUsuario);
		
		JLabel labelApellidoUsuario = new JLabel("Apellido:");
		labelApellidoUsuario.setBounds(113, 118, 41, 14);
		altaUsuario.add(labelApellidoUsuario);
		
		JLabel labelCiUsuario = new JLabel("ci:");
		labelCiUsuario.setBounds(143, 180, 11, 14);
		altaUsuario.add(labelCiUsuario);
		
		JLabel labelMailUsuario = new JLabel("Mail:");
		labelMailUsuario.setBounds(132, 211, 22, 14);
		altaUsuario.add(labelMailUsuario);
		
		JLabel labelContraseñaUsuario = new JLabel("Contrase\u00F1a:");
		labelContraseñaUsuario.setBounds(94, 149, 60, 14);
		altaUsuario.add(labelContraseñaUsuario);
		
		JButton btnGuardarUsuario = new JButton("Guardar");
		btnGuardarUsuario.setBounds(451, 233, 71, 23);
		altaUsuario.add(btnGuardarUsuario);
		
		JPanel FechaDeNacimientoUsuario = new JPanel();
		FechaDeNacimientoUsuario.setBounds(281, 84, 241, 35);
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
		panelMaster.add(altaMateria, "name_7355871206151700");
		altaMateria.setLayout(null);
		
		JLabel labelCrearMateria = DefaultComponentFactory.getInstance().createLabel("Crear materia");
		labelCrearMateria.setBounds(227, 11, 151, 29);
		labelCrearMateria.setFont(new Font("Arial Black", Font.PLAIN, 20));
		altaMateria.add(labelCrearMateria);
		
		JLabel labelNombreMateria = DefaultComponentFactory.getInstance().createLabel("C\u00F3digo");
		labelNombreMateria.setBounds(227, 86, 92, 14);
		altaMateria.add(labelNombreMateria);
		
		JLabel labelCodigoMateria = DefaultComponentFactory.getInstance().createLabel("Nombre");
		labelCodigoMateria.setBounds(227, 117, 92, 14);
		altaMateria.add(labelCodigoMateria);
		
		JLabel labelGeneracionMateria = DefaultComponentFactory.getInstance().createLabel("Generaci\u00F3n");
		labelGeneracionMateria.setBounds(227, 145, 92, 14);
		altaMateria.add(labelGeneracionMateria);
		
		JLabel labelOrientacionMateria = DefaultComponentFactory.getInstance().createLabel("Orientaci\u00F3n");
		labelOrientacionMateria.setBounds(227, 179, 92, 14);
		altaMateria.add(labelOrientacionMateria);
		
		inputCodigoMateria = new JTextField();
		inputCodigoMateria.setBounds(292, 83, 86, 20);
		altaMateria.add(inputCodigoMateria);
		inputCodigoMateria.setColumns(10);
		
		inputNombreMateria = new JTextField();
		inputNombreMateria.setBounds(292, 176, 86, 20);
		altaMateria.add(inputNombreMateria);
		inputNombreMateria.setColumns(10);
		
		InputOrientacionMateria = new JTextField();
		InputOrientacionMateria.setBounds(292, 114, 86, 20);
		altaMateria.add(InputOrientacionMateria);
		InputOrientacionMateria.setColumns(10);
		
		inputGeneracionMateria = new JTextField();
		inputGeneracionMateria.setBounds(292, 145, 86, 20);
		altaMateria.add(inputGeneracionMateria);
		inputGeneracionMateria.setColumns(10);
		
		JButton btnGuardarMateria = new JButton("Guardar");
		btnGuardarMateria.setBounds(261, 218, 89, 23);
		altaMateria.add(btnGuardarMateria);
		
		JPanel altaInasistencia = new JPanel();
		panelMaster.add(altaInasistencia, "name_7355906347052500");
		altaInasistencia.setLayout(null);
		
		JLabel labelAltaMateria = DefaultComponentFactory.getInstance().createLabel("Pasar inasistencia");
		labelAltaMateria.setFont(new Font("Arial Black", Font.PLAIN, 20));
		labelAltaMateria.setBounds(204, 11, 200, 34);
		altaInasistencia.add(labelAltaMateria);
		
		JLabel labelCantidadHorasInasistencia = DefaultComponentFactory.getInstance().createLabel("Cantidad de horas");
		labelCantidadHorasInasistencia.setBounds(204, 79, 92, 14);
		altaInasistencia.add(labelCantidadHorasInasistencia);
		
		JLabel labelFechaInasistencia = DefaultComponentFactory.getInstance().createLabel("Fecha");
		labelFechaInasistencia.setBounds(204, 110, 92, 14);
		altaInasistencia.add(labelFechaInasistencia);
		
		JLabel labelTipoInasistencia = DefaultComponentFactory.getInstance().createLabel("Tipo de inasistencia");
		labelTipoInasistencia.setBounds(203, 138, 93, 14);
		altaInasistencia.add(labelTipoInasistencia);
		
		JLabel labelMateriaInasistencia = DefaultComponentFactory.getInstance().createLabel("Materia");
		labelMateriaInasistencia.setBounds(204, 169, 92, 14);
		altaInasistencia.add(labelMateriaInasistencia);
		
		JLabel labelEstudianteInasistencia = DefaultComponentFactory.getInstance().createLabel("Estudiante");
		labelEstudianteInasistencia.setBounds(204, 200, 92, 14);
		altaInasistencia.add(labelEstudianteInasistencia);
		
		inputCantidadHorasInasistencia = new JTextField();
		inputCantidadHorasInasistencia.setBounds(318, 76, 86, 20);
		altaInasistencia.add(inputCantidadHorasInasistencia);
		inputCantidadHorasInasistencia.setColumns(10);
		
		inputFechaInasistencia = new JTextField();
		inputFechaInasistencia.setBounds(318, 107, 86, 20);
		altaInasistencia.add(inputFechaInasistencia);
		inputFechaInasistencia.setColumns(10);
		
		inputTipoInasistencia = new JTextField();
		inputTipoInasistencia.setBounds(318, 135, 86, 20);
		altaInasistencia.add(inputTipoInasistencia);
		inputTipoInasistencia.setColumns(10);
		
		inputMateriaInasistencia = new JTextField();
		inputMateriaInasistencia.setBounds(318, 166, 86, 20);
		altaInasistencia.add(inputMateriaInasistencia);
		inputMateriaInasistencia.setColumns(10);
		
		inputEstudianteInasistencia = new JTextField();
		inputEstudianteInasistencia.setBounds(318, 197, 86, 20);
		altaInasistencia.add(inputEstudianteInasistencia);
		inputEstudianteInasistencia.setColumns(10);
		
		JButton btnGuardarInasistencia = new JButton("Guardar");
		btnGuardarInasistencia.setBounds(261, 225, 89, 23);
		altaInasistencia.add(btnGuardarInasistencia);
		
		JPanel consultarMateria = new JPanel();
		panelMaster.add(consultarMateria, "name_7355906429915700");
		consultarMateria.setLayout(null);
		
		JPanel consultarInasistencia = new JPanel();
		panelMaster.add(consultarInasistencia, "name_7355906481247200");
		
		JPanel listarEstudiates = new JPanel();
		panelMaster.add(listarEstudiates, "name_7355906531225000");
		
		JPanel listarMaterias = new JPanel();
		panelMaster.add(listarMaterias, "name_7355906580732800");
		
		JPanel listarInasistencias = new JPanel();
		panelMaster.add(listarInasistencias, "name_7355906628791300");
		
		JPanel listarInasistencias2 = new JPanel();
		panelMaster.add(listarInasistencias2, "name_7355906678229600");
		
		JPanel modificarUsiario = new JPanel();
		panelMaster.add(modificarUsiario, "name_7355906741528500");
		modificarUsiario.setLayout(null);
		
		JPanel modificarMateria = new JPanel();
		panelMaster.add(modificarMateria, "name_7355906843946800");
		
		JPanel bajaInasistencia = new JPanel();
		panelMaster.add(bajaInasistencia, "name_7355906879930400");
		
		JPanel listarEstudiantes = new JPanel();
		panelMaster.add(listarEstudiantes, "name_7355906909180000");
		
		JPanel listarHistoricoDeExamenes = new JPanel();
		panelMaster.add(listarHistoricoDeExamenes, "name_7355906940738400");
		
		JPanel listarHistoricoDeExamenes2 = new JPanel();
		panelMaster.add(listarHistoricoDeExamenes2, "name_7355906969129400");
		
		JPanel listarPendientes = new JPanel();
		panelMaster.add(listarPendientes, "name_7355906997200400");
		
		JPanel login = new JPanel();
		panelMaster.add(login, "name_7355907042144200");
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
		panelMaster.add(listarClase, "name_7355907096718100");
		
		JPanel listarDocentes = new JPanel();
		panelMaster.add(listarDocentes, "name_7355907161958200");
		
		JPanel listarFuncionarios = new JPanel();
		panelMaster.add(listarFuncionarios, "name_7355907189246800");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 630, 21);
		contentPane.add(menuBar);
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenuItem mntmInasistencias = new JMenuItem("Inasistencias");
		mnIngresar.add(mntmInasistencias);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenu mnListar = new JMenu("Listar");
		menuBar.add(mnListar);
	}
}
