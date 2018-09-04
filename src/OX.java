import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OX {

	private JFrame frame;
	private JTextField txtnickname;
	private JTextField txtrepassword;
	private JTextField txtpassword;
	private JTextField txtusername;
	public connectMongoDB con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OX window = new OX();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OX() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setMaximumSize(new Dimension(1024, 720));
		frame.setBounds(100, 100, 1011, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel register = new JPanel();
		register.setBackground(new Color(189, 183, 107));
		register.setBounds(0, 0, 1015, 685);
		frame.getContentPane().add(register);
		register.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("REGISTER");
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(573, 91, 238, 68);
		register.add(lblNewLabel_1);

		JLabel lblNickname = new JLabel("Nickname  ");
		lblNickname.setForeground(new Color(205, 133, 63));
		lblNickname.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNickname.setBounds(446, 156, 183, 61);
		register.add(lblNickname);

		JLabel lblUsername = new JLabel("Username       ");
		lblUsername.setForeground(new Color(205, 133, 63));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblUsername.setBounds(446, 210, 244, 61);
		register.add(lblUsername);

		JLabel lblPassword = new JLabel("Password  ");
		lblPassword.setForeground(new Color(205, 133, 63));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblPassword.setBounds(446, 264, 223, 61);
		register.add(lblPassword);

		JLabel lblRepassword = new JLabel("Re-password ");
		lblRepassword.setForeground(new Color(205, 133, 63));
		lblRepassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblRepassword.setBounds(446, 318, 244, 61);
		register.add(lblRepassword);

		txtnickname = new JTextField();
		txtnickname.setFont(new Font("Angsana New", Font.BOLD, 30));
		txtnickname.setForeground(new Color(205, 133, 63));
		txtnickname.setBounds(681, 172, 244, 41);
		register.add(txtnickname);
		txtnickname.setColumns(10);

		txtrepassword = new JTextField();
		txtrepassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		txtrepassword.setForeground(new Color(205, 133, 63));
		txtrepassword.setColumns(10);
		txtrepassword.setBounds(681, 334, 244, 41);
		register.add(txtrepassword);

		txtpassword = new JTextField();
		txtpassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		txtpassword.setForeground(new Color(205, 133, 63));
		txtpassword.setColumns(10);
		txtpassword.setBounds(681, 280, 244, 41);
		register.add(txtpassword);

		txtusername = new JTextField();
		txtusername.setFont(new Font("Angsana New", Font.BOLD, 30));
		txtusername.setForeground(new Color(205, 133, 63));
		txtusername.setColumns(10);
		txtusername.setBounds(681, 226, 244, 41);
		register.add(txtusername);

		JLabel register_photo = new JLabel("");
		register_photo.setIcon(new ImageIcon(OX.class.getResource("/photo/profile.png")));
		register_photo.setBackground(new Color(210, 180, 140));
		register_photo.setBounds(535, 392, 140, 94);
		register.add(register_photo);

		JButton btnNewButton = new JButton("Select photo");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		btnNewButton.setBounds(712, 421, 140, 34);
		register.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

				
						con = new connectMongoDB();
						if (con.QueryUser(txtusername.getText()) > 0) {
							JOptionPane.showMessageDialog(frame, "This user is not available.");
						} else {
							if (txtpassword.getText().equals(txtrepassword.getText())) {
								con.input(txtusername.getText(), txtpassword.getText());
							} else {
								JOptionPane.showMessageDialog(frame, "password is incorrect.");
							}

						}
					

				} catch (Exception s) {

					JOptionPane.showMessageDialog(frame, s);
				}

			}
		});
		btnNewButton_1.setBackground(new Color(205, 133, 63));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		btnNewButton_1.setBounds(598, 510, 192, 54);
		register.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OX.class.getResource("/photo/home.png")));
		lblNewLabel.setBounds(26, 24, 61, 54);
		register.add(lblNewLabel);

		JLabel register_Background = new JLabel("New label");
		register_Background.setIcon(new ImageIcon(OX.class.getResource("/photo/back.png")));
		register_Background.setBounds(0, 0, 1003, 672);
		register.add(register_Background);
	}
}
