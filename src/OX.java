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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class OX {

	private JFrame frame;
	private JTextField register_nickname;
	private JTextField register_repassword;
	private JTextField register_password;
	private JTextField register_username;
	private JPanel selectPic = new JPanel();
	private String register_idPic = "";
	public connectMongoDB con;
	private String pathimg ="";
	private JLabel btnpic1 = new JLabel("1");
	JLabel btnpic2 = new JLabel("2");
	JLabel btnpic3 = new JLabel("10");
	JLabel btnpic6 = new JLabel("6");
	JLabel btnpic4 = new JLabel("4");
	JLabel btnpic7 = new JLabel("7");
	JLabel btnpic8 = new JLabel("8");
	JLabel btnpic9 = new JLabel("9");
	JLabel btnpic5 = new JLabel("5");
	JLabel register_photo = new JLabel("");

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
		selectPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		selectPic.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0),
				new Color(0, 0, 0), new Color(0, 0, 0)));
		selectPic.setBackground(new Color(255, 230, 204));
		selectPic.setVisible(false);

		selectPic.setBounds(292, 67, 689, 322);
		register.add(selectPic);
		selectPic.setLayout(null);

		btnpic1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/1.png";
				
				btnpic1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});
		btnpic1.setIcon(new ImageIcon(OX.class.getResource("/picplayer/1.png")));
		btnpic1.setBackground(new Color(0, 0, 0));
		btnpic1.setBounds(10, 11, 115, 123);
		selectPic.add(btnpic1);

		JButton btnNewButton = new JButton("Select");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selectPic.setVisible(false);
				register_nickname.setVisible(true);
				register_username.setVisible(true);
				register_password.setVisible(true);
				register_repassword.setVisible(true);
				register_photo.setIcon(new ImageIcon(OX.class.getResource(register_idPic)));
			}
		});
		btnNewButton.setBackground(new Color(153, 102, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		btnNewButton.setBounds(564, 216, 108, 31);
		selectPic.add(btnNewButton);
		btnpic2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/2.png";
				
				btnpic2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic1.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic2.setIcon(new ImageIcon(OX.class.getResource("/picplayer/2.png")));
		btnpic2.setBounds(147, 11, 115, 123);
		selectPic.add(btnpic2);
		btnpic3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/10.png";
				btnpic3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic1.setBorder(null);
				btnpic4.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic3.setIcon(new ImageIcon(OX.class.getResource("/picplayer/10.png")));
		btnpic3.setBounds(282, 11, 115, 123);
		selectPic.add(btnpic3);
		btnpic6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/6.png";
				btnpic6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic5.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic6.setIcon(new ImageIcon(OX.class.getResource("/picplayer/6.png")));
		btnpic6.setBounds(10, 173, 115, 123);
		selectPic.add(btnpic6);
		btnpic4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/4.png";
				btnpic4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic1.setBorder(null);
				btnpic5.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic4.setIcon(new ImageIcon(OX.class.getResource("/picplayer/4.png")));
		btnpic4.setBounds(419, 11, 115, 123);
		selectPic.add(btnpic4);
		btnpic7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/7.png";
				btnpic7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic5.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic7.setIcon(new ImageIcon(OX.class.getResource("/picplayer/7.png")));
		btnpic7.setBounds(147, 173, 115, 123);
		selectPic.add(btnpic7);
		btnpic8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/8.png";
				btnpic8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic5.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic8.setIcon(new ImageIcon(OX.class.getResource("/picplayer/8.png")));
		btnpic8.setBounds(282, 173, 115, 123);
		selectPic.add(btnpic8);
		btnpic9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/9.png";
				btnpic9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic5.setBorder(null);
			}
		});

		btnpic9.setIcon(new ImageIcon(OX.class.getResource("/picplayer/9.png")));
		btnpic9.setBounds(419, 173, 115, 123);
		selectPic.add(btnpic9);
		btnpic5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				register_idPic = "/picplayer/5.png";
				btnpic5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0),
						new Color(0, 0, 0), new Color(0, 0, 0)));
				btnpic2.setBorder(null);
				btnpic3.setBorder(null);
				btnpic4.setBorder(null);
				btnpic1.setBorder(null);
				btnpic6.setBorder(null);
				btnpic7.setBorder(null);
				btnpic8.setBorder(null);
				btnpic9.setBorder(null);
			}
		});

		btnpic5.setIcon(new ImageIcon(OX.class.getResource("/picplayer/5.png")));
		btnpic5.setBounds(564, 11, 115, 123);
		selectPic.add(btnpic5);

		JLabel lblNewLabel_1 = new JLabel("REGISTER");
		lblNewLabel_1.setBounds(573, 91, 238, 68);
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		register.add(lblNewLabel_1);

		JLabel lblNickname = new JLabel("Nickname  ");
		lblNickname.setBounds(446, 156, 183, 61);
		lblNickname.setForeground(new Color(205, 133, 63));
		lblNickname.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		register.add(lblNickname);

		JLabel lblUsername = new JLabel("Username       ");
		lblUsername.setBounds(446, 210, 244, 61);
		lblUsername.setForeground(new Color(205, 133, 63));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		register.add(lblUsername);

		JLabel lblPassword = new JLabel("Password  ");
		lblPassword.setBounds(446, 264, 223, 61);
		lblPassword.setForeground(new Color(205, 133, 63));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		register.add(lblPassword);

		JLabel lblRepassword = new JLabel("Re-password ");
		lblRepassword.setBounds(446, 318, 244, 61);
		lblRepassword.setForeground(new Color(205, 133, 63));
		lblRepassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		register.add(lblRepassword);

		register_nickname = new JTextField();
		register_nickname.setBounds(681, 172, 244, 41);
		register_nickname.setFont(new Font("Angsana New", Font.BOLD, 30));
		register_nickname.setForeground(new Color(205, 133, 63));
		register.add(register_nickname);
		register_nickname.setColumns(10);

		register_repassword = new JTextField();
		register_repassword.setBounds(681, 334, 244, 41);
		register_repassword.setFont(new Font("Angsana New", Font.BOLD, 30));
		register_repassword.setForeground(new Color(205, 133, 63));
		register_repassword.setColumns(10);
		register.add(register_repassword);

		register_password = new JTextField();
		register_password.setBounds(681, 280, 244, 41);
		register_password.setFont(new Font("Angsana New", Font.BOLD, 30));
		register_password.setForeground(new Color(205, 133, 63));
		register_password.setColumns(10);
		register.add(register_password);

		register_username = new JTextField();
		register_username.setBounds(681, 226, 244, 41);
		register_username.setFont(new Font("Angsana New", Font.BOLD, 30));
		register_username.setForeground(new Color(205, 133, 63));
		register_username.setColumns(10);
		register.add(register_username);

		register_photo.setBounds(535, 392, 134, 123);
		register_photo.setIcon(new ImageIcon(OX.class.getResource("/photo/profile.png")));
		register_photo.setBackground(new Color(210, 180, 140));
		register.add(register_photo);

		JButton btnSelectpic = new JButton("Select photo");
		btnSelectpic.setBounds(712, 421, 140, 34);
		btnSelectpic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selectPic.setVisible(true);
				if (selectPic.isVisible()) {
					register_nickname.setVisible(false);
					register_username.setVisible(false);
					register_password.setVisible(false);
					register_repassword.setVisible(false);
				} else {
					btnSelectpic.setVisible(true);
				}
			}
		});
		btnSelectpic.setBorderPainted(false);
		btnSelectpic.setBackground(new Color(255, 204, 153));
		btnSelectpic.setForeground(new Color(255, 255, 255));
		btnSelectpic.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		register.add(btnSelectpic);

		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setBounds(595, 526, 192, 54);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					con = new connectMongoDB();
					if (con.QueryUser(register_username.getText()) > 0) {
						JOptionPane.showMessageDialog(frame, "This user is not available.");
					} else {
						if (register_password.getText().equals(register_repassword.getText())) {
							
							con.input(register_username.getText(), register_password.getText(),"C:/Users/pop/Desktop/OXgame/OX_project-master/src/picplayer/1.png");
							JOptionPane.showMessageDialog(frame, "Register success!!");
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
		register.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Home home = new Home();
				home.main(null);
				frame.setVisible(false);
				
				
			}
		});
		lblNewLabel.setBounds(27, 24, 61, 54);
		lblNewLabel.setIcon(new ImageIcon(OX.class.getResource("/photo/home.png")));
		register.add(lblNewLabel);

		JLabel register_Background = new JLabel("New label");
		register_Background.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectPic.setVisible(false);
				register_nickname.setVisible(true);
				register_username.setVisible(true);
				register_password.setVisible(true);
				register_repassword.setVisible(true);
			}
		});
		register_Background.setBounds(0, 0, 1003, 672);
		register_Background.setIcon(new ImageIcon(OX.class.getResource("/photo/back.png")));
		register.add(register_Background);
	}
}
