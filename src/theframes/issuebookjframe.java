package theframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class issuebookjframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterBookId;
	private JTextField BookIDtextField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issuebookjframe frame = new issuebookjframe();
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
	public issuebookjframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 478);
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
					AdminSearchresultjframe obj= new AdminSearchresultjframe ();
					obj.setVisible(true);
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
					returnbookdetailsjframe frame = new returnbookdetailsjframe();
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
		
		JLabel lblNewLabel_2 = new JLabel("Issue Book");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(476, 41, 149, 33);
		contentPane.add(lblNewLabel_2);
		
		txtEnterBookId = new JTextField();
		txtEnterBookId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String book_ID=txtEnterBookId.getText();
				int book_IDlength=book_ID.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					if(book_IDlength<13)
					{
						txtEnterBookId.setEditable(true);
					}
					else
					{
						txtEnterBookId.setEditable(false);
					}
				}else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						txtEnterBookId.setEditable(true);
					}else
					{
						txtEnterBookId.setEditable(false);
					}
				}
				
			}
		});
		txtEnterBookId.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtEnterBookId.setText("Enter Book ID");
		txtEnterBookId.setBounds(512, 93, 165, 33);
		contentPane.add(txtEnterBookId);
		txtEnterBookId.setColumns(10);
		
		BookIDtextField_3 = new JTextField();
		BookIDtextField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				

				String book_ID=txtEnterBookId.getText();
				int book_IDlength=book_ID.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					if(book_IDlength<13)
					{
						txtEnterBookId.setEditable(true);
					}
					else
					{
						txtEnterBookId.setEditable(false);
					}
				}else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						txtEnterBookId.setEditable(true);
					}else
					{
						txtEnterBookId.setEditable(false);
					}
				}
				
			}
		});
		BookIDtextField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BookIDtextField_3.setBounds(512, 357, 165, 28);
		contentPane.add(BookIDtextField_3);
		BookIDtextField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Member ID");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(393, 355, 90, 28);
		contentPane.add(lblNewLabel_6);
		
		JButton IssueButtonbtnNewButton_1 = new JButton("Issue");
		IssueButtonbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						if(txtEnterBookId.getText().trim().isEmpty()==true||BookIDtextField_3.getText().trim().isEmpty()==true)
						{
							JOptionPane.showMessageDialog(contentPane, "Kindly input data in all field first");
						}
						else
						{
							Book obj=new Book();
							
							JOptionPane.showMessageDialog(contentPane,obj.issueBook(txtEnterBookId.getText(), BookIDtextField_3.getText()));
							
						}
			}
		});
		IssueButtonbtnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		IssueButtonbtnNewButton_1.setForeground(new Color(255, 255, 255));
		IssueButtonbtnNewButton_1.setBackground(new Color(25, 25, 112));
		IssueButtonbtnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		IssueButtonbtnNewButton_1.setBounds(619, 410, 124, 33);
		contentPane.add(IssueButtonbtnNewButton_1);
		JLabel BookIdLabel = new JLabel("");
		BookIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		BookIdLabel.setBounds(369, 201, 239, 20);
		contentPane.add(BookIdLabel);
		
		JLabel BookNameLabel = new JLabel("");
		BookNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		BookNameLabel.setBounds(369, 235, 239, 20);
		contentPane.add(BookNameLabel);
		
		JLabel AuthorNameLabel = new JLabel("");
		AuthorNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AuthorNameLabel.setBounds(369, 285, 239, 20);
		contentPane.add(AuthorNameLabel);
		
		JLabel lblNewLabel_6_1_3_1 = new JLabel("Description:");
		lblNewLabel_6_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1_3_1.setBounds(269, 321, 90, 14);
		contentPane.add(lblNewLabel_6_1_3_1);
		
		JLabel DescriptionLabel = new JLabel("");
		DescriptionLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		DescriptionLabel.setBounds(369, 321, 239, 20);
		contentPane.add(DescriptionLabel);
		
		JLabel lblNewLabel_6_1 = new JLabel("Book ID");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(393, 101, 90, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JButton IssueButtonbtnNewButton_1_1 = new JButton("View Details");
		IssueButtonbtnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book obj=new Book();
				ArrayList<String> data=obj.viewDetails(txtEnterBookId.getText());
				if(data.size()==1)
				{
					JOptionPane.showMessageDialog(contentPane, data.get(0));
				}
				else
				{
					BookIdLabel.setText(data.get(0));
					BookNameLabel.setText(data.get(1));
					AuthorNameLabel.setText(data.get(2));
					
				}
				
				
			}
		});
		IssueButtonbtnNewButton_1_1.setForeground(Color.WHITE);
		IssueButtonbtnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		IssueButtonbtnNewButton_1_1.setBackground(new Color(25, 25, 112));
		IssueButtonbtnNewButton_1_1.setBounds(567, 137, 149, 33);
		contentPane.add(IssueButtonbtnNewButton_1_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Details:");
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_2.setBounds(269, 158, 90, 28);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Book ID:");
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1_1.setBounds(269, 197, 90, 20);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Book Name:");
		lblNewLabel_6_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1_2.setBounds(269, 241, 90, 14);
		contentPane.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("Author Name:");
		lblNewLabel_6_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1_3.setBounds(269, 285, 90, 14);
		contentPane.add(lblNewLabel_6_1_3);
		
		
		
	}
}
