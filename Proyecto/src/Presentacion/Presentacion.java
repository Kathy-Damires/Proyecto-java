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
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import java.awt.Panel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Presentacion extends JFrame {
	public Presentacion() {
		getContentPane().setLayout(null);
		
		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(0, 0, 525, 336);
		getContentPane().add(panelMaster);
		panelMaster.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 23, 525, 313);
		panelMaster.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panelAltaUsuario = new JPanel();
		panelAltaUsuario.setLayout(null);
		panel.add(panelAltaUsuario, "name_420719485017100");
		
		JLabel lblNewLabel_17 = new JLabel("Crear usuario");
		lblNewLabel_17.setBounds(205, 11, 75, 32);
		panelAltaUsuario.add(lblNewLabel_17);
		
		JPanel panelAltaMateria = new JPanel();
		panelAltaMateria.setBounds(0, 23, 525, 313);
		panelMaster.add(panelAltaMateria);
		
		JLabel lblNewLabel_1 = new JLabel("Crear materia");
		panelAltaMateria.add(lblNewLabel_1);
		
		JPanel panelAltaInasistencia = new JPanel();
		panelAltaInasistencia.setBounds(0, 23, 525, 313);
		panelMaster.add(panelAltaInasistencia);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar inasistencia");
		panelAltaInasistencia.add(lblNewLabel_2);
		
		JPanel panelConsultarUsuario = new JPanel();
		panelConsultarUsuario.setBounds(0, 23, 525, 313);
		panelMaster.add(panelConsultarUsuario);
		
		JLabel lblNewLabel_3 = new JLabel("Consultar usuario");
		panelConsultarUsuario.add(lblNewLabel_3);
		
		JPanel panelConsultarMateria = new JPanel();
		panelConsultarMateria.setBounds(0, 23, 525, 313);
		panelMaster.add(panelConsultarMateria);
		
		JLabel lblNewLabel_4 = new JLabel("Consultar materia");
		panelConsultarMateria.add(lblNewLabel_4);
		
		JPanel panelConsultarInasistencia = new JPanel();
		panelConsultarInasistencia.setBounds(0, 23, 525, 313);
		panelMaster.add(panelConsultarInasistencia);
		
		JLabel lblNewLabel_5 = new JLabel("Consultar inasistencia");
		panelConsultarInasistencia.add(lblNewLabel_5);
		
		JPanel panelListarEstudiantes = new JPanel();
		panelListarEstudiantes.setBounds(0, 23, 525, 313);
		panelMaster.add(panelListarEstudiantes);
		
		JLabel lblNewLabel_6 = new JLabel("Listado de estudiantes");
		panelListarEstudiantes.add(lblNewLabel_6);
		
		JPanel panelListarMaterias = new JPanel();
		panelListarMaterias.setBounds(0, 23, 525, 313);
		panelMaster.add(panelListarMaterias);
		
		JLabel lblNewLabel_7 = new JLabel("Listado de materias");
		panelListarMaterias.add(lblNewLabel_7);
		
		JPanel panelListarInasistencias = new JPanel();
		panelListarInasistencias.setBounds(0, 23, 525, 313);
		panelMaster.add(panelListarInasistencias);
		
		JLabel lblNewLabel_8 = new JLabel("Listado de inasistencias");
		panelListarInasistencias.add(lblNewLabel_8);
		
		JPanel panelListarClases = new JPanel();
		panelListarClases.setBounds(0, 23, 525, 313);
		panelMaster.add(panelListarClases);
		
		JLabel lblNewLabel_10 = new JLabel("Listado de clases");
		panelListarClases.add(lblNewLabel_10);
		
		JPanel panelListarDocentes = new JPanel();
		panelListarDocentes.setBounds(0, 23, 525, 313);
		panelMaster.add(panelListarDocentes);
		
		JLabel lblNewLabel_9 = new JLabel("Listado de docentes");
		panelListarDocentes.add(lblNewLabel_9);
		
		JPanel panelListarFuncionarios = new JPanel();
		panelListarFuncionarios.setBounds(0, 23, 525, 313);
		panelMaster.add(panelListarFuncionarios);
		
		JLabel lblNewLabel_11 = new JLabel("Listado de funcionarios");
		panelListarFuncionarios.add(lblNewLabel_11);
		
		JPanel panelEstudiantesConPendientes = new JPanel();
		panelEstudiantesConPendientes.setBounds(0, 23, 525, 313);
		panelMaster.add(panelEstudiantesConPendientes);
		
		JLabel lblNewLabel_12 = new JLabel("Estudiantes con pendientes");
		panelEstudiantesConPendientes.add(lblNewLabel_12);
		
		JPanel panelHistoricoDeExamenes = new JPanel();
		panelHistoricoDeExamenes.setBounds(0, 23, 525, 313);
		panelMaster.add(panelHistoricoDeExamenes);
		
		JLabel lblNewLabel_13 = new JLabel("Historico de examenes");
		panelHistoricoDeExamenes.add(lblNewLabel_13);
		
		JPanel panelModificarUsuario = new JPanel();
		panelModificarUsuario.setBounds(0, 22, 525, 314);
		panelMaster.add(panelModificarUsuario);
		
		JLabel lblNewLabel_14 = new JLabel("Modificar usuario");
		panelModificarUsuario.add(lblNewLabel_14);
		
		JPanel panelModificarMateria = new JPanel();
		panelModificarMateria.setBounds(0, 23, 525, 313);
		panelMaster.add(panelModificarMateria);
		
		JLabel lblNewLabel_15 = new JLabel("Modificar materia");
		panelModificarMateria.add(lblNewLabel_15);
		
		JPanel panelBajaInasistencia = new JPanel();
		panelBajaInasistencia.setBounds(0, 23, 525, 313);
		panelMaster.add(panelBajaInasistencia);
		
		JLabel lblNewLabel_16 = new JLabel("Dar de baja inasistencia");
		panelBajaInasistencia.add(lblNewLabel_16);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 525, 22);
		panelMaster.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu menuIngresar = new JMenu("Ingresar");
		menuBar.add(menuIngresar);
		
		JMenuItem menuIngresarUsuario = new JMenuItem("Usuario");
		menuIngresarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuario.setVisible(true);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarClases.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelEstudiantesConPendientes.setVisible(false);
				panelHistoricoDeExamenes.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				
				
			}
		});
		menuIngresar.add(menuIngresarUsuario);
		
		JMenuItem menuIngresarMateria = new JMenuItem("Materia");
		menuIngresar.add(menuIngresarMateria);
		
		JMenuItem menuIngresarInasistencia = new JMenuItem("Inasistencia");
		menuIngresar.add(menuIngresarInasistencia);
		
		JMenu menuConsultar = new JMenu("Consultar");
		menuBar.add(menuConsultar);
		
		JMenuItem menuConsultarUsuario = new JMenuItem("Usuario");
		menuConsultar.add(menuConsultarUsuario);
		
		JMenuItem menuConsultarMateria = new JMenuItem("Materia");
		menuConsultar.add(menuConsultarMateria);
		
		JMenuItem menuConsultarInasistencia = new JMenuItem("Inasistencia");
		menuConsultar.add(menuConsultarInasistencia);
		
		JMenu menuListar = new JMenu("Listar");
		menuBar.add(menuListar);
		
		JMenuItem menuListarEstudiantes = new JMenuItem("Estudiantes");
		menuListar.add(menuListarEstudiantes);
		
		JMenuItem menuListarMaterias = new JMenuItem("Materias");
		menuListar.add(menuListarMaterias);
		
		JMenuItem menuListarInasistencias = new JMenuItem("Inasistencias");
		menuListar.add(menuListarInasistencias);
		
		JMenuItem menuListarClases = new JMenuItem("Clases");
		menuListar.add(menuListarClases);
		
		JMenuItem menuListarDocentes = new JMenuItem("Docentes");
		menuListar.add(menuListarDocentes);
		
		JMenuItem menuListarFuncionarios = new JMenuItem("Funcionarios");
		menuListar.add(menuListarFuncionarios);
		
		JMenu menuExamenes = new JMenu("Examenes");
		menuBar.add(menuExamenes);
		
		JMenuItem menuExamenesEstudiantesConPendientes = new JMenuItem("Estudiantes con Pendientes");
		menuExamenes.add(menuExamenesEstudiantesConPendientes);
		
		JMenuItem menuExamenesHistoricoDeExamenes = new JMenuItem("Historico de examenes");
		menuExamenes.add(menuExamenesHistoricoDeExamenes);
		
		JMenu menuModificar = new JMenu("Modificar");
		menuBar.add(menuModificar);
		
		JMenuItem menuModificarUsuario = new JMenuItem("Usuario");
		menuModificar.add(menuModificarUsuario);
		
		JMenuItem menuModificarMateria = new JMenuItem("Materia");
		menuModificar.add(menuModificarMateria);
		
		JMenuItem menuModificarInasistencia = new JMenuItem("Inasistencia");
		menuModificar.add(menuModificarInasistencia);
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
}