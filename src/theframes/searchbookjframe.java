package theframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

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
import javax.swing.table.DefaultTableModel;

public class searchbookjframe extends JFrame {

	private JPanel contentPane;

	private JTextField textFieldidauthorname;
	private JTable table;
	private JTable table_1;
	
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
		JComboBox searchbycomboBox = new JComboBox();
		searchbycomboBox.setBounds(116, 187, 120, 22);
		searchbycomboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name", "Author"}));
		searchbycomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		searchbycomboBox.setForeground(new Color(255, 255, 255));
		searchbycomboBox.setBackground(new Color(65, 105, 225));
		contentPane.add(searchbycomboBox);
		
		JButton searchbtnNewButton = new JButton("Search");
		searchbtnNewButton.setBounds(130, 265, 89, 30);
		searchbtnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel dtm = (DefaultTableModel)table.getModel();
				  dtm.setRowCount(0);
				if(textFieldidauthorname.getText().trim().isEmpty()==true)
				{
					JOptionPane.showMessageDialog(contentPane, "Kindly input data in field first");
				}
				else
				{
					Book obj=new Book();
				ResultSet rs;
				rs=obj.searchBook(textFieldidauthorname.getText(), searchbycomboBox .getSelectedItem().toString());
				try {
					if(rs==null)
					{
						JOptionPane.showMessageDialog(contentPane,"No result Found");
					}
					else
					{
						try {
							
							
						
						  ResultSetMetaData meta = rs.getMetaData();
						  int numberOfColumns = meta.getColumnCount();
						  int numberOfRows=rs.getRow();
						  
						  
						  System.out.println(numberOfColumns);
						  System.out.println(numberOfRows);
						  int x=0;
						
							        while (rs.next())
							        {
							        	  Object [] rowData = new Object[numberOfColumns];
							        	
						                for (int i = 0; i < rowData.length-1; ++i)
						                {
						                    rowData[i] = rs.getObject(i+1);
						                   x++; 
						                }
						                System.out.println("Access");
						                dtm.addRow(rowData);
						                
							        }
							            
				        	
						  System.out.println(x);
					              //  dtm.addRow(new Object[] {rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4) });
					            
					          
					            
					        
					        
						 }
						catch(Exception ex)
						{
							JOptionPane.showMessageDialog(contentPane,ex.getLocalizedMessage());
						}
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		  }
		
				
			}
		});
		searchbtnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		searchbtnNewButton.setForeground(Color.BLUE);
		searchbtnNewButton.setBackground(new Color(65, 105, 225));
		contentPane.add(searchbtnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 260, 441);
		lblNewLabel.setIcon(new ImageIcon(img1));
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Available Results");
		lblNewLabel_4.setBounds(270, 11, 120, 14);
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBackground(new Color(0, 0, 255));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("( )");
		lblNewLabel_5.setBounds(374, 11, 79, 14);
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBackground(new Color(0, 0, 255));
		contentPane.add(lblNewLabel_5);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Book ID", "Book Name", "Author", "Book Description"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(136);
		table.setBounds(270, 54, 536, 371);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Book ID", "Book Name", "Author Name", "Book Description"},
			},
			new String[] {
				"Book ID", "Book Name", "Author Name", "Book Description"
			}
		));
		table_1.getColumnModel().getColumn(3).setPreferredWidth(104);
		table_1.setBounds(270, 36, 536, 22);
		contentPane.add(table_1);
		
		
		
	}
}
