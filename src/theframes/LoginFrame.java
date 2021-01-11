package theframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtIdbookauthor;
	private JPasswordField pwdPassword;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		Image img =new ImageIcon(this.getClass().getResource("/laibraryimage.jpg")).getImage().getScaledInstance(247,395,Image.SCALE_DEFAULT);
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 270, 395);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(405, 11, 77, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Back! Please login into your");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(405, 38, 232, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("account");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(405, 54, 77, 31);
		contentPane.add(lblNewLabel_3);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.BLUE);
		txtUsername.setFont(new Font("Mongolian Baiti", Font.ITALIC, 10));
		txtUsername.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		txtUsername.setText("UserName");
		txtUsername.setBounds(405, 96, 130, 23);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton LoginButton = new JButton("Login >");
		LoginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((txtUsername.getText().equals("username"))&&(pwdPassword.getText().equals("Mypass")))
				{
					adminmenus obj=new adminmenus();
					obj.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Entered password or username is incorrect");
				}
			}
		});
		LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LoginButton.setSize(new Dimension(3, 3));
		LoginButton.setBackground(new Color(65, 105, 225));
		LoginButton.setBorder(new LineBorder(new Color(65, 105, 225), 2));
		LoginButton.setForeground(Color.WHITE);
		LoginButton.setBounds(417, 195, 103, 23);
		contentPane.add(LoginButton);
		
		JLabel lblNewLabel_4 = new JLabel("....................................................................................................................................................................................\r\n");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setBounds(249, 219, 416, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox searchbycomboBox = new JComboBox();
		searchbycomboBox.setBorder(new LineBorder(new Color(65, 105, 225), 2));
		searchbycomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		searchbycomboBox.setBackground(new Color(65, 105, 225));
		searchbycomboBox.setForeground(Color.WHITE);
		searchbycomboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Author"}));
		searchbycomboBox.setToolTipText("ID\r\nName\r\nAuthor");
		searchbycomboBox.setBounds(405, 263, 115, 22);
		contentPane.add(searchbycomboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Search By");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBounds(334, 258, 61, 32);
		contentPane.add(lblNewLabel_5);
		
		txtIdbookauthor = new JTextField();
		txtIdbookauthor.setBorder(new LineBorder(new Color(171, 173, 179), 2, true));
		txtIdbookauthor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtIdbookauthor.setText("ID/BOOK/AUTHOR");
		txtIdbookauthor.setForeground(Color.BLUE);
		txtIdbookauthor.setBounds(405, 306, 130, 20);
		contentPane.add(txtIdbookauthor);
		txtIdbookauthor.setColumns(10);
		
		JButton SearchButton = new JButton("Search");
		SearchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtIdbookauthor.getText().trim().isEmpty()==true)
				{
					JOptionPane.showMessageDialog(contentPane, "Kindly input data in field first");
				}
				else
				{
					//add data into table
					searchbookjframe obj=new searchbookjframe();
					obj.setVisible(true);
					dispose();
				}
			}
		});
		SearchButton.setBorder(new LineBorder(new Color(65, 105, 225), 2));
		SearchButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		SearchButton.setBackground(new Color(65, 105, 225));
		SearchButton.setForeground(Color.WHITE);
		SearchButton.setBounds(417, 337, 103, 23);
		contentPane.add(SearchButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		Image img2 =new ImageIcon(this.getClass().getResource("/Picture1.png")).getImage().getScaledInstance(46,14,Image.SCALE_DEFAULT);
		lblNewLabel_6.setIcon(new ImageIcon(img2));
		lblNewLabel_6.setBounds(357, 86, 38, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		Image img3 =new ImageIcon(this.getClass().getResource("/Picture2.png")).getImage().getScaledInstance(46,14,Image.SCALE_DEFAULT);
		lblNewLabel_7.setIcon(new ImageIcon(img3));
		lblNewLabel_7.setBounds(357, 132, 47, 41);
		contentPane.add(lblNewLabel_7);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Text");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					pwdPassword.setEchoChar((char)0);
				}
				else
				{
					pwdPassword.setEchoChar(('*'));
				}
				
			}
		});
		chckbxNewCheckBox.setBounds(541, 141, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setToolTipText("");
		pwdPassword.setForeground(Color.BLUE);
		pwdPassword.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		pwdPassword.setBounds(405, 142, 130, 20);
		contentPane.add(pwdPassword);
		
	}
}
