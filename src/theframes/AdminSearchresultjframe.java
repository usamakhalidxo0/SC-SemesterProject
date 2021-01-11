package theframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class AdminSearchresultjframe extends JFrame {

	private JPanel contentPane;
	private JTextField idnameauhtortextField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSearchresultjframe frame = new AdminSearchresultjframe();
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
	public AdminSearchresultjframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 478);
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
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
		btnNewButton.setIcon(new ImageIcon(img9));
		btnNewButton.setBounds(82, 399, 87, 33);
		contentPane.add(btnNewButton);
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
		
		JLabel lblNewLabel_2 = new JLabel("Search Book");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(289, 11, 133, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Search By");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(397, 76, 89, 33);
		contentPane.add(lblNewLabel_3);
		
		JComboBox searchbycomboBox = new JComboBox();
		searchbycomboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Author"}));
		searchbycomboBox.setForeground(Color.WHITE);
		searchbycomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		searchbycomboBox.setBackground(new Color(25, 25, 112));
		searchbycomboBox.setBounds(537, 78, 148, 28);
		contentPane.add(searchbycomboBox);
		
		idnameauhtortextField = new JTextField();
		idnameauhtortextField.setText("ID/Name/Author");
		idnameauhtortextField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		idnameauhtortextField.setColumns(10);
		idnameauhtortextField.setBounds(537, 137, 148, 28);
		contentPane.add(idnameauhtortextField);
		
		JButton SearchbtnNewButton_1 = new JButton("Search");
		SearchbtnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(idnameauhtortextField.getText().trim().isEmpty()==true)
				{
					JOptionPane.showMessageDialog(contentPane, "Kindly enter data in filed first");
				}
				else
				{
				deletebookresultsjframe frame = new deletebookresultsjframe();
				frame.setVisible(true);
				dispose();//show data in table
				
				}
			}
		});
		SearchbtnNewButton_1.setForeground(Color.WHITE);
		SearchbtnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		SearchbtnNewButton_1.setBackground(new Color(25, 25, 112));
		SearchbtnNewButton_1.setBounds(682, 181, 89, 33);
		contentPane.add(SearchbtnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Available Results");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_4.setBounds(300, 219, 122, 22);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane searchedbookresultsscrollPane = new JScrollPane();
		searchedbookresultsscrollPane.setBounds(310, 260, 461, 168);
		contentPane.add(searchedbookresultsscrollPane);
		
		table = new JTable();
		searchedbookresultsscrollPane.setViewportView(table);
	}
}
