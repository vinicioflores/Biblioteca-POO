package app.view;

import javax.swing.JPanel;

import app.model.Familiar;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RelativeEdit extends JPanel{

	private Familiar relative;
	private JTextField nameAttributeField;
	private JTextField firstLastNameField;
	private JTextField secondLastNameField;
	private JTextField phoneField;
	private JTextField mailField;
	private JTextField kinshipField;
		
	public RelativeEdit(Familiar relative){
		this.relative = relative;
		setLayout(new MigLayout("", "[236.00][][grow]", "[][][][][][][][][][][]"));
			
		JButton btnBack = new JButton("Back");
		add(btnBack, "flowx,cell 0 0");
		
		JLabel lblEditBookInformation = new JLabel("Edit Book Information");
		add(lblEditBookInformation, "cell 0 0");
		
		JLabel lblName = new JLabel("Name:");
		add(lblName, "cell 1 1,alignx trailing");
		
		nameAttributeField = new JTextField(relative.getNombre());
		add(nameAttributeField, "cell 2 1,growx");
		nameAttributeField.setColumns(10);
		
		JLabel lblFirstLastName = new JLabel("First Last Name:");
		add(lblFirstLastName, "cell 1 2,alignx trailing");
		
		firstLastNameField = new JTextField(relative.getPrimerApellido());
		add(firstLastNameField, "cell 2 2,growx");
		firstLastNameField.setColumns(10);
		
		JLabel lblSecondLastName = new JLabel("Second Last Name:");
		add(lblSecondLastName, "cell 1 3,alignx trailing");
		
		secondLastNameField = new JTextField(relative.getSegundoApellido());
		add(secondLastNameField, "cell 2 3,growx");
		secondLastNameField.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		add(lblPhoneNumber, "cell 1 5,alignx trailing");
		
		phoneField = new JTextField(relative.getTelefono());
		add(phoneField, "cell 2 5,growx");
		phoneField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		add(lblEmail, "cell 1 6,alignx trailing");
		
		mailField = new JTextField(relative.getCorreoE());
		add(mailField, "cell 2 6,growx");
		mailField.setColumns(10);
		
		JLabel lblKinsip = new JLabel("Kinship:");
		add(lblKinsip, "cell 1 8,alignx trailing");
		
		kinshipField = new JTextField(relative.getParentesco());
		add(kinshipField, "cell 2 8,growx");
		kinshipField.setColumns(10);
		
		JButton btnChange = new JButton("Change");
		add(btnChange, "cell 2 10,alignx right");
	}
}