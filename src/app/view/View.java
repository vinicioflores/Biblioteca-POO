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

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 524);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel inicio = new JPanel();
		inicio.setBackground(new Color(255, 255, 255));
		contentPane.add(inicio, "name_268387601552984");
		inicio.setLayout(new MigLayout("", "[][140.00,grow][46.00][349.00,grow][right]", "[][][grow][][grow][][grow]"));
		
		JPanel Opciones = new JPanel();
		Opciones.setBackground(new Color(255, 255, 255));
		inicio.add(Opciones, "cell 0 0 1 7,grow");
		Opciones.setLayout(new MigLayout("", "[100px][][][]", "[][][]"));
		
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
		
		JLabel lblMisPertenencias = new JLabel("Mis Pertenencias");
		lblMisPertenencias.setFont(new Font("Consolas", Font.BOLD, 30));
		inicio.add(lblMisPertenencias, "cell 1 0 3 1");
		
		JLabel lblTodas = new JLabel("Todas");
		inicio.add(lblTodas, "cell 1 1");
		
		JPanel All = new JPanel();
		inicio.add(All, "cell 1 2 3 1,grow");
		
		JLabel lblPrestadas = new JLabel("Prestadas");
		lblPrestadas.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblPrestadas, "cell 1 3");
		
		JLabel lblTotal_1 = new JLabel("Total:");
		lblTotal_1.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblTotal_1, "cell 2 3");
		
		JLabel lblBlank_1 = new JLabel("Blank");
		lblBlank_1.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblBlank_1, "cell 3 3");
		
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
		
		JPanel registroEstudiante = new JPanel();
		contentPane.add(registroEstudiante, "name_442145250348966");
		
		JPanel registroColega = new JPanel();
		contentPane.add(registroColega, "name_442084621359804");
	}

}
