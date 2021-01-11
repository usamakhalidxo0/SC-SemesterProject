package theframes;

import java.awt.BorderLayout;
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
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class returnbookdetailsjframe extends JFrame {

	private JPanel contentPane;
	private JTextField MemberIDtextField;
	private JTextField MemberNametextField_1;
	private JTextField MemberCategorytextField_2;
	private JTextField BookIDtextField_3;
	private JTextField BookNametextField_4;
	private JTextField BookAuthortextField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnbookdetailsjframe frame = new returnbookdetailsjframe();
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
	public returnbookdetailsjframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		Image img1 =new ImageIcon(this.getClass().getResource("/adminhi.jpg")).getImage().getScaledInstance(223,128,Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(img1));
		JLabel deleteBookLabel = new JLabel("New label");
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
		logoutButton.setIcon(new ImageIcon(img9));
		logoutButton.setBounds(82, 399, 87, 33);
		contentPane.add(logoutButton);
		deleteBookLabel.setIcon(new ImageIcon(img3));
		deleteBookLabel.setBounds(2, 298, 70, 60);
		contentPane.add(deleteBookLabel);
		
		JLabel AddmenberLabel = new JLabel("New label");
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
		AddmenberLabel.setBounds(162, 298, 70, 60);
		contentPane.add(AddmenberLabel);
		
		lblNewLabel.setBounds(21, 29, 223, 128);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		Image img2 =new ImageIcon(this.getClass().getResource("/menupicscolor.jpg")).getImage().getScaledInstance(259,443,Image.SCALE_DEFAULT);
		
		JLabel AddbookLabel = new JLabel("New label");
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
		AddbookLabel.setBounds(2, 219, 70, 60);
		contentPane.add(AddbookLabel);
		
		JLabel IssueBookLabel = new JLabel("New label");
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
		IssueBookLabel.setBounds(162, 219, 70, 60);
		contentPane.add(IssueBookLabel);
		
		JLabel searchBookLabel = new JLabel("New label");
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
		searchBookLabel.setBounds(82, 219, 70, 60);
		contentPane.add(searchBookLabel);
		
		JLabel returnBookLabel = new JLabel("New label");
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
		returnBookLabel.setBounds(82, 298, 70, 60);
		contentPane.add(returnBookLabel);
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBackground(new Color(51, 51, 153));
		lblNewLabel_1.setBounds(0, 0, 259, 443);
		contentPane.add(lblNewLabel_1);
		
		JButton Cancelreturnbutton = new JButton("Cancel");
		Cancelreturnbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				returnbookjframe frame = new returnbookjframe();
				frame.setVisible(true);
			}
		});
		Cancelreturnbutton.setBackground(new Color(25, 25, 112));
		Cancelreturnbutton.setForeground(new Color(255, 255, 255));
		Cancelreturnbutton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Cancelreturnbutton.setBounds(278, 392, 89, 40);
		contentPane.add(Cancelreturnbutton);
		
		JButton ReturnButton = new JButton("Return");
		ReturnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Book status changes to available");
			}
		});
		ReturnButton.setBackground(new Color(25, 25, 112));
		ReturnButton.setForeground(new Color(255, 255, 255));
		ReturnButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ReturnButton.setBounds(680, 392, 89, 40);
		contentPane.add(ReturnButton);
		
		JLabel lblNewLabel_3 = new JLabel("Return Book");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(278, 21, 146, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Member Details");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(321, 86, 103, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Member ID");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(351, 131, 112, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Member Name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(351, 166, 112, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Member Category");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(351, 195, 112, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Book Details");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2_1.setBounds(321, 224, 103, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("Book ID");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(351, 265, 73, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Book Name");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(351, 298, 73, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Book Author");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(351, 331, 73, 14);
		contentPane.add(lblNewLabel_9);
		
		MemberIDtextField = new JTextField();
		MemberIDtextField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		MemberIDtextField.setBounds(507, 129, 112, 20);
		contentPane.add(MemberIDtextField);
		MemberIDtextField.setColumns(10);
		
		MemberNametextField_1 = new JTextField();
		MemberNametextField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		MemberNametextField_1.setBounds(507, 164, 112, 20);
		contentPane.add(MemberNametextField_1);
		MemberNametextField_1.setColumns(10);
		
		MemberCategorytextField_2 = new JTextField();
		MemberCategorytextField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		MemberCategorytextField_2.setBounds(507, 193, 112, 20);
		contentPane.add(MemberCategorytextField_2);
		MemberCategorytextField_2.setColumns(10);
		
		BookIDtextField_3 = new JTextField();
		BookIDtextField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BookIDtextField_3.setBounds(507, 259, 112, 20);
		contentPane.add(BookIDtextField_3);
		BookIDtextField_3.setColumns(10);
		
		BookNametextField_4 = new JTextField();
		BookNametextField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BookNametextField_4.setBounds(507, 296, 112, 20);
		contentPane.add(BookNametextField_4);
		BookNametextField_4.setColumns(10);
		
		BookAuthortextField_5 = new JTextField();
		BookAuthortextField_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BookAuthortextField_5.setBounds(507, 329, 112, 20);
		contentPane.add(BookAuthortextField_5);
		BookAuthortextField_5.setColumns(10);
	}

}
