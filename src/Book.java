import java.sql.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Book {
	private long  bookId;
	private String bookName;
	private String authorName;
	private String Description;
	private boolean status;
	private Connection  con;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Book()
	{
		con=DBMSConnection.establishedConnetion();
	}
	public Book(long bookId,String bookName, String AuthorName, String Description)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=AuthorName;
		this.Description=Description;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public boolean AddBook() 
	{
		try {
				
				String query = " insert into book (idBook, BookName, Author, description, status)"
				        + " values (?, ?, ?, ?, ?)";
				PreparedStatement preparedStmt =con.prepareStatement(query);
				preparedStmt.setLong(1, this.bookId);
			    preparedStmt.setString (2, this.bookName);
			    preparedStmt.setString(3, this.authorName);
		        preparedStmt.setString(4, this.Description);
		        preparedStmt.setBoolean(5, this.status);
			    preparedStmt.execute();
			    System.out.println("successfuly stored");
	      }
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		return true;
	}
	public boolean deleteBook()
	{
		try {
		
		String query = "delete from book where idbook = ?";
	      PreparedStatement preparedStmt = con.prepareStatement(query);
	      preparedStmt.setLong(1,this.bookId);
	      preparedStmt.execute();
	      System.out.println("Delete successfully");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		return true;
	}
	public  String issueBook(String bookId,String enrollement)
	{
		String issuedMessage=null;
		try {
			 if(chekcmembership(enrollement))
			 {
					if(checkbookavailability(bookId))
					{
							if(!isIssued(bookId))
							{
					            java.util.Date date=new java.util.Date();
								java.sql.Date sqlDate=new java.sql.Date(date.getTime());
								
								String query = "update book set status = ? where idBook = ?";
							    PreparedStatement preparedStmt = con.prepareStatement(query);
							    preparedStmt.setBoolean(1, true);
							    preparedStmt.setLong(2, this.bookId);
							    preparedStmt.execute();
							    query = " insert into issuetable(bookId, Enrollement, issueDate)"
									        + " values (?, ?, ?)";
								preparedStmt =this.con.prepareStatement(query);
							    preparedStmt.setString(1, bookId);
								preparedStmt.setString (2, "01-131182-038");
								preparedStmt.setDate(3,sqlDate);
								preparedStmt.execute();
								issuedMessage="Issued";
							}
							else
							{
								issuedMessage="Already issued to someone";
							}
		          }
					else
					{
						issuedMessage="book not Available";
					}
			 }
			else
			{
				issuedMessage="not a library member";	
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		
		return issuedMessage;
	}
	public boolean returnBook(String bookId)
	{
		java.sql.Date sqlDate=null;
		try {
		
            
			
			try{
				
				String query = "SELECT issueDate FROM issuetable where bookId='"+ bookId+"'";
				Statement st = this.con.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next())
				{
					sqlDate=rs.getDate("issueDate");
				}
				System.out.println(sqlDate);
			}
		   catch(Exception ex)
		  {
			System.out.println(ex.getLocalizedMessage());
		  }
			String query = "update book set status = ? where idBook = ?";
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setBoolean(1, false);
		    preparedStmt.setString(2, bookId);
		    preparedStmt.execute();
		    query = "delete from issuetable where bookId = ?";
		    preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString(1,bookId);
		    preparedStmt.execute();
		    System.out.println("Returned");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		
		return true;
	}
	public double calculateFine(java.sql.Date sqlDate)
	{
		java.util.Date date=new java.util.Date();
		java.sql.Date CurrentsqlDate=new java.sql.Date(date.getTime());
		long noOfDaysBetween = ChronoUnit.DAYS.between(sqlDate.toLocalDate(), CurrentsqlDate.toLocalDate());
		System.out.println(noOfDaysBetween);
		return 0.0;
	}
	public boolean chekcmembership(String Enrollement)
	{
		boolean ismember=true;
		
		try {
	
		
		Statement stmt = con.createStatement();
        ResultSet result = null;           
        result = stmt.executeQuery("select Name from member where Enrollement='" + Enrollement+ "'");
        if(!result.isBeforeFirst()){
        	ismember=false;
            System.out.println("No Data Found"); 
        }}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		return ismember;
		
		
	}
	public boolean checkbookavailability(String bookId)
	{
		boolean isAvailable=true;
		try {
	
		
		Statement stmt = con.createStatement();
        ResultSet result = null;           
        result = stmt.executeQuery("select BookName from book where idBook='" + bookId + "'");
        if(!result.isBeforeFirst()){
        	isAvailable=false;
            
        }}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		return isAvailable;
	}
	public boolean isIssued(String bookId)
	{
		boolean isIssued=false;
		try{
				
				String query = "SELECT status FROM book where idBook='"+ bookId+"'";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next())
				{
				  isIssued=rs.getBoolean("status");
				}
				
			}
		   catch(Exception ex)
		  {
			System.out.println(ex.getLocalizedMessage());
		  }
		  return isIssued;
		
	}
	
	
}
