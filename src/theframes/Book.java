package theframes;
import java.sql.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Book {
	private String bookId;
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
	public Book(String bookId,String bookName, String AuthorName, String Description)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=AuthorName;
		this.Description=Description;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
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
	public String AddBook() 
	{
		String addMessage=null;
		try {
				
				String query = " insert into book (idBook, BookName, Author, description, status)"
				        + " values (?, ?, ?, ?, ?)";
				PreparedStatement preparedStmt =con.prepareStatement(query);
				preparedStmt.setString(1, this.bookId);
			    preparedStmt.setString (2, this.bookName);
			    preparedStmt.setString(3, this.authorName);
		        preparedStmt.setString(4, this.Description);
		        preparedStmt.setBoolean(5, this.status);
			    preparedStmt.execute();
			    addMessage="book successfuly Added ";
	      }
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
			addMessage="Book is already added..";
		}
		return addMessage;
	}
	public ArrayList<String> viewDetails(String bookId )
	{
		ArrayList<String> data=new ArrayList<String>();
		
		if(checkbookavailability(bookId))
		{
		try {
			String query = "SELECT idBook,BookName,description FROM book where idBook='"+ bookId+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				data.add(rs.getString("idBook"));
				data.add(rs.getString("BookName"));
				data.add(rs.getString("description"));
				
			}
		
		   
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
			data.add("Book with the specified ID no exist");
		}
		}
		else
		{
			 data.add("Invalid Book ID, No such Book Exist");
		}
		return data;
		
	}
	public ArrayList<String> viewDetailsOfReturnBook(String bookId )
	{
		ArrayList<String> data=new ArrayList<String>();
		
		if(checkbookavailability(bookId))
		{
			if(isIssued(bookId))
			{
		try {
			String query = "SELECT bookId,Enrollement,issueDate FROM issuetable where bookId='"+bookId+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				data.add(rs.getString("bookId"));
				data.add(rs.getString("Enrollement"));
				data.add(rs.getString("issueDate"));
				
			}
		
		   
		}
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
			data.add("Book with the specified ID no exist");
		}
		}
		
		else
		{
			data.add("Book is no Issued to someone");
		}
		}
		else
		{
			 data.add("Invalid Book ID, No such Book Exist");
		}
		return data;
		
	}
