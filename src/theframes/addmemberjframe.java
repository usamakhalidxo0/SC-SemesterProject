package theframes;

import java.awt.BorderLayout;

import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class addmemberjframe extends JFrame {

	private JPanel contentPane;
	private JTextField MemberNamefield;
	private JTextField MemberEnrollmentfield;
	private JTextField MemberProgramfield;
	private JTextField MemberEmailfield;
	private JTextField MemberAdressfield;
	private JTextField MemberPhonefield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmemberjframe frame = new addmemberjframe();
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
	public addmemberjframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(21, 29, 223, 128);
		Image img1 =new ImageIcon(this.getClass().getResource("/adminhi.jpg")).getImage().getScaledInstance(223,128,Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(img1));
		JLabel deleteBookLabel = new JLabel("New label");
		deleteBookLabel.setBounds(2, 298, 70, 60);
		deleteBookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					deletebookjframe frame = new deletebookjframe();
					frame.setVisible(true);
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going there"+ex.getMessage());
			}
			}
		});
		Image img3 =new ImageIcon(this.getClass().getResource("/deletebookicon.jpg")).getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
		
		JButton logoutButton = new JButton("New button");
		logoutButton.setBounds(82, 399, 87, 33);
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going Back"+ex.getMessage());
				
			}
		}});
		Image img9 =new ImageIcon(this.getClass().getResource("/logouticon.jpg")).getImage().getScaledInstance(111,33,Image.SCALE_DEFAULT);
		contentPane.setLayout(null);
		logoutButton.setIcon(new ImageIcon(img9));
		contentPane.add(logoutButton);
		deleteBookLabel.setIcon(new ImageIcon(img3));
		contentPane.add(deleteBookLabel);
		
		JLabel AddmenberLabel = new JLabel("New label");
		AddmenberLabel.setBounds(162, 298, 70, 60);
		AddmenberLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					addmemberjframe frame = new addmemberjframe();
					frame.setVisible(true);
					dispose();
				
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going there"+ex.getMessage());
			}
			}
		});
		Image img4 =new ImageIcon(this.getClass().getResource("/addmembericon.jpg")).getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
		AddmenberLabel.setIcon(new ImageIcon(img4));
		contentPane.add(AddmenberLabel);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 259, 443);
		Image img2 =new ImageIcon(this.getClass().getResource("/menupicscolor.jpg")).getImage().getScaledInstance(259,443,Image.SCALE_DEFAULT);
		
		JLabel AddbookLabel = new JLabel("New label");
		AddbookLabel.setBounds(2, 219, 70, 60);
		AddbookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					AddBookJframe frame = new AddBookJframe();
					frame.setVisible(true);
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going there"+ex.getMessage());
			}
		}});
		Image img5 =new ImageIcon(this.getClass().getResource("/addbookicon.jpg")).getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
		AddbookLabel.setIcon(new ImageIcon(img5));
		contentPane.add(AddbookLabel);
		
		JLabel IssueBookLabel = new JLabel("New label");
		IssueBookLabel.setBounds(162, 219, 70, 60);
		IssueBookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					issuebookjframe frame = new issuebookjframe();
					frame.setVisible(true);
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going there"+ex.getMessage());
			}
			}
		});
		Image img6 =new ImageIcon(this.getClass().getResource("/issuebookicon.jpg")).getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
		IssueBookLabel.setIcon(new ImageIcon(img6));
		contentPane.add(IssueBookLabel);
		
		JLabel searchBookLabel = new JLabel("New label");
		searchBookLabel.setBounds(82, 219, 70, 60);
		searchBookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					adminsearchbookjframe frame = new adminsearchbookjframe();
					frame.setVisible(true);
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going there"+ex.getMessage());
			}
		}
			
		});
		Image img7 =new ImageIcon(this.getClass().getResource("/searchbookicon.jpg")).getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
		searchBookLabel.setIcon(new ImageIcon(img7));
		contentPane.add(searchBookLabel);
		
		JLabel returnBookLabel = new JLabel("New label");
		returnBookLabel.setBounds(82, 298, 70, 60);
		returnBookLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					returnbookjframe frame = new returnbookjframe();
					frame.setVisible(true);
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error While going there"+ex.getMessage());
			}
			}
		});
		Image img8 =new ImageIcon(this.getClass().getResource("/returnbookicon.jpg")).getImage().getScaledInstance(70,60,Image.SCALE_DEFAULT);
		returnBookLabel.setIcon(new ImageIcon(img8));
		contentPane.add(returnBookLabel);
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBackground(new Color(51, 51, 153));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADD MEMBER");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(456, 25, 172, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(409, 140, 103, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Enrollment");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(409, 185, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter Program");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(409, 219, 103, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Choose Category");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_6.setBounds(409, 76, 144, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter Email");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(409, 255, 103, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Adress");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(409, 298, 103, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Enter Phone");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(409, 340, 103, 14);
		contentPane.add(lblNewLabel_9);
		
		JButton Addmemberbutton = new JButton("ADD");
		Addmemberbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Member obj=new Member();
				
				
				obj.setEnrollement(MemberEnrollmentfield.getText().toString());
				obj.setName(MemberNamefield.getText().toString());
				obj.setProgram(MemberProgramfield.getText());
				obj.setEmail(MemberEmailfield.getText());
				obj.setAdress(MemberAdressfield.getText());
				obj.setPhoneNumber(MemberPhonefield.getText());
				
				
				
			}
		});
		Addmemberbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MemberNamefield.getText().trim().isEmpty()==true||MemberEnrollmentfield.getText().trim().isEmpty()==true||MemberProgramfield.getText().trim().isEmpty()||
						MemberEmailfield.getText().trim().isEmpty()==true||MemberAdressfield.getText().trim().isEmpty()==true||MemberPhonefield.getText().trim().isEmpty()==true)
				{
					JOptionPane.showMessageDialog(Addmemberbutton, "Kindly Enter All fields Data");
				}else
				{
					//add data to
					JOptionPane.showMessageDialog(Addmemberbutton, "Data succcessfully entered");
				}
			
			}
		});
		Addmemberbutton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		Addmemberbutton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Addmemberbutton.setBackground(new Color(25, 25, 112));
		Addmemberbutton.setForeground(new Color(255, 255, 255));
		Addmemberbutton.setBounds(675, 391, 89, 33);
		contentPane.add(Addmemberbutton);
		
		MemberNamefield = new JTextField();
		MemberNamefield.setBounds(563, 137, 143, 20);
		contentPane.add(MemberNamefield);
		MemberNamefield.setColumns(10);
		
		MemberEnrollmentfield = new JTextField();
		MemberEnrollmentfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String member_ID=MemberEnrollmentfield.getText();
				int member_IDlength=member_ID.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					if(member_IDlength<13)
					{
						MemberEnrollmentfield.setEditable(true);
					}
					else
					{
						MemberEnrollmentfield.setEditable(false);
					}
				}else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						MemberEnrollmentfield.setEditable(true);
					}else
					{
						MemberEnrollmentfield.setEditable(false);
					}
				}
			}
		});
		MemberEnrollmentfield.setBounds(563, 173, 143, 20);
		contentPane.add(MemberEnrollmentfield);
		MemberEnrollmentfield.setColumns(10);
		
		MemberProgramfield = new JTextField();
		MemberProgramfield.setBounds(563, 211, 143, 20);
		contentPane.add(MemberProgramfield);
		MemberProgramfield.setColumns(10);
		
		MemberEmailfield = new JTextField();
		MemberEmailfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		MemberEmailfield.setBounds(563, 253, 143, 20);
		contentPane.add(MemberEmailfield);
		MemberEmailfield.setColumns(10);
		
		MemberAdressfield = new JTextField();
		MemberAdressfield.setBounds(563, 292, 143, 20);
		contentPane.add(MemberAdressfield);
		MemberAdressfield.setColumns(10);
		
		JComboBox ComboBox = new JComboBox();
		ComboBox.setBackground(new Color(25, 25, 112));
		ComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ComboBox.setForeground(new Color(255, 255, 255));
		ComboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Faculty"}));
		ComboBox.setBounds(563, 81, 143, 22);
		contentPane.add(ComboBox);
		
		MemberPhonefield = new JTextField();
		MemberPhonefield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String member_Phone=MemberPhonefield.getText();
				int member_Phonelength=member_Phone.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					if(member_Phonelength==11)
					{
						MemberPhonefield.setEditable(true);
					}
					else
					{
						MemberPhonefield.setEditable(false);
					}
				}else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						MemberPhonefield.setEditable(true);
					}else
					{
						MemberPhonefield.setEditable(false);
					}
				}
				
			}
		});
		
		MemberPhonefield.setBounds(563, 338, 143, 20);
		contentPane.add(MemberPhonefield);
		MemberPhonefield.setColumns(10);
	
	}

}
