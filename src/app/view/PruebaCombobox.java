package app.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


// Code taken from: "http://www.java2s.com/Code/Java/Swing-JFC/CustomComboBoxwithImage.htm"  12/09/14

public class PruebaCombobox extends JPanel {
	
	ImageIcon[] images;
	String[] stars = {"star0", "star1", "star2", "star3", "star4", "star5"};
	
	public PruebaCombobox() {
			
		images = new ImageIcon[stars.length];
        Integer[] intArray = new Integer[stars.length];
        for (int i = 0; i < stars.length; i++) {
            intArray[i] = new Integer(i);
            images[i] = new ImageIcon("src/image/" + stars[i] + ".png");
            if (images[i] != null) {
                images[i].setDescription(stars[i]);
            }
        }
        
        
        JComboBox comboBox = new JComboBox(intArray);
        ComboBoxRenderer renderer = new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(200, 30));
        comboBox.setRenderer(renderer);
        //comboBox.setMaximumRowCount(3);
        
        
        add(comboBox);
        
	}

	
	
	protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = PruebaCombobox.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
                return null;
        }
    }
	
	///////////////////////////////
	/*
	 private static void createAndShowGUI() {
	        //Make sure we have nice window decorations.
	        JFrame.setDefaultLookAndFeelDecorated(false);

	        //Create and set up the window.
	        JFrame frame = new JFrame("CustomComboBoxDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        JComponent newContentPane = new PruebaCombobox();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	*/
	///////////////////////////////
	
	//public static void main(String[] args) {
		
	//}
	
	class ComboBoxRenderer extends JLabel implements ListCellRenderer {
		private Font uhOhFont;

		public ComboBoxRenderer() {
			setOpaque(true);
			setHorizontalAlignment(CENTER);
			setVerticalAlignment(CENTER);
		}

/*
* This method finds the image and text corresponding
* to the selected value and returns the label, set up
* to display the text and image.
*/
		public Component getListCellRendererComponent(
                    	JList list,
                    	Object value,
                    	int index,
                    	boolean isSelected,
                    	boolean cellHasFocus) 
		{
//Get the selected index. (The index param isn't
//always valid, so just use the value.)
			int selectedIndex = ((Integer)value).intValue();

			if (isSelected) {
				setBackground(list.getSelectionBackground());
				setForeground(list.getSelectionForeground());
			} else {
				setBackground(list.getBackground());
				setForeground(list.getForeground());
			}

//Set the icon and text.  If icon was null, say so.
			ImageIcon icon = images[selectedIndex];
			String star = stars[selectedIndex];
			setIcon(icon);
			if (icon != null) {
				setFont(list.getFont());
			} else {
				setUhOhText(star + " (no image available)",
						list.getFont());
			}

			return this;
		}

//Set the font and text when no image was found.
		protected void setUhOhText(String uhOhText, Font normalFont) {
			if (uhOhFont == null) { //lazily create this font
				uhOhFont = normalFont.deriveFont(Font.ITALIC);
			}
			setFont(uhOhFont);
			setText(uhOhText);
		}
	}
	
}
