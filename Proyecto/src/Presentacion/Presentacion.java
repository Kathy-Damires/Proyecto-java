package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

import java.sql.ResultSet;
import Logica.TipoInasistencia;
import Logica.Orientacion;
import Logica.Generacion;
import Logica.ControladorLogic;
import Logica.Main;
import com.toedter.calendar.JDateChooser;
import java.awt.FlowLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		JPanel panelMaster = new JPanel();
		panelMaster.setBounds(0, 21, 514, 306);
		getContentPane().add(panelMaster);
		panelMaster.setLayout(new CardLayout(0, 0));

		JPanel paneles = new JPanel();
		panelMaster.add(paneles, "name_430114760766500");
		paneles.setLayout(new CardLayout(0, 0));

		JPanel panelAltaUsuarios = new JPanel();
		panelAltaUsuarios.setToolTipText("dd/mm/aa");
		paneles.add(panelAltaUsuarios, "panelAltaUsuario");
		panelAltaUsuarios.setLayout(new CardLayout(0, 0));

		JPanel panelAltaEstudiante = new JPanel();
		panelAltaUsuarios.add(panelAltaEstudiante, "Alta Estudiante");
		panelAltaEstudiante.setLayout(null);

		JLabel lblAltaEstudiante = new JLabel("Alta estudiante");
		lblAltaEstudiante.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltaEstudiante.setBounds(198, 26, 104, 14);
		panelAltaEstudiante.add(lblAltaEstudiante);

		JLabel lblCiAltaEstudiante = new JLabel("CI*");
		lblCiAltaEstudiante.setBounds(91, 69, 46, 14);
		panelAltaEstudiante.add(lblCiAltaEstudiante);

		inputCiAltaEstudiante = new JTextField();
		inputCiAltaEstudiante.setBounds(149, 66, 86, 20);
		panelAltaEstudiante.add(inputCiAltaEstudiante);
		inputCiAltaEstudiante.setColumns(10);

		JLabel lblNombreAltaEstudiante = new JLabel("Nombre*");
		lblNombreAltaEstudiante.setBounds(91, 108, 59, 14);
		panelAltaEstudiante.add(lblNombreAltaEstudiante);

		inputNombreAltaEstudiante = new JTextField();
		inputNombreAltaEstudiante.setBounds(149, 105, 86, 20);
		panelAltaEstudiante.add(inputNombreAltaEstudiante);
		inputNombreAltaEstudiante.setColumns(10);

		JLabel lblApellidoAltaEstudiante = new JLabel("Apellido*");
		lblApellidoAltaEstudiante.setBounds(91, 147, 59, 14);
		panelAltaEstudiante.add(lblApellidoAltaEstudiante);

		inputApelidoAltaEstudiante = new JTextField();
		inputApelidoAltaEstudiante.setBounds(149, 144, 86, 20);
		panelAltaEstudiante.add(inputApelidoAltaEstudiante);
		inputApelidoAltaEstudiante.setColumns(10);

		JLabel lblFechaNacAltaEstudiante = new JLabel("Fecha de Nacimiento*");
		lblFechaNacAltaEstudiante.setBounds(38, 185, 127, 14);
		panelAltaEstudiante.add(lblFechaNacAltaEstudiante);

		JDateChooser dateChooserAltaEstudiante = new JDateChooser();
		dateChooserAltaEstudiante.setBounds(165, 179, 70, 20);
		panelAltaEstudiante.add(dateChooserAltaEstudiante);

		JLabel lblMailAltaEstudiante = new JLabel("Mail*");
		lblMailAltaEstudiante.setBounds(91, 224, 46, 14);
		panelAltaEstudiante.add(lblMailAltaEstudiante);

		inputMailAltaEstudiante = new JTextField();
		inputMailAltaEstudiante.setBounds(124, 221, 111, 20);
		panelAltaEstudiante.add(inputMailAltaEstudiante);
		inputMailAltaEstudiante.setColumns(10);

		JLabel lblContraseñaAltaEstudiante = new JLabel("Contrase\u00F1a*");
		lblContraseñaAltaEstudiante.setBounds(259, 69, 78, 14);
		panelAltaEstudiante.add(lblContraseñaAltaEstudiante);

		inputContraseñaAltaEstudiante = new JPasswordField();
		inputContraseñaAltaEstudiante.setBounds(347, 66, 86, 20);
		panelAltaEstudiante.add(inputContraseñaAltaEstudiante);

		JLabel lblGeneracionAltaEstudiante = new JLabel("Generacion*");
		lblGeneracionAltaEstudiante.setBounds(259, 108, 70, 14);
		panelAltaEstudiante.add(lblGeneracionAltaEstudiante);

		JLabel lblOrientacionAltaEstudiante = new JLabel("Orientacion*");
		lblOrientacionAltaEstudiante.setBounds(259, 147, 86, 14);
		panelAltaEstudiante.add(lblOrientacionAltaEstudiante);

		JButton btnGuardarEstudiante = new JButton("Guardar");	
		btnGuardarEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inputCiAltaEstudiante.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"No ha ingresado cedula");
				}if(inputNombreAltaEstudiante.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ha ingresado nombre");
				}if(inputApellidoAltaEstudiante.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"No ha ingresado Apellido");
				}if(dateChooserAltaEstudiante.getDate().equals("")) {
					JOptionPane.showMessageDialog(null,"No ha ingresado fecha de nacimiento");
				}if(inputMailAltaEstudiante.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"No ha ingresado mail");
				}if(inputContraseñaAltaEstudiante.getPassword().equals("")) {
					JOptionPane.showMessageDialog(null,"No ha ingresado contraseña");
				}else {
					ci.setText(inputCiAltaEstudiante.getText());
					nombre.setText(inputNombreAltaEstudiante.getText());
					apellido.setText(inputApelidoAltaEstudiante.getText());
					fechaNac.setDate(dateChooserAltaEstudiante.getDate());
					email.setText(inputMailAltaEstudiante.getText());
					passwd.setText(inputContraseñaAltaEstudiante.getPassword());
					
					altaEstudiante(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd, String generacion, String orientacion, String estado);
								
				}
			}
		});
		btnGuardarEstudiante.setBounds(347, 220, 89, 23);
		panelAltaEstudiante.add(btnGuardarEstudiante);
		
		JComboBox selectGeneracionAltaEstudiante = new JComboBox();
		selectGeneracionAltaEstudiante.setModel(new DefaultComboBoxModel(Generacion.values()));
		selectGeneracionAltaEstudiante.setBounds(347, 104, 86, 22);
		panelAltaEstudiante.add(selectGeneracionAltaEstudiante);
		
		JComboBox selectOrientacionAltaEstudiente = new JComboBox();
		selectOrientacionAltaEstudiente.setModel(new DefaultComboBoxModel(Orientacion.values()));
		selectOrientacionAltaEstudiente.setBounds(347, 143, 86, 22);
		panelAltaEstudiante.add(selectOrientacionAltaEstudiente);

		JPanel panelAltaFuncionario = new JPanel();
		panelAltaUsuarios.add(panelAltaFuncionario, "panelAltafuncionario");
		panelAltaFuncionario.setLayout(null);

		JLabel lblAltaDocente = new JLabel("Alta Docente");
		lblAltaDocente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltaDocente.setBounds(213, 23, 96, 14);
		panelAltaFuncionario.add(lblAltaDocente);

		JLabel lblCiAltaDocente = new JLabel("Ci*");
		lblCiAltaDocente.setBounds(181, 61, 46, 14);
		panelAltaFuncionario.add(lblCiAltaDocente);

		inputCiAltaDocente = new JTextField();
		inputCiAltaDocente.setBounds(250, 58, 86, 20);
		panelAltaFuncionario.add(inputCiAltaDocente);
		inputCiAltaDocente.setColumns(10);

		JLabel lblNombreAltaDocente = new JLabel("Nombre*");
		lblNombreAltaDocente.setBounds(181, 92, 59, 14);
		panelAltaFuncionario.add(lblNombreAltaDocente);

		inputNombreAltaDocente = new JTextField();
		inputNombreAltaDocente.setBounds(250, 89, 86, 20);
		panelAltaFuncionario.add(inputNombreAltaDocente);
		inputNombreAltaDocente.setColumns(10);

		JLabel lblApellidoAltaDocente = new JLabel("Apellido*");
		lblApellidoAltaDocente.setBounds(181, 123, 59, 14);
		panelAltaFuncionario.add(lblApellidoAltaDocente);

		inputApellidoAltaDocente = new JTextField();
		inputApellidoAltaDocente.setBounds(250, 120, 86, 20);
		panelAltaFuncionario.add(inputApellidoAltaDocente);
		inputApellidoAltaDocente.setColumns(10);

		JLabel lblFechaNacAltaDocente = new JLabel("Fecha de nacimiento*");
		lblFechaNacAltaDocente.setBounds(136, 157, 123, 14);
		panelAltaFuncionario.add(lblFechaNacAltaDocente);

		JDateChooser dateChooserFechaNacAltaDocente = new JDateChooser();
		dateChooserFechaNacAltaDocente.setBounds(266, 151, 70, 20);
		panelAltaFuncionario.add(dateChooserFechaNacAltaDocente);

		JLabel lblMailAltaDocente = new JLabel("Mail*");
		lblMailAltaDocente.setBounds(181, 185, 46, 14);
		panelAltaFuncionario.add(lblMailAltaDocente);

		inputMailAltaDocente = new JTextField();
		inputMailAltaDocente.setBounds(227, 182, 109, 20);
		panelAltaFuncionario.add(inputMailAltaDocente);
		inputMailAltaDocente.setColumns(10);

		JLabel lblPasswordAltaDocente = new JLabel("Contrase\u00F1a*");
		lblPasswordAltaDocente.setBounds(171, 216, 80, 14);
		panelAltaFuncionario.add(lblPasswordAltaDocente);

		inputPassswordAltaDocente = new JPasswordField();
		inputPassswordAltaDocente.setBounds(250, 213, 86, 20);
		panelAltaFuncionario.add(inputPassswordAltaDocente);

		JButton btnGuardarDocente = new JButton("Guardar");
		btnGuardarDocente.setBounds(213, 257, 89, 23);
		panelAltaFuncionario.add(btnGuardarDocente);

		JPanel panelAltaDocente = new JPanel();
		panelAltaUsuarios.add(panelAltaDocente, "panelAltaDocente");
		panelAltaDocente.setLayout(null);

		JLabel lblAltaFuncionario = new JLabel("Alta Funcionario");
		lblAltaFuncionario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltaFuncionario.setBounds(206, 27, 123, 14);
		panelAltaDocente.add(lblAltaFuncionario);

		JLabel lblCiAltaFuncionario = new JLabel("Ci*");
		lblCiAltaFuncionario.setBounds(189, 58, 46, 14);
		panelAltaDocente.add(lblCiAltaFuncionario);

		inputCiAltaFuncionario = new JTextField();
		inputCiAltaFuncionario.setBounds(267, 55, 86, 20);
		panelAltaDocente.add(inputCiAltaFuncionario);
		inputCiAltaFuncionario.setColumns(10);

		JLabel lblNombreAltaFuncionario = new JLabel("Nombre*");
		lblNombreAltaFuncionario.setBounds(189, 89, 68, 14);
		panelAltaDocente.add(lblNombreAltaFuncionario);

		inputNombreAltaFuncionario = new JTextField();
		inputNombreAltaFuncionario.setBounds(267, 86, 86, 20);
		panelAltaDocente.add(inputNombreAltaFuncionario);
		inputNombreAltaFuncionario.setColumns(10);

		JLabel lblApillidoAltaFuncionario = new JLabel("Apellido*");
		lblApillidoAltaFuncionario.setBounds(189, 120, 68, 14);
		panelAltaDocente.add(lblApillidoAltaFuncionario);

		inputApellidoAltaFuncionario = new JTextField();
		inputApellidoAltaFuncionario.setBounds(267, 117, 86, 20);
		panelAltaDocente.add(inputApellidoAltaFuncionario);
		inputApellidoAltaFuncionario.setColumns(10);

		JLabel lblFechaNacAltaFuncionario = new JLabel("Fecha de Nacimiento*");
		lblFechaNacAltaFuncionario.setBounds(150, 154, 123, 14);
		panelAltaDocente.add(lblFechaNacAltaFuncionario);

		JDateChooser dateChooserFechaNacAltaFuncionario = new JDateChooser();
		dateChooserFechaNacAltaFuncionario.setBounds(283, 148, 70, 20);
		panelAltaDocente.add(dateChooserFechaNacAltaFuncionario);

		JLabel lblMailAltaFuncionario = new JLabel("Mail*");
		lblMailAltaFuncionario.setBounds(189, 182, 46, 14);
		panelAltaDocente.add(lblMailAltaFuncionario);

		inputMailAltaFuncionario = new JTextField();
		inputMailAltaFuncionario.setBounds(230, 179, 123, 20);
		panelAltaDocente.add(inputMailAltaFuncionario);
		inputMailAltaFuncionario.setColumns(10);

		JLabel lblPasswordAltaFuncionario = new JLabel("Contrase\u00F1a*");
		lblPasswordAltaFuncionario.setBounds(189, 213, 86, 14);
		panelAltaDocente.add(lblPasswordAltaFuncionario);

		inputPasswordAltaFuncionario = new JPasswordField();
		inputPasswordAltaFuncionario.setBounds(267, 210, 86, 20);
		panelAltaDocente.add(inputPasswordAltaFuncionario);

		JButton btnGuardarDocente_1 = new JButton("Guardar");
		btnGuardarDocente_1.setBounds(217, 250, 89, 23);
		panelAltaDocente.add(btnGuardarDocente_1);

		JPanel panelAltaMateria = new JPanel();
		paneles.add(panelAltaMateria, "panelAltaMateria");
		panelAltaMateria.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Agregar materia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(207, 29, 112, 20);
		panelAltaMateria.add(lblNewLabel_1);

		JLabel lblNombreMateria = new JLabel("Nombre*");
		lblNombreMateria.setBounds(179, 77, 64, 14);
		panelAltaMateria.add(lblNombreMateria);

		inputNombreMateria_1 = new JTextField();
		inputNombreMateria_1.setBounds(268, 74, 86, 20);
		panelAltaMateria.add(inputNombreMateria_1);
		inputNombreMateria_1.setColumns(10);

		JLabel lblCodigoMateria = new JLabel("C\u00F3digo*");
		lblCodigoMateria.setBounds(179, 108, 64, 14);
		panelAltaMateria.add(lblCodigoMateria);

		inputCodigoMateria_1 = new JTextField();
		inputCodigoMateria_1.setBounds(268, 105, 86, 20);
		panelAltaMateria.add(inputCodigoMateria_1);
		inputCodigoMateria_1.setColumns(10);

		JLabel lblGeneracionMateria = new JLabel("Generaci\u00F3n*");
		lblGeneracionMateria.setBounds(179, 140, 86, 14);
		panelAltaMateria.add(lblGeneracionMateria);

		JLabel lblOrientacionMateria = new JLabel("Orientaci\u00F3n*");
		lblOrientacionMateria.setBounds(179, 173, 86, 14);
		panelAltaMateria.add(lblOrientacionMateria);

		JButton btnAgregarMateria = new JButton("Agregar");
		btnAgregarMateria.setBounds(222, 244, 89, 23);
		panelAltaMateria.add(btnAgregarMateria);

		JLabel lblNewLabel = new JLabel("Docente");
		lblNewLabel.setBounds(179, 205, 64, 14);
		panelAltaMateria.add(lblNewLabel);

		inputDocenteMateria = new JTextField();
		inputDocenteMateria.setBounds(268, 202, 86, 20);
		panelAltaMateria.add(inputDocenteMateria);
		inputDocenteMateria.setColumns(10);
		
		JComboBox selectGeneracionMateria = new JComboBox();
		selectGeneracionMateria.setModel(new DefaultComboBoxModel(Generacion.values()));
		selectGeneracionMateria.setBounds(268, 136, 86, 22);
		panelAltaMateria.add(selectGeneracionMateria);
		
		JComboBox selectOrientacionMateria = new JComboBox();
		selectOrientacionMateria.setModel(new DefaultComboBoxModel(Orientacion.values()));
		selectOrientacionMateria.setBounds(268, 165, 86, 22);
		panelAltaMateria.add(selectOrientacionMateria);

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
		
		JComboBox selectTipoInaistencia = new JComboBox();
		selectTipoInaistencia.setModel(new DefaultComboBoxModel(TipoInasistencia.values()));
		selectTipoInaistencia.setBounds(263, 119, 86, 22);
		panelAltaInasistencia.add(selectTipoInaistencia);
		
		inpuntMateriaInasistencia = new JTextField();
		inpuntMateriaInasistencia.setBounds(263, 156, 86, 20);
		panelAltaInasistencia.add(inpuntMateriaInasistencia);
		inpuntMateriaInasistencia.setColumns(10);
		
		inputEstudianteInasistencia_1 = new JTextField();
		inputEstudianteInasistencia_1.setBounds(263, 189, 86, 20);
		panelAltaInasistencia.add(inputEstudianteInasistencia_1);
		inputEstudianteInasistencia_1.setColumns(10);

		JPanel panelConsultarUsuario = new JPanel();
		paneles.add(panelConsultarUsuario, "panelConsultarUsuario");
		panelConsultarUsuario.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Consultar usuario");
		lblNewLabel_3.setBounds(200, 50, 122, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelConsultarUsuario.add(lblNewLabel_3);

		JLabel lblCiConsultarUsuario = new JLabel("Ingrese CI del usuario que desea consultar");
		lblCiConsultarUsuario.setBounds(142, 96, 250, 14);
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
		lblNombreOCodigoConsultarMateria.setBounds(131, 97, 306, 14);
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

		JPanel panelListarUsuarios = new JPanel();
		paneles.add(panelListarUsuarios, "panelListarUsuarios");
		panelListarUsuarios.setLayout(null);

		JLabel lblNewLabel_20 = new JLabel("Listado de Usuarios");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_20.setBounds(182, 0, 150, 14);
		panelListarUsuarios.add(lblNewLabel_20);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 304, 514, -279);
		panelListarUsuarios.add(scrollPane);

		listadoDeUsuarios = new JTable();
		scrollPane.setViewportView(listadoDeUsuarios);

		JPanel panelListarEstudiantes = new JPanel();
		paneles.add(panelListarEstudiantes, "panelListarEstudiantes");
		panelListarEstudiantes.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Listado de estudiantes");
		lblNewLabel_6.setBounds(185, 5, 155, 17);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarEstudiantes.add(lblNewLabel_6);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 307, 515, -285);
		panelListarEstudiantes.add(scrollPane_5);

		listadoDeEstudiantes = new JTable();
		scrollPane_5.setViewportView(listadoDeEstudiantes);

		JPanel panelListarMaterias = new JPanel();
		paneles.add(panelListarMaterias, "panelListarMaterias");
		panelListarMaterias.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Listado de materias");
		lblNewLabel_7.setBounds(195, 5, 134, 17);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarMaterias.add(lblNewLabel_7);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 306, 515, -274);
		panelListarMaterias.add(scrollPane_1);

		listadoDeMaterias = new JTable();
		scrollPane_1.setViewportView(listadoDeMaterias);

		JPanel panelListarInasistencias = new JPanel();
		paneles.add(panelListarInasistencias, "panelListarInasistencias");
		panelListarInasistencias.setLayout(null);

		JLabel lblNewLabel_8 = new JLabel("Listado de inasistencias");
		lblNewLabel_8.setBounds(182, 5, 160, 17);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarInasistencias.add(lblNewLabel_8);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(511, 24, -510, 280);
		panelListarInasistencias.add(scrollPane_2);

		listadoDeInasistencias = new JTable();
		scrollPane_2.setViewportView(listadoDeInasistencias);

		JPanel panelListarDocentes = new JPanel();
		paneles.add(panelListarDocentes, "panelListarDocentes");
		panelListarDocentes.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Listado de docentes");
		lblNewLabel_9.setBounds(193, 5, 138, 17);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarDocentes.add(lblNewLabel_9);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 305, 515, -275);
		panelListarDocentes.add(scrollPane_3);

		listadoDeDocentes = new JTable();
		scrollPane_3.setViewportView(listadoDeDocentes);

		JPanel panelListarFuncionarios = new JPanel();
		paneles.add(panelListarFuncionarios, "panelListarFuncionarios");
		panelListarFuncionarios.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Listado de funcionarios");
		lblNewLabel_11.setBounds(183, 5, 159, 17);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarFuncionarios.add(lblNewLabel_11);

		listadoDeFuncionarios = new JTable();
		listadoDeFuncionarios.setBounds(0, 306, 515, -274);
		panelListarFuncionarios.add(listadoDeFuncionarios);

		JPanel panelListarEstudiantesConPendientes = new JPanel();
		paneles.add(panelListarEstudiantesConPendientes, "panelEstudiantesConPendientes");
		panelListarEstudiantesConPendientes.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("Estudiantes con pendientes");
		lblNewLabel_12.setBounds(167, 5, 190, 17);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelListarEstudiantesConPendientes.add(lblNewLabel_12);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 304, 515, -271);
		panelListarEstudiantesConPendientes.add(scrollPane_4);

		listadoDeEstudiantesConPendientes = new JTable();
		scrollPane_4.setViewportView(listadoDeEstudiantesConPendientes);

		JPanel panelReporteDeEstadísticas = new JPanel();
		paneles.add(panelReporteDeEstadísticas, "panelHistoricoDeExamenes");

		JLabel lblNewLabel_13 = new JLabel("Reporte de estad\u00EDsticas");
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

		JPanel panelIniciarSesion = new JPanel();
		paneles.add(panelIniciarSesion, "name_430678355821200");
		panelIniciarSesion.setLayout(null);

		JLabel lblNewLabel_10 = new JLabel("Mail*");
		lblNewLabel_10.setBounds(167, 69, 46, 14);
		panelIniciarSesion.add(lblNewLabel_10);

		inputMailLogin = new JTextField();
		inputMailLogin.setBounds(258, 66, 86, 20);
		panelIniciarSesion.add(inputMailLogin);
		inputMailLogin.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("Ci*");
		lblNewLabel_17.setBounds(167, 116, 46, 14);
		panelIniciarSesion.add(lblNewLabel_17);

		InputCiLogin = new JTextField();
		InputCiLogin.setBounds(258, 113, 86, 20);
		panelIniciarSesion.add(InputCiLogin);
		InputCiLogin.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("Constrase\u00F1a*");
		lblNewLabel_18.setBounds(167, 162, 86, 14);
		panelIniciarSesion.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Iniciar sesion");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_19.setBounds(205, 33, 111, 14);
		panelIniciarSesion.add(lblNewLabel_19);

		JButton btnLogin = new JButton("Iniciar sesion");
		btnLogin.setBounds(191, 212, 111, 23);
		panelIniciarSesion.add(btnLogin);

		inputPasswordLogin = new JPasswordField();
		inputPasswordLogin.setBounds(258, 159, 86, 20);
		panelIniciarSesion.add(inputPasswordLogin);

//menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 525, 22);
		getContentPane().add(menuBar);

		// ingresar
		JMenu menuIngresar = new JMenu("Ingresar");
		menuIngresar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(menuIngresar);

		JMenu menuIngresarUsuario = new JMenu("Usuario");
		menuIngresar.add(menuIngresarUsuario);

		JMenuItem menuIngresarUsuarioEstudiante = new JMenuItem("Estudiante");
		menuIngresarUsuario.add(menuIngresarUsuarioEstudiante);

		JMenuItem menuIngresarUsuarioDocente = new JMenuItem("Docente");
		menuIngresarUsuario.add(menuIngresarUsuarioDocente);

		JMenuItem menuIngresarUsuarioFuncionario = new JMenuItem("Funcionario");
		menuIngresarUsuario.add(menuIngresarUsuarioFuncionario);

		JMenuItem menuIngresarMateria = new JMenuItem("Materia");
		menuIngresar.add(menuIngresarMateria);

		JMenuItem menuIngresarInasistencia = new JMenuItem("Inasistencia");
		menuIngresar.add(menuIngresarInasistencia);
		// fin ingresar

		// consultar
		JMenu menuConsultar = new JMenu("Consultar");
		menuConsultar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(menuConsultar);

		JMenuItem menuConsultarUsuario = new JMenuItem("Usuario");
		menuConsultar.add(menuConsultarUsuario);

		JMenuItem menuConsultarMateria = new JMenuItem("Materia");
		menuConsultar.add(menuConsultarMateria);

		JMenuItem menuConsultarInasistencia = new JMenuItem("Inasistencia");
		menuConsultar.add(menuConsultarInasistencia);

		JMenu menuListar = new JMenu("Listar");
		menuListar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(menuListar);
		// Fin consultar

		// Listar
		JMenuItem menuListarUsuarios = new JMenuItem("Usuarios");
		menuListar.add(menuListarUsuarios);
		
		JMenuItem menuListarEstudiantes = new JMenuItem("Estudiantes");
		menuListar.add(menuListarEstudiantes);

		JMenuItem MenuListarMaterias = new JMenuItem("Materias");
		menuListar.add(MenuListarMaterias);

		JMenuItem menuListarInasistencias = new JMenuItem("Inasistencias");
		menuListar.add(menuListarInasistencias);

		JMenuItem menuListarDocentes = new JMenuItem("Docentes");
		menuListar.add(menuListarDocentes);

		JMenuItem menuListarFuncionarios = new JMenuItem("Funcionarios");
		menuListar.add(menuListarFuncionarios);

		JMenuItem menuListarEstudiantesConPendientes = new JMenuItem("Estudiantes con pendientes");
		menuListar.add(menuListarEstudiantesConPendientes);
		// fin listar

		// reporte
		JMenu MenuReporte = new JMenu("Reporte");
		MenuReporte.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(MenuReporte);

		JMenuItem menuReporteDeEstadisticas = new JMenuItem("Reporte de estadisticas");
		MenuReporte.add(menuReporteDeEstadisticas);
		// fin repoprte

		// modificar
		JMenu menuModificar = new JMenu("Modificar");
		menuModificar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(menuModificar);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Usuario");
		menuModificar.add(mntmNewMenuItem_14);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Materia");
		menuModificar.add(mntmNewMenuItem_15);

		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Inasistencia");
		menuModificar.add(mntmNewMenuItem_16);

		// fin modificar