public String deleteBook(String bookId)
	{
	try
	{
		if( checkbookavailability(bookId))
		{
		String query = "delete from book where idbook = ?";
	    PreparedStatement preparedStmt = con.prepareStatement(query);
	    preparedStmt.setString(1,bookId);
	    preparedStmt.execute();
	    return "Book Deleted successfully";
		}
		else
		{
			return "Invalid book ID";
		}
  
	}
	catch(Exception ex)
	{
		return "Invalid book ID";
	}
}
	public  String issueBook(String bookId,String enrollement)
	{
		String issuedMessage=null;
		String Categary=null;
		int numberOfIssueBooks=0;
		try {
			 if(chekcmembership(enrollement))
			 {   
				 Categary=getCategary(enrollement);
				 numberOfIssueBooks=getnumberOfIssuedBook(enrollement);
				 System.out.println(numberOfIssueBooks);
				 if(numberOfIssueBooks<4&&Categary.equals("Student")||numberOfIssueBooks<6&&Categary.equals("Faculty"))
				 {
					
						
							if(!isIssued(bookId))
							{
					            java.util.Date date=new java.util.Date();
								java.sql.Date sqlDate=new java.sql.Date(date.getTime());
								
								
								numberOfIssueBooks++;
								String query = "update book set status =1 where idBook ='"+bookId+"' ";
							    PreparedStatement preparedStmt = con.prepareStatement(query);
							    preparedStmt.execute();
							     query = "update member set issuedBooksCount='"+numberOfIssueBooks+"' where Enrollement='"+enrollement+"'";
							     preparedStmt = con.prepareStatement(query);
								 preparedStmt.execute();
							     query = " insert into issuetable(bookId, Enrollement, issueDate)"
									        + " values (?, ?, ?)";
								preparedStmt =this.con.prepareStatement(query);
							    preparedStmt.setString(1, bookId);
								preparedStmt.setString (2, enrollement);
								preparedStmt.setDate(3,sqlDate);
								preparedStmt.execute();
								issuedMessage="Issued";
							}
							else
							{
								issuedMessage="Already issued to someone";
							}
		          
					
				 }else
				 {
					 issuedMessage="no more book can be Issued maximum limit reached."; 
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
	//Return book...
	public String returnBook(String bookId)
	{
		java.sql.Date sqlDate=null;
		String Enrollement=null;
		String returnMessage=null;
		int numberOfissuedBooks=0;
		
		if(checkbookavailability(bookId))
		{
			if(isIssued(bookId))
			{
				try {
				
		            
					
					try{
						
						String query = "SELECT issueDate,Enrollement FROM issuetable where bookId='"+ bookId+"'";
						Statement st = this.con.createStatement();
						ResultSet rs = st.executeQuery(query);
						
						while(rs.next())
						{
							sqlDate=rs.getDate("issueDate");
							Enrollement=rs.getString("Enrollement");
						}
						numberOfissuedBooks=getnumberOfIssuedBook(Enrollement);
						
						numberOfissuedBooks--;
						query = "update member set issuedBooksCount='"+numberOfissuedBooks+"' where Enrollement='"+Enrollement+"'";
						PreparedStatement  preparedStmt = con.prepareStatement(query);
						 preparedStmt.execute();
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
				    double fine=calculateFine(sqlDate,getCategary(Enrollement));
				    if(fine==0)
				    {
				    	returnMessage="Book Successfuly Returned";
				    }
				    else
				    {
				    	returnMessage="Book Sccuessfuly Returned and Fine charges due to late return are:: "+fine;
				    }
				}
				catch(Exception ex)
				{
					System.out.println(ex.getLocalizedMessage());
				}
			}
			else
			{
				returnMessage="Book is not issued to someone";
			}
	     }
		else
		{
			returnMessage="Book not found in the library. Please Enter a valid IBN";
		}
		
		return returnMessage;
	}
	public double calculateFine(java.sql.Date sqlDate,String categary)
	{
		double fine=0.0;
		java.util.Date date=new java.util.Date();
		java.sql.Date CurrentsqlDate=new java.sql.Date(date.getTime());
		long noOfDaysBetween = ChronoUnit.DAYS.between(sqlDate.toLocalDate(), CurrentsqlDate.toLocalDate());
		if(noOfDaysBetween>7&& categary.equals("Student"))
		{
			fine=(noOfDaysBetween-7)*10;
		}
		else if(noOfDaysBetween>30&& categary.equals("Faculty"))
		{
			fine=(noOfDaysBetween-30)*10;
		}
		System.out.println(noOfDaysBetween);
		return fine;
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
	public String getCategary(String memberId)
	{
		String categary=null;
		try{
			
			String query = "SELECT Categary FROM member where Enrollement='"+ memberId+"'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				categary=rs.getString("Categary");
			}
			
		}
	   catch(Exception ex)
	  {
		System.out.println(ex.getLocalizedMessage());
	  }
		
		return categary; 
	}
	public int getnumberOfIssuedBook(String memberId)
	{
		int numberofIssuedBook=1;
		try{
			
			String query = "SELECT issuedBooksCount FROM member where Enrollement='"+ memberId+"'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				numberofIssuedBook=rs.getInt("issuedBooksCount");
			}
			
		}
	   catch(Exception ex)
	  {
		System.out.println(ex.getLocalizedMessage());
	  }
		
		return numberofIssuedBook; 
	}
	public ResultSet searchBook(String parmeter, String searchBy)
	{
			ResultSet rs=null;
			try{
				if(searchBy=="ID")
				{
					String query = "select *from book where idBook='"+parmeter+"'";
					Statement st = con.createStatement();
				     rs = st.executeQuery(query);
				     //testResultSet(rs);
					
				}
				else if(searchBy=="Name")
				{
					String query = "select *from book where BookName='"+parmeter+"'";
					Statement st = con.createStatement();
				    rs = st.executeQuery(query);
				    
				    
				}
				else if(searchBy=="Author")
				{
						
					String query = "select *from book where Author='"+parmeter+"'";
					Statement st = con.createStatement();
				    rs = st.executeQuery(query);
				   // testResultSet(rs);
				}
			  }
				catch(Exception ex)
				{
					System.out.println(ex.getLocalizedMessage());
				}
			//testResultSet(rs);
		
		return rs;
		
	}
	public void testResultSet(ResultSet res)
	{
        try{
            while(res.next()){
                System.out.println("Book ID: "+ res.getString("idBook"));
                System.out.println("Book Name: "+ res.getString("BookName"));
                System.out.println("Author Name: "+ res.getString("Author"));
                System.out.println("Description: "+ res.getString("description"));
                System.out.println("Description: "+ res.getString("status"));
            }        
        }
        catch(Exception e){
            e.printStackTrace();
        }
	}
	
}
