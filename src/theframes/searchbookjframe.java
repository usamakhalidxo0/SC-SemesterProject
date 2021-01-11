package theframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class searchbookjframe extends JFrame {

	private JPanel contentPane;

	private JTextField textFieldidauthorname;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchbookjframe frame = new searchbookjframe();
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
	public searchbookjframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 260, 441);
		Image img1 =new ImageIcon(this.getClass().getResource("/searchbook.png")).getImage().getScaledInstance(254,441,Image.SCALE_DEFAULT);
		
		JLabel lblNewLabel_1 = new JLabel("<");
		lblNewLabel_1.setBounds(0, 0, 30, 30);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
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
		contentPane.setLayout(null);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Search Book");
		lblNewLabel_2.setBounds(43, 71, 159, 73);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setForeground(Color.BLUE);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Search By");
		lblNewLabel_3.setBounds(10, 181, 120, 30);
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel_3);
		
		textFieldidauthorname = new JTextField();
		textFieldidauthorname.setBounds(116, 222, 120, 22);
		textFieldidauthorname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldidauthorname.setForeground(new Color(0, 0, 255));
		textFieldidauthorname.setBackground(new Color(224, 255, 255));
		contentPane.add(textFieldidauthorname);
		textFieldidauthorname.setColumns(10);
		
		JButton searchbtnNewButton = new JButton("Search");
		searchbtnNewButton.setBounds(130, 265, 89, 30);
		searchbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldidauthorname.getText().trim().isEmpty()==true)
				{
					JOptionPane.showMessageDialog(contentPane, "Kindly input data in field first");
				}
				else
				{//show results on the table
					
				}
			}
		});
		searchbtnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		searchbtnNewButton.setForeground(Color.BLUE);
		searchbtnNewButton.setBackground(new Color(65, 105, 225));
		contentPane.add(searchbtnNewButton);
		
		JComboBox searchbycomboBox = new JComboBox();
		searchbycomboBox.setBounds(116, 187, 120, 22);
		searchbycomboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Author"}));
		searchbycomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		searchbycomboBox.setForeground(new Color(255, 255, 255));
		searchbycomboBox.setBackground(new Color(65, 105, 225));
		contentPane.add(searchbycomboBox);
		lblNewLabel.setIcon(new ImageIcon(img1));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Available Results");
		lblNewLabel_4.setBounds(270, 87, 120, 14);
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBackground(new Color(0, 0, 255));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("( )");
		lblNewLabel_5.setBounds(372, 87, 79, 14);
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBackground(new Color(0, 0, 255));
		contentPane.add(lblNewLabel_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(280, 112, 532, 329);
		contentPane.add(scrollPane_1);
		
		JScrollPane searchedbookresultsscrollPane = new JScrollPane();
		scrollPane_1.setViewportView(searchedbookresultsscrollPane);
		searchedbookresultsscrollPane.setBackground(new Color(95, 158, 160));
		
		
		
	}

}