//funcionalidades menu
		menuIngresarUsuarioEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaEstudiante.setVisible(true);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuIngresarUsuarioDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(true);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuIngresarUsuarioFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(true);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuIngresarMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(true);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuIngresarInasistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(true);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuConsultarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(true);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuConsultarMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(true);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuConsultarInasistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(true);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		menuListarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(true);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeUsuarios.setVisible(true);
			}
		});
		menuListarEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(true);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeEstudiantes.setVisible(true);
			}
		});
		MenuListarMaterias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(true);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeMaterias.setVisible(true);
			}
		});
		menuListarInasistencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(true);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeMaterias.setVisible(true);
			}
		});
		menuListarDocentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(true);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeDocentes.setVisible(true);
			}
		});
		menuListarFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(true);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeFuncionarios.setVisible(true);
			}
		});
		menuListarEstudiantesConPendientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(true);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
				listadoDeEstudiantesConPendientes.setVisible(true);
			}
		});
		menuReporteDeEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(true);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(true);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(true);
				panelBajaInasistencia.setVisible(false);
				panelIniciarSesion.setVisible(false);
			}
		});
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAltaUsuarios.setVisible(false);
				panelAltaEstudiante.setVisible(false);
				panelAltaDocente.setVisible(false);
				panelAltaFuncionario.setVisible(false);
				panelAltaMateria.setVisible(false);
				panelAltaInasistencia.setVisible(false);
				panelConsultarUsuario.setVisible(false);
				panelConsultarMateria.setVisible(false);
				panelConsultarInasistencia.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarUsuarios.setVisible(false);
				panelListarEstudiantes.setVisible(false);
				panelListarMaterias.setVisible(false);
				panelListarInasistencias.setVisible(false);
				panelListarDocentes.setVisible(false);
				panelListarFuncionarios.setVisible(false);
				panelListarEstudiantesConPendientes.setVisible(false);
				panelReporteDeEstadísticas.setVisible(false);
				panelModificarUsuario.setVisible(false);
				panelModificarMateria.setVisible(false);
				panelBajaInasistencia.setVisible(true);
				panelIniciarSesion.setVisible(false);
			}
		});

