package app.view;

import javax.swing.JPanel;    

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import app.model.Familiar;

public class RelativeItem extends JPanel{
	
	private Familiar relative;
	private JButton btnEdit;
	private JButton btnDelete;
	private JLabel lblName;
	private JLabel lblKinship;
	private JLabel lblFirstLastName;
	private JLabel lblSecondLastName;
	private JLabel lblPhone;
	private JLabel lblEmailAdress;
	private JLabel lblGetFLN;
	private JLabel lblGetSLN;
	private JLabel lblGetPhone;
	private JLabel lblGetEmail;
	private JLabel lblGetKinship;

	/**
	 * Create the panel.
	 */
	public RelativeItem(Familiar relative) {
		this.relative = relative;
		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][][][]"));
		
		lblName = new JLabel(relative.getNombre());
		lblName.setFont(new Font("Consolas", Font.PLAIN, 28));
		add(lblName, "cell 1 0 3 1");
		
		btnEdit = new JButton("Edit");
		add(btnEdit, "flowy,cell 8 0");
		
		lblFirstLastName = new JLabel("First Last Name:");
		add(lblFirstLastName, "cell 2 1");
		
		btnDelete = new JButton("Delete");
		add(btnDelete, "cell 8 0");
		
		lblGetFLN = new JLabel(relative.getPrimerApellido());
		add(lblGetFLN, "cell 3 1");
		
		lblSecondLastName = new JLabel("Second Last Name:");
		add(lblSecondLastName, "cell 2 2");
		
		lblGetSLN = new JLabel(relative.getSegundoApellido());
		add(lblGetSLN, "cell 3 2");
		
		lblPhone = new JLabel("Phone:");
		add(lblPhone, "cell 2 3");
		
		lblGetPhone = new JLabel(relative.getTelefono());
		add(lblGetPhone, "cell 3 3");
		
		lblEmailAdress = new JLabel("Email address:");
		add(lblEmailAdress, "cell 2 4");
		
		lblGetEmail = new JLabel(relative.getCorreoE());
		add(lblGetEmail, "cell 3 4");
		
		lblKinship = new JLabel("Kinship:");
		add(lblKinship, "cell 2 5");
		
		lblGetKinship = new JLabel(relative.getParentesco());
		add(lblGetKinship, "cell 3 5");
	}
}
