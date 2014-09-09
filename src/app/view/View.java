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
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel inicio = new JPanel();
		inicio.setBackground(new Color(255, 255, 255));
		contentPane.add(inicio, "name_268387601552984");
		inicio.setLayout(new MigLayout("", "[][140.00,grow][46.00][349.00,grow][right]", "[][][grow][][grow][][grow]"));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		inicio.add(panel_4, "cell 0 0 1 7,grow");
		panel_4.setLayout(new MigLayout("", "[100px][][][]", "[][][]"));
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(View.class.getResource("/image/magnifier13.png")));
		panel_4.add(button_1, "flowy,cell 0 0");
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(View.class.getResource("/image/add70.png")));
		panel_4.add(button, "cell 0 0");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(View.class.getResource("/image/new10.png")));
		panel_4.add(btnNewButton, "cell 0 1");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(View.class.getResource("/image/three115.png")));
		panel_4.add(btnNewButton_1, "cell 0 2");
		
		JLabel lblMisPertenencias = new JLabel("Mis Pertenencias");
		lblMisPertenencias.setFont(new Font("Consolas", Font.BOLD, 30));
		inicio.add(lblMisPertenencias, "cell 1 0 3 1");
		
		JLabel lblTodas = new JLabel("Todas");
		inicio.add(lblTodas, "cell 1 1");
		
		JPanel panel_1 = new JPanel();
		inicio.add(panel_1, "cell 1 2 3 1,grow");
		
		JLabel lblPrestadas = new JLabel("Prestadas");
		lblPrestadas.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblPrestadas, "cell 1 3");
		
		JLabel lblTotal_1 = new JLabel("Total:");
		lblTotal_1.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblTotal_1, "cell 2 3");
		
		JLabel lblBlank_1 = new JLabel("Blank");
		lblBlank_1.setFont(new Font("Consolas", Font.ITALIC, 18));
		inicio.add(lblBlank_1, "cell 3 3");
		
		JPanel panel_3 = new JPanel();
		inicio.add(panel_3, "cell 1 4 3 1,grow");
		
		JLabel lblTop = new JLabel("Top");
		lblTop.setFont(new Font("Consolas", Font.PLAIN, 21));
		inicio.add(lblTop, "cell 1 5");
		
		JPanel panel_2 = new JPanel();
		inicio.add(panel_2, "cell 1 6 3 1,grow");
		
		JPanel registroPrestatario = new JPanel();
		contentPane.add(registroPrestatario, "name_440112681124098");
		registroPrestatario.setLayout(new MigLayout("", "[grow]", "[][][][][]"));
		
		JLabel lblRegistroDeNuevo = new JLabel("Registro de nuevo prestatario");
		registroPrestatario.add(lblRegistroDeNuevo, "cell 0 0");
		
		JLabel lblSeleccionesElijaLa = new JLabel("Seleccione la categoria de prestatario a crear");
		registroPrestatario.add(lblSeleccionesElijaLa, "cell 0 1");
		
		JButton btnFamiliar = new JButton("Familiar");
		btnFamiliar.setIcon(new ImageIcon(View.class.getResource("/image/family25.png")));
		registroPrestatario.add(btnFamiliar, "cell 0 2");
		
		JButton btnColega = new JButton("Colega");
		btnColega.setIcon(new ImageIcon(View.class.getResource("/image/business53.png")));
		registroPrestatario.add(btnColega, "cell 0 3");
		
		JButton btnEstudiante = new JButton("Estudiante");
		btnEstudiante.setIcon(new ImageIcon(View.class.getResource("/image/graduate9.png")));
		registroPrestatario.add(btnEstudiante, "cell 0 4");
		
		JPanel registroFamiliar = new JPanel();
		contentPane.add(registroFamiliar, "name_442060658397681");
		
		JPanel registroEstudiante = new JPanel();
		contentPane.add(registroEstudiante, "name_442145250348966");
		
		JPanel registroColega = new JPanel();
		contentPane.add(registroColega, "name_442084621359804");
	}

}
