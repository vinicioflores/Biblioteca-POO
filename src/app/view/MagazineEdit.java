package app.view;

import javax.swing.JPanel;

import app.model.Revista;
import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;

public class MagazineEdit extends JPanel{
	
	private Revista magazine;
	private JTextField nameTextField;
	private JTextField pubPerTextField;
	private JTextField themeTextField;
	
	public MagazineEdit(){
		setLayout(new MigLayout("", "[][][335.00,grow][]", "[][][][][][][][][][]"));
		
		JButton btnBack = new JButton("Back");
		add(btnBack, "flowx,cell 0 0");
		
		JLabel lblMagazineEditing = new JLabel("Magazine Editing");
		add(lblMagazineEditing, "cell 0 0");
		
		JLabel lblName = new JLabel("Name:");
		add(lblName, "cell 1 1,alignx trailing");
		
		nameTextField = new JTextField(magazine.getNombre());
		add(nameTextField, "cell 2 1,growx");
		nameTextField.setColumns(10);
		
		JLabel lblPubPer = new JLabel("Publication Period:");
		add(lblPubPer, "cell 1 2,alignx trailing");
		
		pubPerTextField = new JTextField(magazine.getPeriodoPublicacion());
		add(pubPerTextField, "cell 2 2,growx");
		pubPerTextField.setColumns(10);
		
		JLabel lblTheme = new JLabel("Theme:");
		add(lblTheme, "cell 1 3,alignx trailing");
		
		themeTextField = new JTextField(magazine.getTematica());
		add(themeTextField, "cell 2 3,growx");
		themeTextField.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating:");
		add(lblRating, "cell 1 5,alignx right");
		
		JSpinner magazineRatingSpinner = new JSpinner();
		magazineRatingSpinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		add(magazineRatingSpinner, "cell 2 5");
		
		JLabel lblImage = new JLabel("Image:");
		add(lblImage, "cell 1 6,alignx right");
		
		JLabel lblPicture = new JLabel();
		lblPicture.setIcon(new ImageIcon(MagazineEdit.class.getResource("/image/"+magazine.getNombre()+".png")));
		add(lblPicture, "cell 2 6");
		
		JButton btnSearchImage = new JButton("Search Image");
		add(btnSearchImage, "cell 3 6,aligny bottom");
		
		JButton btnRegister = new JButton("Register");
		add(btnRegister, "cell 2 9");
	}
}