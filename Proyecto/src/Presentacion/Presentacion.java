package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import java.awt.Panel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;

import Logica.ControladorLogic;
import Logica.Main;
import javax.swing.DefaultComboBoxModel;
import Logica.TipoInasistencia;
import Logica.Orientacion;
import Logica.Generacion;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Presentacion extends JFrame {

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

	public Presentacion() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ControladorLogic c = new ControladorLogic();
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 1079, 0 };
		gbl_contentPane.rowHeights = new int[] { 549, 0 };
		gbl_contentPane.columnWeights = new double[] {};
		gbl_contentPane.rowWeights = new double[] {};
		contentPane.setLayout(gbl_contentPane);

		getContentPane().setLayout(null);

		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(0, 21, 525, 315);
		getContentPane().add(panelMaster);
		panelMaster.setLayout(new CardLayout(0, 0));

		JPanel paneles = new JPanel();
		panelMaster.add(paneles, "paneles");
		paneles.setLayout(new CardLayout(0, 0));

		JPanel panelAltaUsuario = new JPanel();
		panelAltaUsuario.setToolTipText("dd/mm/aa");
		paneles.add(panelAltaUsuario, "panelAltaUsuario");
		panelAltaUsuario.setLayout(null);

		JLabel lbl_Usuario = new JLabel("Crear Usuario");
		lbl_Usuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Usuario.setBounds(200, 37, 94, 20);
		panelAltaUsuario.add(lbl_Usuario);

		JLabel lblNombreUsuario = new JLabel("Nombre*");
		lblNombreUsuario.setBounds(56, 83, 46, 14);
		panelAltaUsuario.add(lblNombreUsuario);

		inputNombreUsuario_1 = new JTextField();
		inputNombreUsuario_1.setBounds(123, 80, 86, 20);
		panelAltaUsuario.add(inputNombreUsuario_1);
		inputNombreUsuario_1.setColumns(10);

		JLabel lblApellidoUsuario = new JLabel("Apellido*");
		lblApellidoUsuario.setBounds(56, 123, 46, 14);
		panelAltaUsuario.add(lblApellidoUsuario);

		inputApellidoUsuario_1 = new JTextField();
		inputApellidoUsuario_1.setBounds(123, 120, 86, 20);
		panelAltaUsuario.add(inputApellidoUsuario_1);
		inputApellidoUsuario_1.setColumns(10);

		JLabel lblContraseñaUsuario = new JLabel("Contrase\u00F1a*");
		lblContraseñaUsuario.setBounds(56, 168, 57, 14);
		panelAltaUsuario.add(lblContraseñaUsuario);

		passwordField = new JPasswordField();
		passwordField.setBounds(123, 165, 86, 20);
		panelAltaUsuario.add(passwordField);

		JLabel lblCiUsuario = new JLabel("Ci*");
		lblCiUsuario.setBounds(56, 211, 46, 14);
		panelAltaUsuario.add(lblCiUsuario);

		inputCiUsuario_1 = new JTextField();
		inputCiUsuario_1.setBounds(123, 208, 86, 20);
		panelAltaUsuario.add(inputCiUsuario_1);
		inputCiUsuario_1.setColumns(10);

		JLabel lblMailUsuario = new JLabel("Mail*");
		lblMailUsuario.setBounds(56, 253, 46, 14);
		panelAltaUsuario.add(lblMailUsuario);

		inputMailUsuario_1 = new JTextField();
		inputMailUsuario_1.setBounds(123, 250, 124, 20);
		panelAltaUsuario.add(inputMailUsuario_1);
		inputMailUsuario_1.setColumns(10);

		JButton btnGuardarUsuario = new JButton("Guardar");
		btnGuardarUsuario.setBounds(368, 249, 89, 23);
		panelAltaUsuario.add(btnGuardarUsuario);

		JLabel lblFechaNacUsuario = new JLabel("Fecha de nacimiento");
		lblFechaNacUsuario.setBounds(260, 83, 98, 14);
		panelAltaUsuario.add(lblFechaNacUsuario);

		inputFechaNacUsuario = new JTextField();
		inputFechaNacUsuario.setText("dd/mm/aa");
		inputFechaNacUsuario.setToolTipText("dd/mm/aa");
		inputFechaNacUsuario.setBounds(368, 80, 86, 20);
		panelAltaUsuario.add(inputFechaNacUsuario);
		inputFechaNacUsuario.setColumns(10);

		JPanel panelAltaMateria = new JPanel();
		paneles.add(panelAltaMateria, "panelAltaMateria");
		panelAltaMateria.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Agregar materia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(207, 29, 112, 20);
		panelAltaMateria.add(lblNewLabel_1);

		JLabel lblNombreMateria = new JLabel("Nombre*");
		lblNombreMateria.setBounds(179, 77, 46, 14);
		panelAltaMateria.add(lblNombreMateria);

		inputNombreMateria_1 = new JTextField();
		inputNombreMateria_1.setBounds(268, 74, 86, 20);
		panelAltaMateria.add(inputNombreMateria_1);
		inputNombreMateria_1.setColumns(10);

		JLabel lblCodigoMateria = new JLabel("C\u00F3digo*");
		lblCodigoMateria.setBounds(179, 108, 46, 14);
		panelAltaMateria.add(lblCodigoMateria);

		inputCodigoMateria_1 = new JTextField();
		inputCodigoMateria_1.setBounds(268, 105, 86, 20);
		panelAltaMateria.add(inputCodigoMateria_1);
		inputCodigoMateria_1.setColumns(10);

		JLabel lblGeneracionMateria = new JLabel("Generaci\u00F3n*");
		lblGeneracionMateria.setBounds(179, 140, 64, 14);
		panelAltaMateria.add(lblGeneracionMateria);

		JComboBox selectGeneracionMateria = new JComboBox();
		selectGeneracionMateria.setModel(new DefaultComboBoxModel(Generacion.values()));
		selectGeneracionMateria.setMaximumRowCount(3);
		selectGeneracionMateria.setBounds(268, 136, 86, 22);
		panelAltaMateria.add(selectGeneracionMateria);

		JLabel lblOrientacionMateria = new JLabel("Orientaci\u00F3n*");
		lblOrientacionMateria.setBounds(179, 173, 64, 14);
		panelAltaMateria.add(lblOrientacionMateria);

		JComboBox selectOrientacionMateria = new JComboBox();
		selectOrientacionMateria.setModel(new DefaultComboBoxModel(Orientacion.values()));
		selectOrientacionMateria.setMaximumRowCount(2);
		selectOrientacionMateria.setBounds(268, 169, 86, 22);
		panelAltaMateria.add(selectOrientacionMateria);

		JButton btnAgregarMateria = new JButton("Agregar");
		btnAgregarMateria.setBounds(222, 244, 89, 23);
		panelAltaMateria.add(btnAgregarMateria);

		JLabel lblNewLabel = new JLabel("Docente");
		lblNewLabel.setBounds(179, 205, 46, 14);
		panelAltaMateria.add(lblNewLabel);

		inputDocenteMateria = new JTextField();
		inputDocenteMateria.setBounds(268, 202, 86, 20);
		panelAltaMateria.add(inputDocenteMateria);
		inputDocenteMateria.setColumns(10);

		JPanel panelAltaInasistencia = new JPanel();
		paneles.add(panelAltaInasistencia, "panelAltaInasistencia");
		panelAltaInasistencia.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Pasar Inasistencia");
		lblNewLabel_2.setBounds(201, 35, 124, 17);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelAltaInasistencia.add(lblNewLabel_2);

		JLabel lblCantidadHorasInasistencia = new JLabel("Cantidad de horas*");
		lblCantidadHorasInasistencia.setBounds(160, 85, 103, 14);
		panelAltaInasistencia.add(lblCantidadHorasInasistencia);

		inputCantidadHorasInasistencia_1 = new JTextField();
		inputCantidadHorasInasistencia_1.setBounds(263, 82, 86, 20);
		panelAltaInasistencia.add(inputCantidadHorasInasistencia_1);
		inputCantidadHorasInasistencia_1.setColumns(10);

		JLabel lblTipoInaistencia = new JLabel("Tipo de inasistencia*");
		lblTipoInaistencia.setBounds(160, 123, 103, 14);
		panelAltaInasistencia.add(lblTipoInaistencia);

		JLabel lblMateriaInasistencia = new JLabel("Materia*");
		lblMateriaInasistencia.setBounds(160, 159, 46, 14);
		panelAltaInasistencia.add(lblMateriaInasistencia);

		JLabel lblEstudianteInasistencia = new JLabel("Estudiante*");
		lblEstudianteInasistencia.setBounds(160, 192, 65, 14);
		panelAltaInasistencia.add(lblEstudianteInasistencia);

		JButton btnPasarInasistencia = new JButton("Pasar");
		btnPasarInasistencia.setBounds(212, 237, 89, 23);
		panelAltaInasistencia.add(btnPasarInasistencia);

		JComboBox selectTipoInasistencia = new JComboBox();
		selectTipoInasistencia.setMaximumRowCount(3);
		selectTipoInasistencia.setModel(new DefaultComboBoxModel(TipoInasistencia.values()));
		selectTipoInasistencia.setSelectedIndex(3);
		selectTipoInasistencia.setBounds(263, 119, 86, 22);
		panelAltaInasistencia.add(selectTipoInasistencia);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(263, 155, 86, 22);
		panelAltaInasistencia.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(263, 188, 86, 22);
		panelAltaInasistencia.add(comboBox_1);

		JPanel panelConsultarUsuario = new JPanel();
		paneles.add(panelConsultarUsuario, "panelConsultarUsuario");
		panelConsultarUsuario.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Consultar usuario");
		lblNewLabel_3.setBounds(200, 50, 122, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelConsultarUsuario.add(lblNewLabel_3);

		JLabel lblCiConsultarUsuario = new JLabel("Ingrese CI del usuario que desea consultar");
		lblCiConsultarUsuario.setBounds(157, 96, 206, 14);
		panelConsultarUsuario.add(lblCiConsultarUsuario);

		inputCiConsultarUsuario = new JTextField();
		inputCiConsultarUsuario.setBounds(220, 132, 86, 20);
		panelConsultarUsuario.add(inputCiConsultarUsuario);
		inputCiConsultarUsuario.setColumns(10);

		JButton btnConsultarUsuario = new JButton("Consultar");
		btnConsultarUsuario.setBounds(220, 172, 89, 23);
		panelConsultarUsuario.add(btnConsultarUsuario);

		JPanel panelConsultarMateria = new JPanel();
		paneles.add(panelConsultarMateria, "panelConsultarMateria");
		panelConsultarMateria.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Consultar materia");
		lblNewLabel_4.setBounds(200, 58, 123, 17);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelConsultarMateria.add(lblNewLabel_4);

		JLabel lblNombreOCodigoConsultarMateria = new JLabel("Ingrese c\u00F3digo o nombre de la materia a consultar");
		lblNombreOCodigoConsultarMateria.setBounds(143, 97, 261, 14);
		panelConsultarMateria.add(lblNombreOCodigoConsultarMateria);

		inputNombreOCodigoconsultarMateria = new JTextField();
		inputNombreOCodigoconsultarMateria.setBounds(217, 124, 86, 20);
		panelConsultarMateria.add(inputNombreOCodigoconsultarMateria);
		inputNombreOCodigoconsultarMateria.setColumns(10);

		JButton btnConsultarMateria = new JButton("Consultar");
		btnConsultarMateria.setBounds(214, 167, 89, 23);
		panelConsultarMateria.add(btnConsultarMateria);

		JPanel panelConsultarInasistencia = new JPanel();
		paneles.add(panelConsultarInasistencia, "panelConsultarInasistencia");
		panelConsultarInasistencia.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("Consultar inasistencia");
		lblNewLabel_5.setBounds(185, 53, 149, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelConsultarInasistencia.add(lblNewLabel_5);

		JPanel panelListarEstudiantes = new JPanel();
		paneles.add(panelListarEstudiantes, "panelListarEstudiantes");
		panelListarEstudiantes.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Listado de estudiantes");
		lblNewLabel_6.setBounds(185, 5, 155, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarEstudiantes.add(lblNewLabel_6);
		
		ListadoDeEstudiantes = new JTable();
		ListadoDeEstudiantes.setBounds(0, 306, 515, -280);
		panelListarEstudiantes.add(ListadoDeEstudiantes);

		JPanel panelListarMaterias = new JPanel();
		paneles.add(panelListarMaterias, "panelListarMaterias");

		JLabel lblNewLabel_7 = new JLabel("Listado de materias");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarMaterias.add(lblNewLabel_7);

		JPanel panelListarInasistencias = new JPanel();
		paneles.add(panelListarInasistencias, "panelListarInasistencias");

		JLabel lblNewLabel_8 = new JLabel("Listado de inasistencias");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarInasistencias.add(lblNewLabel_8);

		JPanel panelListarDocentes = new JPanel();
		paneles.add(panelListarDocentes, "panelListarDocentes");

		JLabel lblNewLabel_9 = new JLabel("Listado de docentes");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarDocentes.add(lblNewLabel_9);

		JPanel panelListarFuncionarios = new JPanel();
		paneles.add(panelListarFuncionarios, "panelListarFuncionarios");

		JLabel lblNewLabel_11 = new JLabel("Listado de funcionarios");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarFuncionarios.add(lblNewLabel_11);

		JPanel panelListarEstudiantesConPendientes = new JPanel();
		paneles.add(panelListarEstudiantesConPendientes, "panelEstudiantesConPendientes");

		JLabel lblNewLabel_12 = new JLabel("Estudiantes con pendientes");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarEstudiantesConPendientes.add(lblNewLabel_12);

		JPanel panelReporteDeEstadísticas = new JPanel();
		paneles.add(panelReporteDeEstadísticas, "panelHistoricoDeExamenes");

		JLabel lblNewLabel_13 = new JLabel("Historico de examenes");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelReporteDeEstadísticas.add(lblNewLabel_13);

		JPanel panelModificarUsuario = new JPanel();
		paneles.add(panelModificarUsuario, "panelModificarUsuario");

		JLabel lblNewLabel_14 = new JLabel("Modificar usuario");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelModificarUsuario.add(lblNewLabel_14);

		JPanel panelModificarMateria = new JPanel();
		paneles.add(panelModificarMateria, "panelModificarMateria");

		JLabel lblNewLabel_15 = new JLabel("Modificar materia");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelModificarMateria.add(lblNewLabel_15);

		JPanel panelBajaInasistencia = new JPanel();
		paneles.add(panelBajaInasistencia, "panelBajaInasistencia");

		JLabel lblNewLabel_16 = new JLabel("Dar de baja inasistencia");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelBajaInasistencia.add(lblNewLabel_16);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 525, 22);
		getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("Ingresar");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Usuario");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(true);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Materia");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(true);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Inasistencia");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(true);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("Consultar");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Usuario");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(true);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Materia");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(true);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Inasistencia");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(true);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu_1.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_2 = new JMenu("Listar");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Estudiantes");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(true);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu_2.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Materias");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(true);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Inasistencias");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(true);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu_2.add(mntmNewMenuItem_9);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Docentes");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(true);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		mnNewMenu_2.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Funcionarios");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Estudiantes con pendientes");
		mnNewMenu_2.add(mntmNewMenuItem_12);
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(true);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});

		JMenu mnNewMenu_4 = new JMenu("Reporte");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Reporte de estad\u00EDsticas");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(true);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_13);

		JMenu mnNewMenu_3 = new JMenu("Modificar");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Usuario");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(true);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_14);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Materia");
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(true);
				panelBajaInasistencia.setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_15);

		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Inasistencia");
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_16);
	
		//listados
		panelListarEstudiantes.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
				DefaultTableModel model = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;
					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model.addColumn("Cedula");
				model.addColumn("Nombre");
				model.addColumn("Apellido");
				model.addColumn("Fecha de Nacimiento");
				model.addColumn("Mail");
				model.addColumn("Orientación");
				model.addColumn("Estado");
				model.addColumn("Generación");

				String[] dato = new String[8];

				try {
					ResultSet result = ControladorLogic.listarEstudiantes();

					while (result.next()) {
						dato[0] = result.getString(1);
						dato[1] = result.getString(2);
						dato[2] = result.getString(3);
						dato[3] = result.getString(4);
						dato[4] = result.getString(5);
						dato[5] = result.getString(6);
						dato[6] = result.getString(7);
						dato[7] = result.getString(8);
						model.addRow(dato);
					}
					ListadoDeEstudiantes.setModel(model);
				}
				catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		
		
	}

	private JPanel contentPane;
	private JTextField inputContraseñaUsuario;
	private JTextField inputApellidoUsuario;
	private JTextField inputCiUsuario;
	private JTextField inputMailUsuario;
	private JTextField inputNombreUsuario;
	private JTextField inputDia;
	private JTextField inputMes;
	private JTextField inputAño;
	private JTextField inputCiLogin;
	private JTextField inputContraseñaLogin;
	private JTextField inputCodigoMateria;
	private JTextField inputNombreMateria;
	private JTextField InputOrientacionMateria;
	private JTextField inputGeneracionMateria;
	private JTextField inputCantidadHorasInasistencia;
	private JTextField inputFechaInasistencia;
	private JTextField inputTipoInasistencia;
	private JTextField inputMateriaInasistencia;
	private JTextField inputEstudianteInasistencia;
	private JTextField inputNombreUsuario_1;
	private JTextField inputApellidoUsuario_1;
	private JPasswordField passwordField;
	private JTextField inputCiUsuario_1;
	private JTextField inputMailUsuario_1;
	private JTextField inputNombreMateria_1;
	private JTextField inputCodigoMateria_1;
	private JTextField inputCantidadHorasInasistencia_1;
	private JTextField inputFechaNacUsuario;
	private JTextField inputDocenteMateria;
	private JTextField inputCiConsultarUsuario;
	private JTextField inputNombreOCodigoconsultarMateria;
	private JTable ListadoDeEstudiantes;
}