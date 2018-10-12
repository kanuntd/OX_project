import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class listfriend extends JPanel {

	/**
	 * Create the panel.
	 */

	JPanel a = new JPanel();
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel label;
	
	public listfriend() {
		setLayout(null);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(10, 11, 100, 40);
		a.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		a.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(139, 11, 100, 40);
		a.add(lblNewLabel_1);
		
		label = new JLabel("\"      \"");
		a.add(label);
		
		btnNewButton = new JButton("Join");
		a.add(btnNewButton);

	}
	 JPanel v() {
		return a;
		 
	}
	 public void setlabel( ImageIcon m) {
		   this.lblNewLabel.setIcon(m);
		   
	  
	 }
	 public void setlabelUser(String txt) {
		 this.lblNewLabel_1.setText(txt);
	 }
}
