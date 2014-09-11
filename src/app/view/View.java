package app.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 524);
		
		JMenuBar menuSup = new JMenuBar();
		setJMenuBar(menuSup);
		
		JMenu subMenuArchivo = new JMenu("Archivo");
		menuSup.add(subMenuArchivo);
		
		JMenuItem opcionSalir = new JMenuItem("Salir");
		opcionSalir.setIcon(new ImageIcon(View.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		subMenuArchivo.add(opcionSalir);
		
		JLabel logoMenu = new JLabel("");
		logoMenu.setIcon(new ImageIcon(View.class.getResource("/image/logo_small.png")));
		menuSup.add(logoMenu);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuSup.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel busquedaMaterial = new JPanel();
		contentPane.add(busquedaMaterial, "name_10085986187124");
		busquedaMaterial.setLayout(new MigLayout("", "[701.00]", "[][][]"));
		
		JButton btnVolver_4 = new JButton("Volver");
		busquedaMaterial.add(btnVolver_4, "flowx,cell 0 0");
		
		JLabel lblBsqueda = new JLabel("Búsqueda");
		busquedaMaterial.add(lblBsqueda, "cell 0 0");
		
		JLabel lblTipoDeMaterial = new JLabel("Seleccione el tipo de material que desea buscar");
		busquedaMaterial.add(lblTipoDeMaterial, "cell 0 1");
		
		JButton btnLibro = new JButton("Libro");
		btnLibro.setIcon(new ImageIcon(View.class.getResource("/image/book139.png")));
		busquedaMaterial.add(btnLibro, "flowx,cell 0 2,alignx center,aligny center");
		
		JButton btnRevista = new JButton("Revista");
		btnRevista.setIcon(new ImageIcon(View.class.getResource("/image/magazine.png")));
		busquedaMaterial.add(btnRevista, "cell 0 2,alignx center,aligny center");
		
		JButton btnPelcula = new JButton("Película");
		btnPelcula.setIcon(new ImageIcon(View.class.getResource("/image/film50.png")));
		busquedaMaterial.add(btnPelcula, "cell 0 2,aligny center");
		
		JPanel creditos = new JPanel();
		contentPane.add(creditos, "name_5917427800206");
		creditos.setLayout(new MigLayout("", "[356.00px][714.00px]", "[15px][][][][][][][][][][][][][]"));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(View.class.getResource("/image/logo.png")));
		creditos.add(lblLogo, "cell 0 0 2 1,alignx center,aligny top");
		
		JLabel lblCreadores = new JLabel("Proyecto creado por:");
		creditos.add(lblCreadores, "cell 0 1 2 1");
		
		JLabel lblRoberto = new JLabel("Roberto Chen Zheng");
		creditos.add(lblRoberto, "cell 1 2");
		
		JLabel lblVinicio = new JLabel("Vinicio Flores Hernández");
		creditos.add(lblVinicio, "cell 1 3");
		
		JLabel lblFaubricio = new JLabel("Faubricio Forester Soto");
		creditos.add(lblFaubricio, "cell 1 4");
		
		JLabel lblPedro = new JLabel("Pedro Rodríguez de Oliveira");
		creditos.add(lblPedro, "cell 1 5");
		
		JLabel lblCreadoraLogo = new JLabel("Creadora del logo:");
		creditos.add(lblCreadoraLogo, "cell 0 7");
		
		JButton botonVolver = new JButton("Volver a la ventana principal");
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblDayana = new JLabel("Dayana Méndez Salas");
		creditos.add(lblDayana, "cell 1 8");
		
		JLabel lblVersion = new JLabel("Versión:");
		creditos.add(lblVersion, "cell 0 10");
		
		JLabel lblVersionNum = new JLabel("0.5");
		creditos.add(lblVersionNum, "cell 1 11");
		creditos.add(botonVolver, "cell 1 13,alignx right");
		
		JPanel inicio = new JPanel();
		inicio.setBackground(new Color(255, 255, 255));
		contentPane.add(inicio, "name_268387601552984");
		inicio.setLayout(new MigLayout("", "[][140.00,grow][46.00][349.00,grow][right]", "[][][grow][][grow][][grow]"));
		
		JPanel Opciones = new JPanel();
		Opciones.setBackground(new Color(255, 255, 255));
		inicio.add(Opciones, "cell 0 0 1 7,grow");
		Opciones.setLayout(new MigLayout("", "[100px][][][]", "[][][][][][][][]"));
		
		JButton botonBusqueda = new JButton("");
		botonBusqueda.setIcon(new ImageIcon(View.class.getResource("/image/magnifier13.png")));
		Opciones.add(botonBusqueda, "flowy,cell 0 0");
		
		JButton botonAgregarPrest = new JButton("");
		botonAgregarPrest.setIcon(new ImageIcon(View.class.getResource("/image/add70.png")));
		Opciones.add(botonAgregarPrest, "cell 0 1");
		
		JButton botonAgregarLibro = new JButton("");
		botonAgregarLibro.setIcon(new ImageIcon(View.class.getResource("/image/new10.png")));
		Opciones.add(botonAgregarLibro, "cell 0 2");
		
		JButton botonConfiguracion = new JButton("");
		botonConfiguracion.setIcon(new ImageIcon(View.class.getResource("/image/three115.png")));
		Opciones.add(botonConfiguracion, "cell 0 3");
		
		JButton botonManual = new JButton("Manual");
		Opciones.add(botonManual, "cell 0 6,alignx center");
		
		JButton botonCreditos = new JButton("Créditos");
		Opciones.add(botonCreditos, "cell 0 7,alignx center");
		
		JLabel lblMisPertenencias = new JLabel("Mis Pertenencias");
		lblMisPertenencias.setFont(new Font("Consolas", Font.BOLD, 30));
		inicio.add(lblMisPertenencias, "cell 1 0 3 1");
		
		JLabel lblTodas = new JLabel("Todas");
		lblTodas.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblTodas, "cell 1 1");
		
		JLabel lblTotal1 = new JLabel("Total:");
		lblTotal1.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblTotal1, "cell 2 1");
		
		JLabel lblBlank1 = new JLabel("Blank");
		lblBlank1.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblBlank1, "cell 3 1");
		
		JPanel All = new JPanel();
		inicio.add(All, "cell 1 2 3 1,grow");
		
		JLabel lblPrestadas = new JLabel("Prestadas");
		lblPrestadas.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblPrestadas, "cell 1 3");
		
		JLabel lblTotal2 = new JLabel("Total:");
		lblTotal2.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblTotal2, "cell 2 3");
		
		JLabel lblBlank2 = new JLabel("Blank");
		lblBlank2.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblBlank2, "cell 3 3");
		
		JPanel Borrowed = new JPanel();
		inicio.add(Borrowed, "cell 1 4 3 1,grow");
		
		JLabel lblTop = new JLabel("Top");
		lblTop.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblTop, "cell 1 5");
		
		JPanel Top = new JPanel();
		inicio.add(Top, "cell 1 6 3 1,grow");
		
		JPanel registroPrestatario = new JPanel();
		contentPane.add(registroPrestatario, "name_440112681124098");
		registroPrestatario.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][][][][][]"));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registroPrestatario.add(btnVolver, "flowx,cell 0 0");
		
		JLabel lblRegistroDeNuevo = new JLabel("Registro de nuevo prestatario");
		registroPrestatario.add(lblRegistroDeNuevo, "cell 0 0");
		
		JLabel lblSeleccionesElijaLa = new JLabel("Seleccione la categoria de prestatario a crear");
		registroPrestatario.add(lblSeleccionesElijaLa, "cell 0 1");
		
		JPanel panel = new JPanel();
		registroPrestatario.add(panel, "cell 0 2,grow");
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnFamiliar = new JButton("Familiar");
		panel.add(btnFamiliar);
		btnFamiliar.setIcon(new ImageIcon(View.class.getResource("/image/family25.png")));
		
		JButton btnEstudiante = new JButton("Estudiante");
		panel.add(btnEstudiante);
		btnEstudiante.setIcon(new ImageIcon(View.class.getResource("/image/graduate9.png")));
		
		JButton btnColega = new JButton("Colega");
		panel.add(btnColega);
		btnColega.setIcon(new ImageIcon(View.class.getResource("/image/business53.png")));
		
		JPanel registroFamiliar = new JPanel();
		contentPane.add(registroFamiliar, "name_442060658397681");
		registroFamiliar.setLayout(new MigLayout("", "[252.00][188.00][grow][]", "[][][][][][][][][][]"));
		
		JButton btnVolver_1 = new JButton("Volver");
		registroFamiliar.add(btnVolver_1, "flowx,cell 0 0");
		
		JLabel lblRegistroDeFamiliar_1 = new JLabel("Registro de familiar");
		registroFamiliar.add(lblRegistroDeFamiliar_1, "cell 0 0");
		
		JLabel lblNombre = new JLabel("Nombre:");
		registroFamiliar.add(lblNombre, "cell 1 1,alignx trailing");
		
		textField = new JTextField();
		registroFamiliar.add(textField, "cell 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido:");
		registroFamiliar.add(lblPrimerApellido, "cell 1 2,alignx trailing");
		
		textField_1 = new JTextField();
		registroFamiliar.add(textField_1, "cell 2 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido:");
		registroFamiliar.add(lblSegundoApellido, "cell 1 3,alignx trailing");
		
		textField_2 = new JTextField();
		registroFamiliar.add(textField_2, "cell 2 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		registroFamiliar.add(lblTelefono, "cell 1 5,alignx trailing");
		
		textField_3 = new JTextField();
		registroFamiliar.add(textField_3, "cell 2 5,growx");
		textField_3.setColumns(10);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico:");
		registroFamiliar.add(lblCorreoElectrnico, "cell 1 6,alignx trailing");
		
		textField_4 = new JTextField();
		registroFamiliar.add(textField_4, "cell 2 6,growx");
		textField_4.setColumns(10);
		
		JLabel lblParentesco = new JLabel("Parentesco:");
		registroFamiliar.add(lblParentesco, "cell 1 8,alignx trailing");
		
		textField_5 = new JTextField();
		registroFamiliar.add(textField_5, "cell 2 8,growx");
		textField_5.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		registroFamiliar.add(btnRegistrar, "cell 3 9");
		
		JPanel registroEstudiante = new JPanel();
		contentPane.add(registroEstudiante, "name_442145250348966");
		registroEstudiante.setLayout(new MigLayout("", "[][][159.00,grow][71.00]", "[][][][][][][][][][][]"));
		
		JButton btnVolver_2 = new JButton("Volver");
		registroEstudiante.add(btnVolver_2, "flowx,cell 0 0");
		
		JLabel lblRegistroDeEstudiante = new JLabel("Registro de estudiante");
		registroEstudiante.add(lblRegistroDeEstudiante, "cell 0 0");
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		registroEstudiante.add(lblNombre_1, "cell 1 1,alignx trailing");
		
		textField_6 = new JTextField();
		registroEstudiante.add(textField_6, "cell 2 1,growx");
		textField_6.setColumns(10);
		
		JLabel lblPrimerApellido_1 = new JLabel("Primer apellido:");
		registroEstudiante.add(lblPrimerApellido_1, "cell 1 2,alignx trailing");
		
		textField_7 = new JTextField();
		registroEstudiante.add(textField_7, "cell 2 2,growx");
		textField_7.setColumns(10);
		
		JLabel lblSegundoApellido_1 = new JLabel("Segundo apellido:");
		registroEstudiante.add(lblSegundoApellido_1, "cell 1 3,alignx trailing");
		
		textField_8 = new JTextField();
		registroEstudiante.add(textField_8, "cell 2 3,growx");
		textField_8.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		registroEstudiante.add(lblTelfono, "cell 1 5,alignx trailing");
		
		textField_9 = new JTextField();
		registroEstudiante.add(textField_9, "cell 2 5,growx");
		textField_9.setColumns(10);
		
		JLabel lblCorreoElectrnico_1 = new JLabel("Correo electrónico:");
		registroEstudiante.add(lblCorreoElectrnico_1, "cell 1 6,alignx trailing");
		
		textField_10 = new JTextField();
		registroEstudiante.add(textField_10, "cell 2 6,growx");
		textField_10.setColumns(10);
		
		JLabel lblInstitucinDondeEstudia = new JLabel("Institución donde estudia:");
		registroEstudiante.add(lblInstitucinDondeEstudia, "cell 1 8,alignx trailing");
		
		textField_11 = new JTextField();
		registroEstudiante.add(textField_11, "cell 2 8,growx");
		textField_11.setColumns(10);
		
		JLabel lblCarnetDeEstudiante = new JLabel("Carnet de estudiante:");
		registroEstudiante.add(lblCarnetDeEstudiante, "cell 1 9,alignx trailing");
		
		textField_12 = new JTextField();
		registroEstudiante.add(textField_12, "cell 2 9,growx");
		textField_12.setColumns(10);
		
		JButton btnRegistrarse = new JButton("Registrar");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registroEstudiante.add(btnRegistrarse, "cell 3 10");
		
		JPanel registroColega = new JPanel();
		contentPane.add(registroColega, "name_442084621359804");
		registroColega.setLayout(new MigLayout("", "[][226.00][grow][]", "[][][][][][][][][][]"));
		
		JButton btnVolver_3 = new JButton("Volver");
		registroColega.add(btnVolver_3, "flowx,cell 0 0");
		
		JLabel lblRegistroDeFamiliar = new JLabel("Registro de familiar");
		registroColega.add(lblRegistroDeFamiliar, "cell 0 0");
		
		JLabel lblNombre_2 = new JLabel("Nombre:");
		registroColega.add(lblNombre_2, "cell 1 1,alignx right");
		
		textField_13 = new JTextField();
		registroColega.add(textField_13, "cell 2 1,growx");
		textField_13.setColumns(10);
		
		JLabel lblPrimerApellido_2 = new JLabel("Primer apellido:");
		registroColega.add(lblPrimerApellido_2, "cell 1 2,alignx right");
		
		textField_14 = new JTextField();
		registroColega.add(textField_14, "cell 2 2,growx");
		textField_14.setColumns(10);
		
		JLabel lblSegundoApellido_2 = new JLabel("Segundo apellido:");
		registroColega.add(lblSegundoApellido_2, "cell 1 3,alignx right");
		
		textField_16 = new JTextField();
		registroColega.add(textField_16, "cell 2 3,growx");
		textField_16.setColumns(10);
		
		JLabel lblTelfono_1 = new JLabel("Teléfono:");
		registroColega.add(lblTelfono_1, "cell 1 5,alignx right");
		
		textField_15 = new JTextField();
		registroColega.add(textField_15, "cell 2 5,growx");
		textField_15.setColumns(10);
		
		JLabel lblCorreoElectrnico_2 = new JLabel("Correo electrónico:");
		registroColega.add(lblCorreoElectrnico_2, "cell 1 6,alignx right");
		
		textField_17 = new JTextField();
		registroColega.add(textField_17, "cell 2 6,growx");
		textField_17.setColumns(10);
		
		JLabel lblParentezco = new JLabel("Puesto:");
		registroColega.add(lblParentezco, "cell 1 8,alignx right");
		
		textField_18 = new JTextField();
		registroColega.add(textField_18, "cell 2 8,growx");
		textField_18.setColumns(10);
		
		JButton btnRegistrar_1 = new JButton("Registrar");
		registroColega.add(btnRegistrar_1, "cell 3 9");
	}
	
	

}
