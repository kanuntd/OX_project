import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JTextField txtpassword;
	public connectMongoDB con;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtusername = new JTextField();
		txtusername.setBounds(207, 155, 211, 20);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(207, 202, 211, 20);
		contentPane.add(txtpassword);
		txtpassword.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(86, 158, 81, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(86, 205, 93, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					con = new connectMongoDB();
					if (con.QueryUser(txtusername.getText()) > 0) {
						 
					     Lobby  lobby = new Lobby();
					     lobby.main(null);
					     setVisible(false);
					} else {
						
					}
				}catch(Exception x){
					
				}
				
			}
		});
		btnNewButton.setBounds(329, 282, 89, 23);
		contentPane.add(btnNewButton);
	}
}