//altas

//tablas de listados
		// tabla de usuarios
		panelListarUsuarios.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
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
				model.addColumn("Contraseña");
				String[] dato = new String[6];
				try {
					ResultSet result = ControladorLogic.listarUsuarios();

					while (result.next()) {
						dato[0] = result.getString(1);
						dato[1] = result.getString(2);
						dato[2] = result.getString(3);
						dato[3] = result.getString(4);
						dato[4] = result.getString(5);
						dato[5] = result.getString(6);
						model.addRow(dato);
					}
					listadoDeUsuarios.setModel(model);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		// tabla de estudiantes
		panelListarEstudiantes.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model.addColumn("Cedula");
				model.addColumn("Generación");
				model.addColumn("Orientación");
				model.addColumn("Estado");
				String[] dato = new String[4];
				try {
					ResultSet result = ControladorLogic.listarEstudiantes();
					while (result.next()) {
						dato[0] = result.getString(1);
						dato[1] = result.getString(2);
						dato[2] = result.getString(3);
						dato[3] = result.getString(4);
						model.addRow(dato);
					}
					listadoDeEstudiantes.setModel(model);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		// tabla de materias
		panelListarMaterias.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model.addColumn("Código");
				model.addColumn("Nombre");
				model.addColumn("Orientación");
				model.addColumn("Generación");

				String[] dato = new String[4];

				try {
					ResultSet result = ControladorLogic.listarMaterias();

					while (result.next()) {
						dato[0] = result.getString(1);
						dato[1] = result.getString(2);
						dato[2] = result.getString(3);
						dato[3] = result.getString(4);
						model.addRow(dato);
					}
					listadoDeMaterias.setModel(model);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
//se pide porientacion y generacion	

		// tabla de inasistencias
		panelListarInasistencias.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model2 = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model2.addColumn("Cedula");
				model2.addColumn("Nombre");
				model2.addColumn("Apellido");
				model2.addColumn("Fecha de Nacimiento");
				model2.addColumn("Mail");
				model2.addColumn("Orientación");
				model2.addColumn("Estado");
				model2.addColumn("Generación");

				String[] dato2 = new String[8];

				try {
					ResultSet result = ControladorLogic.listarInasistencias();

					while (result.next()) {
						dato2[0] = result.getString(1);
						dato2[1] = result.getString(2);
						dato2[2] = result.getString(3);
						dato2[3] = result.getString(4);
						dato2[4] = result.getString(5);
						dato2[5] = result.getString(6);
						dato2[6] = result.getString(7);
						dato2[7] = result.getString(8);
						model2.addRow(dato2);
					}
					listadoDeInasistencias.setModel(model2);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		// tabla de Docentes
		panelListarDocentes.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model3 = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model3.addColumn("Cedula");
				model3.addColumn("Nombre");
				model3.addColumn("Apellido");
				model3.addColumn("Fecha de Nacimiento");
				model3.addColumn("Mail");
				String[] dato3 = new String[5];

				try {
					ResultSet result = ControladorLogic.listarDocentes();

					while (result.next()) {
						dato3[0] = result.getString(1);
						dato3[1] = result.getString(2);
						dato3[2] = result.getString(3);
						dato3[3] = result.getString(4);
						dato3[4] = result.getString(5);
						model3.addRow(dato3);
					}
					listadoDeEstudiantes.setModel(model3);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		// tabla de funcionarios
		panelListarFuncionarios.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model4 = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model4.addColumn("Cedula");
				model4.addColumn("Nombre");
				model4.addColumn("Apellido");
				model4.addColumn("Fecha de Nacimiento");
				model4.addColumn("Mail");

				String[] dato4 = new String[5];

				try {
					ResultSet result = ControladorLogic.listarFuncionarios();

					while (result.next()) {
						dato4[0] = result.getString(1);
						dato4[1] = result.getString(2);
						dato4[2] = result.getString(3);
						dato4[3] = result.getString(4);
						dato4[4] = result.getString(5);
						model4.addRow(dato4);
					}
					listadoDeFuncionarios.setModel(model4);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
		// tabla de estudiantes con pendientes
		panelListarEstudiantesConPendientes.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model5 = new DefaultTableModel() {
					private static final long serialVersionUID = 1L;

					public boolean isCellEditable(int row, int column) {
						return false;
					}
				};
				model5.addColumn("Cedula");
				model5.addColumn("Codigo");
				model5.addColumn("Fecha");
				model5.addColumn("Nota");
				model5.addColumn("IdExamen");

				String[] dato5 = new String[5];

				try {
					ResultSet result = ControladorLogic.listarEstudiantesConPendientes();

					while (result.next()) {
						dato5[0] = result.getString(1);
						dato5[1] = result.getString(2);
						dato5[2] = result.getString(3);
						dato5[3] = result.getString(4);
						dato5[4] = result.getString(5);
						model5.addRow(dato5);
					}
					listadoDeEstudiantesConPendientes.setModel(model5);

				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		});
//Fin listas
	}

	private JPanel contentPane;
	private JTextField inputContraseñaUsuario;
	private JTextField inputApellidoUsuario;
	private JTextField inputCiUsuario;
	private JTextField inputMailUsuario;
	private JTextField inputNombreUsuario;
	private JTextField inputDia;
	private JTextField inputMes;
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
	private JTextField inputNombreMateria_1;
	private JTextField inputCodigoMateria_1;
	private JTextField inputCantidadHorasInasistencia_1;
	private JTextField inputDocenteMateria;
	private JTextField inputCiConsultarUsuario;
	private JTextField inputNombreOCodigoconsultarMateria;
	private JTable listadoDeMaterias;
	private JTable listadoDeInasistencias;
	private JTable listadoDeDocentes;
	private JTable listadoDeFuncionarios;
	private JTable listadoDeEstudiantesConPendientes;
	private JTextField inputCiAltaEstudiante;
	private JTextField inputNombreAltaEstudiante;
	private JTextField inputApelidoAltaEstudiante;
	private JTextField inputMailAltaEstudiante;
	private JPasswordField inputContraseñaAltaEstudiante;
	private JTextField inputCiAltaDocente;
	private JTextField inputNombreAltaDocente;
	private JTextField inputApellidoAltaDocente;
	private JTextField inputMailAltaDocente;
	private JPasswordField inputPassswordAltaDocente;
	private JTextField inputCiAltaFuncionario;
	private JTextField inputNombreAltaFuncionario;
	private JTextField inputApellidoAltaFuncionario;
	private JTextField inputMailAltaFuncionario;
	private JPasswordField inputPasswordAltaFuncionario;
	private JTable listadoDeEstudiantes;
	private JTextField inputMailLogin;
	private JTextField InputCiLogin;
	private JPasswordField inputPasswordLogin;
	private JTable listadoDeUsuarios;
	private JTextField inpuntMateriaInasistencia;
	private JTextField inputEstudianteInasistencia_1;
}