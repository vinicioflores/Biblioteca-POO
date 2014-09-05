package app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

public class MainWindow {

	private JFrame MainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame = new JFrame();
		MainFrame.setBounds(100, 100, 536, 374);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Inicio = new JPanel();
		MainFrame.getContentPane().add(Inicio, "name_8974685623024");
		
		JPanel MisLibros = new JPanel();
		MainFrame.getContentPane().add(MisLibros, "name_9009943286593");
		GridBagLayout gbl_MisLibros = new GridBagLayout();
		gbl_MisLibros.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_MisLibros.rowHeights = new int[]{0, 0, 0};
		gbl_MisLibros.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_MisLibros.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		MisLibros.setLayout(gbl_MisLibros);
		
		JLabel lblMisLibros = new JLabel("Mis Libros");
		lblMisLibros.setFont(new Font("Consolas", Font.PLAIN, 27));
		GridBagConstraints gbc_lblMisLibros = new GridBagConstraints();
		gbc_lblMisLibros.anchor = GridBagConstraints.WEST;
		gbc_lblMisLibros.insets = new Insets(0, 0, 5, 5);
		gbc_lblMisLibros.gridx = 0;
		gbc_lblMisLibros.gridy = 0;
		MisLibros.add(lblMisLibros, gbc_lblMisLibros);
		
		JLabel lblTotal = new JLabel("total:");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 1;
		gbc_lblTotal.gridy = 0;
		MisLibros.add(lblTotal, gbc_lblTotal);
		
		JLabel totalM = new JLabel("\r\n");
		GridBagConstraints gbc_totalM = new GridBagConstraints();
		gbc_totalM.insets = new Insets(0, 0, 5, 5);
		gbc_totalM.anchor = GridBagConstraints.EAST;
		gbc_totalM.gridx = 2;
		gbc_totalM.gridy = 0;
		MisLibros.add(totalM, gbc_totalM);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		MisLibros.add(panel, gbc_panel);
		
		JPanel LibrosPrestados = new JPanel();
		MainFrame.getContentPane().add(LibrosPrestados, "name_12933488050049");
		GridBagLayout gbl_LibrosPrestados = new GridBagLayout();
		gbl_LibrosPrestados.columnWidths = new int[]{387, 0, 0, 0, 0, 0};
		gbl_LibrosPrestados.rowHeights = new int[]{0, 0, 0};
		gbl_LibrosPrestados.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_LibrosPrestados.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		LibrosPrestados.setLayout(gbl_LibrosPrestados);
		
		JLabel lblLibrosPrestados = new JLabel("Libros prestados");
		lblLibrosPrestados.setFont(new Font("Consolas", Font.PLAIN, 27));
		GridBagConstraints gbc_lblLibrosPrestados = new GridBagConstraints();
		gbc_lblLibrosPrestados.anchor = GridBagConstraints.WEST;
		gbc_lblLibrosPrestados.insets = new Insets(0, 0, 5, 5);
		gbc_lblLibrosPrestados.gridx = 0;
		gbc_lblLibrosPrestados.gridy = 0;
		LibrosPrestados.add(lblLibrosPrestados, gbc_lblLibrosPrestados);
		
		JLabel lblTotal_1 = new JLabel("total:");
		GridBagConstraints gbc_lblTotal_1 = new GridBagConstraints();
		gbc_lblTotal_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal_1.gridx = 1;
		gbc_lblTotal_1.gridy = 0;
		LibrosPrestados.add(lblTotal_1, gbc_lblTotal_1);
		
		JLabel lblTotalm = new JLabel("");
		GridBagConstraints gbc_lblTotalm = new GridBagConstraints();
		gbc_lblTotalm.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalm.gridx = 2;
		gbc_lblTotalm.gridy = 0;
		LibrosPrestados.add(lblTotalm, gbc_lblTotalm);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 5;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		LibrosPrestados.add(panel_1, gbc_panel_1);
	}

}
