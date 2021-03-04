package theframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

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
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class returnbookdetailsjframe extends JFrame {

	private JPanel contentPane;
	private JTextField BookIDtextField_3;

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
		JLabel BookName = new JLabel("");
		BookName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		BookName.setBounds(512, 202, 73, 14);
		contentPane.add(BookName);
		
		JLabel IssueTO = new JLabel("");
		IssueTO.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		IssueTO.setBounds(512, 254, 73, 14);
		contentPane.add(IssueTO);
		
		JLabel IsuueData = new JLabel("");
		IsuueData.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		IsuueData.setBounds(512, 310, 74, 14);
		contentPane.add(IsuueData);
		JLabel BookNameLabel = new JLabel("");
		BookNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		BookNameLabel.setBounds(434, 193, 230, 33);
		contentPane.add(BookNameLabel);
		
		JLabel IssuedToLabel = new JLabel("");
		IssuedToLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		IssuedToLabel.setBounds(434, 242, 230, 33);
		contentPane.add(IssuedToLabel);
		
		JLabel IssuedDateLabel = new JLabel("");
		IssuedDateLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		IssuedDateLabel.setBounds(434, 298, 230, 33);
		contentPane.add(IssuedDateLabel);
		JButton ReturnButton = new JButton("Return");
		ReturnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BookIDtextField_3.getText().trim().isEmpty()==true)
				{
					JOptionPane.showMessageDialog(contentPane, "Kindly input all fields");
				}else {
					Book obj=new Book();
					String message=obj.returnBook(BookIDtextField_3.getText());
					
				JOptionPane.showMessageDialog(contentPane, message);
				BookNameLabel.setText(null);
				IssuedToLabel.setText(null);
				IssuedDateLabel.setText(null);
				
				}
				BookIDtextField_3.setEditable(true);
				
			}
		});
		ReturnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				}
		});
		ReturnButton.setBackground(new Color(25, 25, 112));
		ReturnButton.setForeground(new Color(255, 255, 255));
		ReturnButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ReturnButton.setBounds(702, 394, 89, 40);
		contentPane.add(ReturnButton);
		
		JLabel lblNewLabel_3 = new JLabel("Return Book");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(278, 21, 146, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Details");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2_1.setBounds(338, 169, 103, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("Book ID");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(331, 85, 73, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Book Name:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(351, 202, 73, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Issued To: ");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(351, 253, 73, 14);
		contentPane.add(lblNewLabel_9);
		
		BookIDtextField_3 = new JTextField();
		BookIDtextField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String book_ID=BookIDtextField_3.getText();
				int book_IDlength=book_ID.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					if(book_IDlength<13)
					{
						BookIDtextField_3.setEditable(true);
					}
					else
					{
						BookIDtextField_3.setEditable(false);
					}
				}else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						BookIDtextField_3.setEditable(true);
					}else
					{
						BookIDtextField_3.setEditable(false);
					}
				}
				
			}
		});
		BookIDtextField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BookIDtextField_3.setBounds(441, 70, 223, 33);
		contentPane.add(BookIDtextField_3);
		BookIDtextField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Issued Date:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(350, 309, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		
		JButton ViewDetail = new JButton("View Details");
		ViewDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book obj=new Book();
				ArrayList<String> data=obj.viewDetailsOfReturnBook(BookIDtextField_3.getText());
				if(data.size()==1)
				{
					JOptionPane.showMessageDialog(contentPane,data.get(0) );
				}
				else
				{
					BookNameLabel.setText(data.get(0));
					IssuedToLabel.setText(data.get(1));
					IssuedDateLabel.setText(data.get(2));
					
					
					
				}
				BookIDtextField_3.setEditable(true);
			}
		});
		ViewDetail.setForeground(Color.WHITE);
		ViewDetail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ViewDetail.setBackground(new Color(25, 25, 112));
		ViewDetail.setBounds(544, 114, 120, 40);
		contentPane.add(ViewDetail);
		
		
		
	}
}
