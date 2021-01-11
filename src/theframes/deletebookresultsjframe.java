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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
public class deletebookresultsjframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField BOOKIDtextField_1;
	private JTextField BookNametextField_2;
	private JTextField BookAuthortextField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletebookresultsjframe frame = new deletebookresultsjframe();
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
	public deletebookresultsjframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 475);
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
		JLabel lblNewLabel_2 = new JLabel("Delete Book");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(293, 11, 133, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Search By");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(366, 58, 89, 33);
		contentPane.add(lblNewLabel_3);
		
		JComboBox SearchbycomboBox = new JComboBox();
		SearchbycomboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Author"}));
		SearchbycomboBox.setForeground(Color.WHITE);
		SearchbycomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		SearchbycomboBox.setBackground(new Color(25, 25, 112));
		SearchbycomboBox.setBounds(500, 60, 148, 28);
		contentPane.add(SearchbycomboBox);
		
		textField = new JTextField();
		textField.setText("ID/Name/Author");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(500, 116, 148, 28);
		contentPane.add(textField);
		
		JButton viewdetailsButton = new JButton("View Details");
		viewdetailsButton.setForeground(Color.WHITE);
		viewdetailsButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		viewdetailsButton.setBackground(new Color(25, 25, 112));
		viewdetailsButton.setBounds(652, 155, 141, 33);
		contentPane.add(viewdetailsButton);
		
		JLabel lblNewLabel_4 = new JLabel("Book Information");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(293, 205, 162, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Book ID");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(349, 265, 77, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Book Name");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(349, 303, 77, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Book Author");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(349, 338, 95, 30);
		contentPane.add(lblNewLabel_7);
		
		BOOKIDtextField_1 = new JTextField();
		BOOKIDtextField_1.setBounds(505, 259, 143, 20);
		contentPane.add(BOOKIDtextField_1);
		BOOKIDtextField_1.setColumns(10);
		
		BookNametextField_2 = new JTextField();
		BookNametextField_2.setBounds(505, 298, 143, 20);
		contentPane.add(BookNametextField_2);
		BookNametextField_2.setColumns(10);
		
		BookAuthortextField_3 = new JTextField();
		BookAuthortextField_3.setBounds(505, 338, 143, 20);
		contentPane.add(BookAuthortextField_3);
		BookAuthortextField_3.setColumns(10);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DeleteButton.setBackground(new Color(25, 25, 112));
		DeleteButton.setForeground(new Color(255, 255, 255));
		DeleteButton.setBounds(680, 389, 89, 33);
		contentPane.add(DeleteButton);
	}

}
