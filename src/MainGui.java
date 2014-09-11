/** 
 * En este archivo se encuentra la clase principal del programa de gesti�n bibliotecario Sarasvati. 
 *  Desde este m�dulo se corre todo el programa  
 *  
 *  **/

/** 
 *  @authors Vinicio Flores Hern�ndez
 *  		 Pedro Rodriguez de Oliveira
 *  		 Faubricio Forester Soto
 *  		 Roberto Chen Zheng
 */

import corepack.Material; 
import corepack.Registro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import java.awt.List;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Choice;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
public class MainGui {

	private JFrame frmBibliotecaAlejandrina;
	private final Action action = new SwingAction();
	private static MainGui window;
	
	private static Registro padron;
	private static Material material;
	private static int MAX_CLIENTS = 9000; 

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				System.out.println("Cargando sistema bibliotecario Sarasvati ...");
				
				padron 		= new Registro(MAX_CLIENTS);
				material 	= new Material();
				
				try {
					window = new MainGui();
					window.frmBibliotecaAlejandrina.setVisible(true);
					window.frmBibliotecaAlejandrina.setTitle("Gestion Bibliotecario Sarasvati");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBibliotecaAlejandrina =  new JFrame();
		frmBibliotecaAlejandrina.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		frmBibliotecaAlejandrina.setTitle("Gesti�n Bibliotecaria Sarasvati");
		frmBibliotecaAlejandrina.setBackground(new Color(240, 240, 240));
		frmBibliotecaAlejandrina.setBounds(100, 100, 550, 500);
		frmBibliotecaAlejandrina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmBibliotecaAlejandrina.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmCargarRegistro = new JMenuItem("Cargar Registro");
		mntmCargarRegistro.setIcon(new ImageIcon(MainGui.class.getResource("/com/sun/java/swing/plaf/windows/icons/ListView.gif")));
		mnArchivo.add(mntmCargarRegistro);
		
		JMenuItem mntmCargarColeccion = new JMenuItem("Cargar coleccion");
		mntmCargarColeccion.setIcon(new ImageIcon(MainGui.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		mnArchivo.add(mntmCargarColeccion);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setAction(action);
		mntmSalir.setIcon(new ImageIcon(MainGui.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mnArchivo.add(mntmSalir);
		
		JMenu mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Nuevo cliente");
		mnRegistro.add(mntmNuevoCliente);
		
		JMenuItem mntmEliminarCliente = new JMenuItem("Eliminar cliente");
		mnRegistro.add(mntmEliminarCliente);
		
		JMenuItem mntmGuardarRegistroActual = new JMenuItem("Guardar registro actual");
		mnRegistro.add(mntmGuardarRegistroActual);
		
		JMenu mnColeccion = new JMenu("Coleccion");
		menuBar.add(mnColeccion);
		
		JMenuItem mntmNuevoLibro = new JMenuItem("Nuevo libro");
		mnColeccion.add(mntmNuevoLibro);
		
		JMenuItem mntmEliminarLibro = new JMenuItem("Eliminar libro");
		mnColeccion.add(mntmEliminarLibro);
		
		JMenuItem mntmGuardarColeccionActual = new JMenuItem("Guardar coleccion actual");
		mnColeccion.add(mntmGuardarColeccionActual);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de ...");
		mnAyuda.add(mntmAcercaDe);
		
		Panel panel = new Panel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frmBibliotecaAlejandrina.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Panel de Acciones ");
		panel.add(label);
		
		JToolBar toolBar = new JToolBar();
		panel.add(toolBar);
		
		JButton btnAbrirRegistroDe = new JButton("Abrir Registro de Usuarios");
		toolBar.add(btnAbrirRegistroDe);
		btnAbrirRegistroDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnAbrirColeccinBibliotecaria = new JButton("Abrir Colecci\u00F3n Bibliotecaria");
		toolBar.add(btnAbrirColeccinBibliotecaria);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;


		public SwingAction() {
			putValue(NAME, "Salir");
			putValue(SHORT_DESCRIPTION, "Cierra la aplicacion");
		}
		
		
		// Permite cerrar la aplicacion 
		public void actionPerformed(ActionEvent e) {
			try {
				window.frmBibliotecaAlejandrina.dispose();
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
