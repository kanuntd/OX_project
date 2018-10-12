import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Lobby extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public connectMongoDB con;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lobby frame = new Lobby();
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
	public Lobby() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panellist = new JPanel();
		panellist.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panellist.setBounds(466, 57, 350, 410);
		JPanel gui = new JPanel(new BorderLayout(3,3));
        final JPanel panel = new JPanel(new GridLayout(0,1));
        final JScrollPane scroll = new JScrollPane(panel);
        scroll.setPreferredSize(new Dimension(350,400));
        gui.add(scroll, BorderLayout.CENTER);
                con =new connectMongoDB();
                int count = con.QueryListfriend();
                con = new connectMongoDB();
			    
                
			    
                for(int i =0;i<count;i++) {
                int counter = 0;
                ImageIcon image = new ImageIcon("C:\\Users\\pop\\Desktop\\OXgame\\OX_project-master\\src\\picplayer\\10.png");
                Image images = image.getImage(); 
                Image newimg = images.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                image = new ImageIcon(newimg);
              
                listfriend s = new listfriend();
                s.setlabel(image); 
                String user = con.QueryListfriendString();
                s.setlabelUser(user);
                panel.add(s.a);              
                panel.revalidate();
                int height = (int)panel.getPreferredSize().getHeight();
                scroll.getVerticalScrollBar().setValue(height);
               }
		
        panellist.add(gui);
		contentPane.add(panellist);
		
		textField = new JTextField();
		textField.setBounds(466, 26, 312, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(727, 492, 89, 23);
		contentPane.add(btnLogout);
		
		JButton btnScored = new JButton("Score");
		btnScored.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnScored.setBounds(626, 492, 89, 23);
		contentPane.add(btnScored);
		
		JLabel img = new JLabel("New label");
	 
		contentPane.add(img);
	}
	 private Image getScaledImage(Image srcImg, int w, int h){
	        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2 = resizedImg.createGraphics();

	        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	        g2.drawImage(srcImg, 0, 0, w, h, null);
	        g2.dispose();

	        return resizedImg;
	   }
}
