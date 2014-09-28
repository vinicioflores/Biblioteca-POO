package app.view;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import app.model.Revista;

public class MagazineItem extends JPanel {
	
	Revista magazine;
	private JLabel lblImage;
	private JLabel lblName;
	private JLabel lblTheme;
	private JLabel lblGetTheme;
	private JLabel lblPubPer;
	private JLabel lblGetPubPer;
	private JLabel lblPicture;
	private JButton btnLendReturn;
	private JLabel lblBorrowerInfo;
	private JButton btnEdit;
	private JButton btnDelete;

	/**
	 * Create the panel.
	 */
	public MagazineItem(Revista magazine) {
		this.magazine = magazine;
		initialize();
	}
	private void initialize() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][][][]"));
		
		lblImage = new JLabel("");
		
		ImageIcon img = new ImageIcon(magazine.getImagen()); //Imagen nueva
        img = new ImageIcon(img.getImage().getScaledInstance(140, 145, Image.SCALE_DEFAULT)); //resize imagen
		
		lblImage.setIcon(img);
		add(lblImage, "flowy,cell 0 0 1 9");
		
		lblName = new JLabel(magazine.getNombre());
		lblName.setFont(new Font("Consolas", Font.PLAIN, 28));
		add(lblName, "cell 1 0 3 1");
		String action;
		if(magazine.isPrestado()){
			action = "Return";
		}else{
			action = "Lend";
		}
		btnLendReturn = new JButton(action);
		add(btnLendReturn, "flowy,cell 8 0");
		
		lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon(".\\src\\image\\star"+magazine.getCalificacion() +".png"));
		add(lblPicture, "cell 2 1 2 1,alignx left");
		
		lblTheme = new JLabel("Theme:");
		add(lblTheme, "cell 2 2");
		
		lblGetTheme = new JLabel(magazine.getTematica());
		add(lblGetTheme, "cell 3 2");
		
		lblPubPer = new JLabel("Publishing time:");
		add(lblPubPer, "cell 2 3");
		
		lblGetPubPer = new JLabel(magazine.getPeriodoPublicacion());
		add(lblGetPubPer, "cell 3 3");
				
		if (magazine.getPrestatario() != null){
			lblBorrowerInfo = new JLabel("Borrower:");
			add(lblBorrowerInfo, "cell 2 6");
		}
		
		btnEdit = new JButton("Edit");
		add(btnEdit, "cell 8 0");
		
		btnDelete = new JButton("Delete");
		add(btnDelete, "cell 8 0");
	}

}