package app.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BookItem extends JPanel {
	private JLabel lblImage;
	private JLabel lblName;
	private JLabel lblAuthor;
	private JLabel lblAnthonyBurgess;
	private JLabel lblEditorial;
	private JLabel lblPenguin;
	private JLabel label;
	private JLabel lblEdition;
	private JLabel lblrd;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton btnEdit;

	/**
	 * Create the panel.
	 */
	public BookItem() {

		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][][][]"));
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\Faubricio\\Downloads\\Clockwork_orange.jpg"));
		add(lblImage, "flowy,cell 0 0 1 9");
		
		lblName = new JLabel("Clockwork Orange");
		lblName.setFont(new Font("Consolas", Font.PLAIN, 28));
		add(lblName, "cell 1 0 3 1");
		
		btnNewButton = new JButton("Lend");
		add(btnNewButton, "flowy,cell 8 0");
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Faubricio\\Downloads\\star5.png"));
		add(label, "cell 2 1 2 1,alignx left");
		
		lblAuthor = new JLabel("Author:");
		add(lblAuthor, "cell 2 2");
		
		lblAnthonyBurgess = new JLabel("Anthony Burgess");
		add(lblAnthonyBurgess, "cell 3 2");
		
		lblEditorial = new JLabel("Editorial:");
		add(lblEditorial, "cell 2 3");
		
		lblPenguin = new JLabel("Penguin");
		add(lblPenguin, "cell 3 3");
		
		lblEdition = new JLabel("Edition:");
		add(lblEdition, "cell 2 4");
		
		lblrd = new JLabel("3rd");
		add(lblrd, "cell 3 4");
		
		lblNewLabel = new JLabel("Borrower:");
		add(lblNewLabel, "cell 2 6");
		
		btnEdit = new JButton("Edit");
		add(btnEdit, "cell 8 0");
	}

}
