package app.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon(View.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		mnArchivo.add(mntmSalir);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel creditos = new JPanel();
		contentPane.add(creditos, "name_5917427800206");
		creditos.setLayout(new MigLayout("", "[356.00px][714.00px]", "[15px][][][][][][][][][][][][][]"));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(View.class.getResource("/image/logo.png")));
		creditos.add(label_1, "cell 0 0 2 1,alignx center,aligny top");
		
		JLabel lblCreadoressDelProyecto = new JLabel("Proyecto creado por:");
		creditos.add(lblCreadoressDelProyecto, "cell 0 1 2 1");
		
		JLabel lblRobertoChenZheng = new JLabel("Roberto Chen Zheng");
		creditos.add(lblRobertoChenZheng, "cell 1 2");
		
		JLabel lblVinicioFloresHernndez = new JLabel("Vinicio Flores Hernández");
		creditos.add(lblVinicioFloresHernndez, "cell 1 3");
		
		JLabel lblFaubricioForesterSoto = new JLabel("Faubricio Forester Soto");
		creditos.add(lblFaubricioForesterSoto, "cell 1 4");
		
		JLabel lblPedroRodrguezDe = new JLabel("Pedro Rodríguez de Oliveira");
		creditos.add(lblPedroRodrguezDe, "cell 1 5");
		
		JLabel lblCreadoraDelLogo = new JLabel("Creadora del logo:");
		creditos.add(lblCreadoraDelLogo, "cell 0 7");
		
		JButton btnVolverAlMen = new JButton("Volver a la ventana principal");
		btnVolverAlMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblDayanMndezSalas = new JLabel("Dayana Méndez Salas");
		creditos.add(lblDayanMndezSalas, "cell 1 8");
		
		JLabel lblVersin = new JLabel("Versión:");
		creditos.add(lblVersin, "cell 0 10");
		
		JLabel label_2 = new JLabel("0.5");
		creditos.add(label_2, "cell 1 11");
		creditos.add(btnVolverAlMen, "cell 1 13,alignx right");
		
		JPanel inicio = new JPanel();
		inicio.setBackground(new Color(255, 255, 255));
		contentPane.add(inicio, "name_268387601552984");
		inicio.setLayout(new MigLayout("", "[][140.00,grow][46.00][349.00,grow][right]", "[][][grow][][grow][][grow]"));
		
		JPanel Opciones = new JPanel();
		Opciones.setBackground(new Color(255, 255, 255));
		inicio.add(Opciones, "cell 0 0 1 7,grow");
		Opciones.setLayout(new MigLayout("", "[100px][][][]", "[][][][][][][][]"));
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(View.class.getResource("/image/magnifier13.png")));
		Opciones.add(button_1, "flowy,cell 0 0");
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(View.class.getResource("/image/add70.png")));
		Opciones.add(button, "cell 0 0");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(View.class.getResource("/image/new10.png")));
		Opciones.add(btnNewButton, "cell 0 1");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(View.class.getResource("/image/three115.png")));
		Opciones.add(btnNewButton_1, "cell 0 2");
		
		JButton btnManual = new JButton("Manual");
		Opciones.add(btnManual, "cell 0 6,alignx center");
		
		JButton btnCrditos = new JButton("Créditos");
		Opciones.add(btnCrditos, "cell 0 7,alignx center");
		
		JLabel lblMisPertenencias = new JLabel("Mis Pertenencias");
		lblMisPertenencias.setFont(new Font("Consolas", Font.BOLD, 30));
		inicio.add(lblMisPertenencias, "cell 1 0 3 1");
		
		JLabel lblTodas = new JLabel("Todas");
		lblTodas.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblTodas, "cell 1 1");
		
		JLabel label = new JLabel("Total:");
		label.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(label, "cell 2 1");
		
		JLabel totalAll = new JLabel("Blank");
		totalAll.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(totalAll, "cell 3 1");
		
		JPanel All = new JPanel();
		inicio.add(All, "cell 1 2 3 1,grow");
		
		JLabel lblPrestadas = new JLabel("Prestadas");
		lblPrestadas.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblPrestadas, "cell 1 3");
		
		JLabel TotalB = new JLabel("Total:");
		TotalB.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(TotalB, "cell 2 3");
		
		JLabel TotalBorrowed = new JLabel("Blank");
		TotalBorrowed.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(TotalBorrowed, "cell 3 3");
		
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
		registroFamiliar.setLayout(new MigLayout("", "[][][grow][]", "[][][][][][][][][][]"));
		
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
		registroColega.setLayout(new MigLayout("", "[][][grow][]", "[][][][][][][][][][]"));
		
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
